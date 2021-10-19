package lords.land.graphql;

import lords.land.model.Hero;
import lords.land.repository.HeroRepository;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;
import org.eclipse.microprofile.graphql.Description;

import javax.inject.Inject;
import java.util.List;

@GraphQLApi
public class HeroResource {

    @Inject
    HeroRepository repository;

    @Query("allHeroes")
    @Description("Get all Films from a galaxy far far away")
    public List<Hero> getAllFilms() {
        return repository.find();
    }

}
