package lords.land.e;

public enum EventName {
    PURCHASE("Purchase"),
    LISTING("Listing")
    ;

    private final String name;
    EventName(String name) {
        this.name = name;
    }

    public String getName() { return this.name; }
}
