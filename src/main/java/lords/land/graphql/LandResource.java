package lords.land.graphql;

import lombok.extern.slf4j.Slf4j;
import lords.land.model.Land;
import lords.land.repository.LandRepository;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;
import org.eclipse.microprofile.jwt.Claim;
import org.eclipse.microprofile.jwt.Claims;
import org.eclipse.microprofile.jwt.JsonWebToken;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import java.util.List;
import java.util.Objects;

@Slf4j
@GraphQLApi
public class LandResource {

    @Inject
    LandRepository repository;

    @Inject
    JsonWebToken jwt;

    @Inject
    @Claim(standard = Claims.preferred_username)
    String username;

    @Query("allLands")
    @Description("Get all lands")
    @PermitAll
//    @RolesAllowed({ "User" })
    public List<Land> getAllLands(Integer page, Integer pageSize) {
        log.info("Username: {}", username);
        return repository.find(page, pageSize);
    }

    @Query("allLandsWithAttribute")
    @Description("Get all Lands with attribute")
    @PermitAll
    public List<Land> getAllLandsWithAttribute(String attribute, Integer page, Integer pageSize) {
        return repository.listWithAttribute(attribute, page, pageSize);
    }
}
