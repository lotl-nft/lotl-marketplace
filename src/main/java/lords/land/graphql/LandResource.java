package lords.land.graphql;

import lords.land.model.Land;
import lords.land.repository.LandRepository;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

import javax.inject.Inject;
import java.util.List;

@GraphQLApi
public class LandResource {

    @Inject
    LandRepository repository;

    @Query("allLands")
    @Description("Get all lands")
    public List<Land> getAllLands(Integer page, Integer pageSize) {
        return repository.find(page, pageSize);
    }

    @Query("allLandsWithAttribute")
    @Description("Get all Lands with attribute")
    public List<Land> getAllLandsWithAttribute(String attribute, Integer page, Integer pageSize) {
        return repository.listWithAttribute(attribute, page, pageSize);
    }
}
