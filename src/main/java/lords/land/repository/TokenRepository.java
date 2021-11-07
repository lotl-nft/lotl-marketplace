package lords.land.repository;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import lords.land.TokenConfig;
import lords.land.model.Token;

import org.bson.types.ObjectId;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class TokenRepository implements PanacheMongoRepository<Token> {

    @Inject
    TokenConfig tokenConfig;

    public void minusToken() {
        Token token = findById(new ObjectId(tokenConfig.id()));
        token.setQuantity(token.getQuantity() - 1);
        update(token);
    }

}