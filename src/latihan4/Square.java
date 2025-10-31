package latihan4;

public class Square extends Rectangle {
    // Constructor - hanya butuh sisi
    public Square(String warna, double sisi) {
        // TODO: Call super dengan panjang = lebar = sisi
        super("Square", sisi, sisi);
    }

    // Override untuk memastikan selalu square
    public void setSisi(double sisi) {
        // TODO: Set both panjang dan lebar
        this.panjang = sisi;
        this.lebar = sisi;
    }

    @Override
    public void displayInfo() {
        // TODO: Display as Square bukan Rectangle
        System.out.println("Sisi persegi: " + getSisi());
    }

    public double getSisi() {
        return this.panjang;
    }
}

