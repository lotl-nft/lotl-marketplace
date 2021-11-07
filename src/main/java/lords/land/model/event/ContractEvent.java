package lords.land.model.event;

import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MongoEntity(collection = "contract-events")
public class ContractEvent {
    String id;
    String type;
    EventDetail details;
    Integer retries;
}
