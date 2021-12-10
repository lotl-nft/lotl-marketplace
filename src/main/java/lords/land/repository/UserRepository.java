package lords.land.repository;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import lombok.extern.slf4j.Slf4j;
import lords.land.enumrable.UserStatus;
import lords.land.model.Auth;
import lords.land.model.Land;
import lords.land.model.UserEntity;
import lords.land.utils.AuthUtils;
import org.springframework.security.crypto.bcrypt.BCrypt;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.Objects;

@Slf4j
@ApplicationScoped
public class UserRepository implements PanacheMongoRepository<UserEntity> {

    public Auth authWithUsernamePassword(String username, String password) {
        UserEntity userEntity = find("username", username).firstResult();
        if(!validateUser(userEntity))
            return new Auth();
        if(!BCrypt.checkpw(password, userEntity.getPassword()))
            return new Auth();;
        return generateAuthResource(userEntity);
    }

    public Auth authWithMetamaskToken(String token) {
        String contractAddress = AuthUtils.getContractAddressFromMetamask(token);
        UserEntity userEntity = find("contractAddress", contractAddress).firstResult();
        // TODO: if user does not have account, create for them!
        if(!validateUser(userEntity))
            return new Auth();
        return generateAuthResource(userEntity);
    }

    private boolean validateUser(UserEntity userEntity) {
        if(Objects.isNull(userEntity))
            return false;
        if(userEntity.getStatus() != UserStatus.ACTIVE.getStatus())
            return false;
        return true;
    }

    private Auth generateAuthResource(UserEntity userEntity) {
        Auth auth = new Auth();
        String token = AuthUtils.generateJwtToken(userEntity);
        auth.setUsername(userEntity.getUsername());
        auth.setJwtToken(token);
        return auth;
    }
}