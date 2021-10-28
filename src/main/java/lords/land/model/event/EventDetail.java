package lords.land.model.event;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EventDetail {
    String name;
    String filterId;
    String nodeName;
    List<JsonNode> indexedParameters;
    List<JsonNode> nonIndexedParameters;
    String transactionHash;
    Integer logIndex;
    Long blockNumber;
    String blockHash;
    String address;
    String status;
    String eventSpecificationSignature;
    String networkName;
    Long timestamp;
    String id;
}
