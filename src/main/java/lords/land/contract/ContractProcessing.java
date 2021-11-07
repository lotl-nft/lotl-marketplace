package lords.land.contract;

import lombok.extern.slf4j.Slf4j;
import lords.land.model.event.ContractEvent;
import lords.land.repository.ContractEventRepository;
import lords.land.repository.TokenRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@Slf4j
@ApplicationScoped
public class ContractProcessing {

    @Inject
    TokenRepository tokenRepository;

    @Inject
    ContractEventRepository contractEventRepository;

    public void handlingListingEvent(ContractEvent contractEvent) {
        log.info("handlingListingEvent");
    }

    public void handlingPurchaseEvent(ContractEvent contractEvent) {
        log.info("handlingPurchaseEvent");
        contractEventRepository.add(contractEvent);
    }
}
