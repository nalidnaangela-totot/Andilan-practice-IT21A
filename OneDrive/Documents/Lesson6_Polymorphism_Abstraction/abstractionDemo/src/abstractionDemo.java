// Abstract class: you cannot create an object of Appliance directly
abstract class Appliance {
    protected String brand;
    protected boolean isPluggedIn = false;

    public Appliance(String brand) {
        this.brand = brand;
    }

    // Abstract method: no body, each child decides how it works
    public abstract void operate();

    // Regular method: same for every appliance
    public void plugIn() {
        isPluggedIn = true;
        System.out.println(brand + " is now plugged in.");
    }

    // Regular method
    public void unplug() {
        isPluggedIn = false;
        System.out.println(brand + " is unplugged.");
    }
}

// Child class 1
class ElectricFan extends Appliance {
    public ElectricFan(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println(brand + " fan spins and blows cool air.");
    }
}

// Child class 2
class RiceCooker extends Appliance {
    public RiceCooker(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println(brand + " rice cooker heats the pot and cooks the rice.");
    }
}

public class abstractionDemo {
    public static void main(String[] args) {
        // Appliance a = new Appliance("Test"); // ERROR: abstract class cannot be instantiated

        ElectricFan fan = new ElectricFan("Hanabishi");
        RiceCooker cooker = new RiceCooker("Imarflex");

        System.out.println("=== Electric Fan ===");
        fan.plugIn();
        fan.operate();
        fan.unplug();

        System.out.println();
        System.out.println("=== Rice Cooker ===");
        cooker.plugIn();
        cooker.operate();
        cooker.unplug();
    }
}