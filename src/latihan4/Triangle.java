package latihan4;

public class Triangle extends Shape {
    // Properties
    private double base;
    private double height;
    private double sideA;
    private double sideB;
    private double sideC;

    // Constructor
    public Triangle(String warna, double base, double height,
                    double sideA, double sideB, double sideC) {
        // TODO: Implementasi
        super("Triangle", warna);
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // Override hitungLuas
    @Override
    public double hitungLuas() {
        // TODO: Return 0.5 * base * height
        return 0.5 * base * height;
    }

    // Override hitungKeliling
    @Override
    public double hitungKeliling() {
        // TODO: Return sideA + sideB + sideC
        return sideA + sideB + sideC;
    }

    // Override scale
    @Override
    public void scale(double factor) {
        // TODO: Scale all dimensions
        base *= factor;
        height *= factor;
        sideA *= factor;
        sideB *= factor;
        sideC *= factor;
    }
}

