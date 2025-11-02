package latihan4;

public class Rectangle extends Shape {
    // Properties
    protected double panjang;
    protected double lebar;

    // Constructor
    public Rectangle(String warna, double panjang, double lebar) {
        // TODO: Implementasi
        super("Rectangle", warna);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Override hitungLuas
    @Override
    public double hitungLuas() {
        // TODO: Return panjang * lebar
        return panjang * lebar;
    }

    // Override hitungKeliling
    @Override
    public double hitungKeliling() {
        // TODO: Return 2 * (panjang + lebar)
        return 2 * (panjang + lebar);
    }

    // Override scale
    @Override
    public void scale(double factor) {
        // TODO: Multiply both dimensions by factor
        panjang *= factor;
        lebar *= factor;
    }
}

