package gui;

public final class WinButton implements Button {
    @Override public void click() { }
    @Override public String render() { return "[WinButton] Plan Delivery"; }
}
public final class WinCheckbox implements Checkbox {
    private boolean checked;
    @Override public void toggle() { checked = !checked; }
    @Override public String render() { return "[WinCheckbox] Insurance=" + checked; }
}
