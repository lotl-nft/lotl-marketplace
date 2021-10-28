package lords.land.contract;

import lombok.extern.slf4j.Slf4j;
import lords.land.repository.TokenRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@Slf4j
@ApplicationScoped
public class ContractProcessing {

    @Inject
    TokenRepository tokenRepository;

    public void handlingListingEvent() {
        log.info("handlingListingEvent");
    }

    public void handlingBuyEvent() {
        log.info("handlingBuyEvent");
        tokenRepository.minusToken();
    }
}
