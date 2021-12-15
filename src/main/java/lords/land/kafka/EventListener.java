package lords.land.kafka;

import lombok.extern.slf4j.Slf4j;
import lords.land.contract.ContractProcessing;
import lords.land.enumrable.EventName;
import lords.land.model.event.ContractEvent;
//import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@Slf4j
@ApplicationScoped
public class EventListener {

    @Inject
    ContractProcessing contractProcessing;

//    @Incoming("contract-events")
    public void consume(ContractEvent contractEvent) {
        log.info("Consuming: {}", contractEvent.getId());
        if (contractEvent.getDetails().getName().equals(EventName.LISTING.getName())) {
            contractProcessing.handlingListingEvent(contractEvent);
        }

        if (contractEvent.getDetails().getName().equals(EventName.PURCHASE.getName())) {
            contractProcessing.handlingPurchaseEvent(contractEvent);
        }

    }

}
