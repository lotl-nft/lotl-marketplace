package lords.land.repository;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import lords.land.model.event.ContractEvent;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ContractEventRepository implements PanacheMongoRepository<ContractEvent> {

    public void add(ContractEvent contractEvent) {
        persist(contractEvent);
    }

}