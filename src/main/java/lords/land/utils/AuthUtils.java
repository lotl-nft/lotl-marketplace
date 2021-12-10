package lords.land.utils;

import lords.land.model.UserEntity;
import org.springframework.security.crypto.bcrypt.BCrypt;

public class AuthUtils {

    public static String generateJwtToken(UserEntity userEntity) {
        return "";
    }

    public static String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public static String getContractAddressFromMetamask(String token) {
        return "";
    }
}
