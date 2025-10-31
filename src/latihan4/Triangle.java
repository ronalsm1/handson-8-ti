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
        super("Triangle", "Merah");
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
        System.out.println("Menghitung luas segitiga");
        return 0.5 * base * height;
    }

    // Override hitungKeliling
    @Override
    public double hitungKeliling() {
        // TODO: Return sideA + sideB + sideC
        System.out.println("Menghitung keliling segitiga");
        return sideA + sideB + sideC;
    }

    // Override scale
    @Override
    public void scale(double factor) {
        // TODO: Scale all dimensions
        System.out.println("Penskalaan base: " + base * factor);
        System.out.println("Penskalaan height: " + height * factor);
        System.out.println("Penskalaan sideA: " + sideA * factor);
        System.out.println("Penskalaan sideB: " + sideB * factor);
        System.out.println("Penskalaan sideC: " + sideC * factor);
    }
}

