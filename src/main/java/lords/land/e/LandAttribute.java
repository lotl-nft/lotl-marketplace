package lords.land.e;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public enum LandAttribute {
    METAL(1),
    WOOD(2),
    WATER(3),
    FIRE(4),
    EARTH(5),
    ;

    private final Integer attribute;

    private static final Map<Integer, LandAttribute> ENUM_MAP;

    LandAttribute(Integer attribute) {
        this.attribute = attribute;
    }

    public Integer getAttribute() {
        return attribute;
    }

    static {
        Map<Integer, LandAttribute> map = new ConcurrentHashMap<>();
        for (LandAttribute attribute : LandAttribute.values()) {
            map.put(attribute.getAttribute(), attribute);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }

    public static LandAttribute get(Integer attribute) {
        return ENUM_MAP.get(attribute);
    }
}
