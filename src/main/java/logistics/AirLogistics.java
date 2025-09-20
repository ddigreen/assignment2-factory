package logistics;

public final class AirLogistics extends Logistics {
    @Override protected Transport createTransport() { return new Plane(60); }
}
