package lords.land.e;

public enum LandAttribute {
    METAL(1),
    WOOD(2),
    WATER(3),
    FIRE(4),
    EARTH(5),
    ;

    private final int attribute;

    LandAttribute(int attribute) {
        this.attribute = attribute;
    }

    public int getAttribute() {
        return attribute;
    }
}
