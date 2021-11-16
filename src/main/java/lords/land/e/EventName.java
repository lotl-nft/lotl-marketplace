package lords.land.e;

public enum EventName {
    PURCHASE("PurchaseEvent"),
    LISTING("ListingEvent")
    ;

    private final String name;
    EventName(String name) {
        this.name = name;
    }

    public String getName() { return this.name; }
}
