package lords.land.repository;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import lords.land.model.Land;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class LandRepository implements PanacheMongoRepository<Land> {

    public List<Land> find(Integer page, Integer pageSize) {
        return find("{attribute: { $exists: true }}").page(page, pageSize).list();
    }

    public List<Land> listWithAttribute(String attribute, Integer page, Integer pageSize) {
        return find("attribute", attribute.toUpperCase()).page(page, pageSize).list();
    }
}