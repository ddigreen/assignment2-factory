package gui;

public final class LinuxFactory implements GUIFactory {
    @Override public Button createButton() { return new LinuxButton(); }
    @Override public Checkbox createCheckbox() { return new LinuxCheckbox(); }
}
