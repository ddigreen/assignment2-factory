package logistics;

public final class Truck implements Transport {
    private final int capacityKg;
    public Truck(int capacityKg) { this.capacityKg = capacityKg; }
    @Override public String deliver(String destination) {
        return "Delivering by road truck (" + capacityKg + " kg) to " + destination;
    }
}
