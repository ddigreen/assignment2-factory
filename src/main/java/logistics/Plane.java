package logistics;

public final class Plane implements Transport {
    private final int pallets;
    public Plane(int pallets) { this.pallets = pallets; }
    @Override public String deliver(String destination) {
        return "Delivering by air cargo plane (" + pallets + " pallets) to " + destination;
    }
}
