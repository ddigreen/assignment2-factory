package gui;

public final class MacButton implements Button {
    @Override public void click() { }
    @Override public String render() { return "[MacButton] Plan Delivery"; }
}
public final class MacCheckbox implements Checkbox {
    private boolean checked;
    @Override public void toggle() { checked = !checked; }
    @Override public String render() { return "[MacCheckbox] Insurance=" + checked; }
}
