package latihan4;

public class Shape {
    // Properties
    protected String nama;
    protected String warna;

    // Constructor
    public Shape(String nama, String warna) {
        // TODO: Implementasi
        this.nama = nama;
        this.warna = warna;
    }

    // Method yang akan di-override
    public double hitungLuas() {
        // TODO: Return 0 (akan di-override)
        return 0;
    }

    public double hitungKeliling() {
        // TODO: Return 0 (akan di-override)
        return 0;
    }

    // Method display info
    public void displayInfo() {
        // TODO: Print nama, warna, luas, keliling
        System.out.printf("%s (%s): Luas = %.2f, Keliling = %.2f%n", nama, warna, hitungLuas(), hitungKeliling());
    }

    // Method untuk scale shape
    public void scale(double factor) {
        // TODO: Override di subclass
        System.out.println("Factor: " + factor);
    }
}

