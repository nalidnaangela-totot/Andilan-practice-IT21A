// Abstract class: you cannot create an object of Shape directly
abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    // Abstract method: no body, each child decides how to compute it
    public abstract double computeArea();

    // Regular method: same for every shape
    public void displayName() {
        System.out.println("Shape: " + name);
    }
}

// Child class 1
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return 3.14159 * radius * radius;
    }
}

// Child class 2
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double computeArea() {
        return length * width;
    }
}

public class abstractionDemo {
    public static void main(String[] args) {
        // Shape s = new Shape("Test"); // ERROR: abstract class cannot be instantiated

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        System.out.println("=== Circle ===");
        circle.displayName();
        System.out.println("Area: " + circle.computeArea());

        System.out.println();
        System.out.println("=== Rectangle ===");
        rectangle.displayName();
        System.out.println("Area: " + rectangle.computeArea());
    }
}
