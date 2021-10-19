package lords.land.repository;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import lords.land.model.Hero;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class HeroRepository implements PanacheMongoRepository<Hero> {

    public List<Hero> find() {
        return list("title", "testing");
    }
}
