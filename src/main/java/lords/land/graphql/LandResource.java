package lords.land.graphql;

import lords.land.model.Land;
import lords.land.repository.LandRepository;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;
import org.eclipse.microprofile.graphql.Description;

import javax.inject.Inject;
import java.util.List;

@GraphQLApi
public class LandResource {

    @Inject
    LandRepository repository;

    @Query("allLands")
    @Description("Get all Films from a galaxy far far away")
    public List<Land> getAllLands() {
        return repository.find();
    }

    @Query("allLandsWithAttribute")
    @Description("Get all Films from a galaxy far far away")
    public List<Land> getAllLandsWithAttribute(String attribute) {
        return repository.listWithAttribute(attribute);
    }
}
