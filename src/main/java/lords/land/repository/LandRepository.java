package lords.land.repository;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import lords.land.model.Land;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class LandRepository implements PanacheMongoRepository<Land> {

    public List<Land> find() {
        return listAll();
    }

    public List<Land> listWithAttribute(String attribute) {
        return list("attribute", attribute.toUpperCase());
    }
}