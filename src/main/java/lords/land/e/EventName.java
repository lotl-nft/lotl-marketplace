package lords.land.e;

public enum EventName {
    BUY("Buy"),
    LISTING("Listing")
    ;

    private final String name;
    EventName(String name) {
        this.name = name;
    }

    public String getName() { return this.name; }
}
