package logistics;

/** Creator in Factory Method. */
public abstract class Logistics {
    protected abstract Transport createTransport();
    public final String planDelivery(String destination) {
        Transport t = createTransport();
        return t.deliver(destination);
    }
}
