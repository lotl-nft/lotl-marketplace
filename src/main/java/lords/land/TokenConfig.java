package lords.land;

import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithName;

@ConfigMapping(prefix = "token")
public interface TokenConfig {

    @WithName("id")
    String id();

}