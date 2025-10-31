package latihan4;

public class Rectangle extends Shape {
    // Properties
    protected double panjang;
    protected double lebar;

    // Constructor
    public Rectangle(String warna, double panjang, double lebar) {
        // TODO: Implementasi
        super("Rectangle", "Biru");
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Override hitungLuas
    @Override
    public double hitungLuas() {
        // TODO: Return panjang * lebar
        System.out.println("Menghitung luas persegi panjang");
        return panjang * lebar;
    }

    // Override hitungKeliling
    @Override
    public double hitungKeliling() {
        // TODO: Return 2 * (panjang + lebar)
        System.out.println("Menghitung keliling persegi panjang");
        return 2 * (panjang + lebar);
    }

    // Override scale
    @Override
    public void scale(double factor) {
        // TODO: Multiply both dimensions by factor
        System.out.println("Penskalaan panjang: " + panjang * factor);
        System.out.println("Penskalaan lebar: " + lebar * factor);
    }
}

