package lords.land.repository;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import lords.land.model.Land;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LandRepository implements PanacheMongoRepository<Land> {
}
