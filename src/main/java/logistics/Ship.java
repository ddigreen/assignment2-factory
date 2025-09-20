package logistics;

public final class Ship implements Transport {
    private final int containers;
    public Ship(int containers) { this.containers = containers; }
    @Override public String deliver(String destination) {
        return "Delivering by sea ship (" + containers + " containers) to " + destination;
    }
}
