package lords.land.graphql;

import lords.land.model.Auth;
import lords.land.repository.UserRepository;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

import javax.inject.Inject;

@GraphQLApi
public class AuthResource {

    @Inject
    UserRepository repository;

    @Query("loginWithUsernamePassword")
    @Description("Login and retrieve JWT token")
    public Auth loginWithUsernamePassword(String username, String password) {
        return repository.authWithUsernamePassword(username, password);
    }

    @Query("loginWithMetamask")
    @Description("Login with Metamask token")
    public Auth loginWithMetamask(String token) {
        return repository.authWithMetamaskToken(token);
    }
}
