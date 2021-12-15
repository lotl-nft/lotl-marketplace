package lords.land.repository;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import lords.land.mapper.LandMapper;
import lords.land.model.Land;
import lords.land.entity.LandEntity;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class LandRepository implements PanacheMongoRepository<LandEntity> {

    public List<Land> find(Integer page, Integer pageSize) {
        // return find("{attribute: { $exists: true }}").page(page, pageSize).list();
        return find("{attribute: { $exists: true }}").list().stream()
            .map(LandMapper.INSTANCE::landEntityToLand)
            .collect(Collectors.toList());
    }

    public List<Land> listWithAttribute(String attribute, Integer page, Integer pageSize) {
        // return find("attribute", attribute.toUpperCase()).page(page, pageSize).list();
        return null;
    }
}