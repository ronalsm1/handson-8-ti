package latihan4;

import java.awt.dnd.DragSourceAdapter;

public class Circle extends Shape {
    // Properties
    private double radius;
    private static final double PI = 3.14159;

    // Constructor
    public Circle(String warna, double radius) {
        // TODO: Call super dengan nama "Circle"
        super("Circle", warna);
        // TODO: Set radius
        this.radius = radius;
    }

    // Override hitungLuas
    @Override
    public double hitungLuas() {
        // TODO: Return PI * radius * radius
        return PI * radius * radius;
    }

    // Override hitungKeliling
    @Override
    public double hitungKeliling() {
        // TODO: Return 2 * PI * radius
        return 2 * PI * radius;
    }

    // Override scale
    @Override
    public void scale(double factor) {
        // TODO: Multiply radius by factor
        radius *= factor;
    }

    // Getter
    public double getRadius() {
        return radius;
    }
}

