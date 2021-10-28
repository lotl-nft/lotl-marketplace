package lords.land.model.event;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContractEvent {
    String id;
    String type;
    EventDetail details;
    Integer retries;
}
