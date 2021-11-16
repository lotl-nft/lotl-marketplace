package lords.land.enumrable;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public enum LandStatus {
    SOLD(0),
    SELLING(1),
    BLOCKED(2),
    ;

    private final Integer status;

    public Integer getStatus() { return this.status; }

    private static final Map<Integer, LandStatus> ENUM_MAP;

    LandStatus(Integer status) {
        this.status = status;
    }

    static {
        Map<Integer, LandStatus> map = new ConcurrentHashMap<>();
        for (LandStatus status : LandStatus.values()) {
            map.put(status.getStatus(), status);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }

    public static LandStatus get(Integer status) {
        return ENUM_MAP.get(status);
    }
}
