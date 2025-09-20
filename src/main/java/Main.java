import gui.*;
import logistics.*;

/**
 * Application layer that composes:
 *  - Abstract Factory (GUI family per platform)
 *  - Factory Method (Logistics per transport type)
 *
 * CLI: args[0]=platform (win|mac|linux), args[1]=mode (road|sea|air), args[2]=destination.
 */
public final class Main {
    public static void main(String[] args) {
        String platform = (args.length > 0) ? args[0] : "win";
        String mode = (args.length > 1) ? args[1] : "sea";
        String destination = (args.length > 2) ? args[2] : "Singapore Port";

        GUIFactory ui = selectFactory(platform);
        Logistics logistics = selectLogistics(mode);

        Button button = ui.createButton();
        Checkbox checkbox = ui.createCheckbox();
        checkbox.toggle(); // simulate user turning on insurance

        String plan = logistics.planDelivery(destination);

        System.out.println("=== Logistics Planner ===");
        System.out.println(button.render());
        System.out.println(checkbox.render());
        System.out.println("Result: " + plan);
    }

    private static GUIFactory selectFactory(String platform) {
        switch (platform.toLowerCase()) {
            case "mac": return new MacFactory();
            case "linux": return new LinuxFactory();
            default: return new WinFactory();
        }
    }

    private static Logistics selectLogistics(String mode) {
        switch (mode.toLowerCase()) {
            case "road": return new RoadLogistics();
            case "air": return new AirLogistics();
            default: return new SeaLogistics();
        }
    }
}
