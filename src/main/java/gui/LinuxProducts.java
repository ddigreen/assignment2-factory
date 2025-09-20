package gui;

public final class LinuxButton implements Button {
    @Override public void click() { }
    @Override public String render() { return "[LinuxButton] Plan Delivery"; }
}
public final class LinuxCheckbox implements Checkbox {
    private boolean checked;
    @Override public void toggle() { checked = !checked; }
    @Override public String render() { return "[LinuxCheckbox] Insurance=" + checked; }
}
