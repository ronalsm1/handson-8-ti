package latihan4;

import java.util.*;

public class ShapeCalculatorSystem {
    public static void main(String[] args) {
        /*
         * CHALLENGE PROJECT: Shape Calculator with Inheritance
         *
         * Deskripsi: Sistem untuk menghitung luas dan keliling berbagai
         * bentuk geometri menggunakan inheritance hierarchy.
         */

        // ===== SHAPE CALCULATIONS =====
        System.out.println("=== SHAPE CALCULATOR SYSTEM ===\n");

        // Latihan 1: Create basic shapes
        // - Buat Circle dengan radius 7
        Circle lingkaran = new Circle("Putih", 7);
        // - Buat Rectangle dengan panjang 10, lebar 5
        Rectangle persegiPanjang = new Rectangle("Biru", 10, 5);
        // - Buat Triangle dengan base 6, height 8
        Triangle segitiga = new Triangle("Merah", 6, 8, 6, 10, 10);
        // - Calculate dan display luas & keliling masing-masing
        lingkaran.displayInfo();
        persegiPanjang.displayInfo();
        segitiga.displayInfo();

        // Ekspektasi Output:
        // Circle: Luas = 153.94, Keliling = 43.98
        // Rectangle: Luas = 50, Keliling = 30
        // Triangle: Luas = 24, Keliling = [calculated]

        // Latihan 2: Square (special case of Rectangle)
        // - Buat Square dengan sisi 8
        Square persegi = new Square("Hijau", 8);
        // - Square extends Rectangle
        // - Override untuk memastikan panjang = lebar
        System.out.println();
        persegi.displayInfo();

        // Ekspektasi Output:
        // Square: Luas = 64, Keliling = 32

        // Latihan 3: Compare shapes
        // - Buat method untuk compare area dari 2 shapes
        List<Shape> bentuk = new ArrayList<>();
        bentuk.add(lingkaran);
        bentuk.add(persegi);
        // - Find shape dengan area terbesar
        Shape terbesar = bentuk.get(0);
        for (Shape shapes : bentuk) {
            if (shapes.hitungLuas() > terbesar.hitungLuas()) {
                terbesar = shapes;
            }
        }
        System.out.println();
        System.out.printf("%s memiliki area terbesar: %.2f%n", terbesar.nama, terbesar.hitungLuas());

        // Ekspektasi Output:
        // Circle memiliki area terbesar: 153.94

        // Latihan 4: Scale shapes
        // - Implementasi method scale(factor)
        // - Scale circle dengan factor 2
        Circle scaleCircle = new Circle("Kuning", 7);
        System.out.println();
        System.out.printf("Original Circle area: %.2f%n", lingkaran.hitungLuas());
        scaleCircle.scale(2);
        System.out.printf("Scaled Circle area: %.2f%n", scaleCircle.hitungLuas());
        System.out.println("Scale factor: 2.0");
        // - Scale rectangle dengan factor 0.5
        Rectangle scaleRectangle = new Rectangle("Oranye", 10, 5);
        System.out.println();
        System.out.printf("Original Rectangle area: %.2f%n", persegiPanjang.hitungLuas());
        scaleRectangle.scale(0.5);
        System.out.printf("Scaled Rectangle area: %.2f%n", scaleRectangle.hitungLuas());
        System.out.println("Scale factor: 0.5");

        // Ekspektasi Output:
        // Original Circle area: 153.94
        // Scaled Circle area: 615.75
        // Scale factor: 2.0

        // Latihan 5: Total area calculator
        // - Buat array/list of shapes
        List<Shape> shapes = new ArrayList<>();
        shapes.add(lingkaran);
        shapes.add(persegiPanjang);
        shapes.add(segitiga);
        shapes.add(persegi);
        // - Calculate total area dari semua shapes
        double totalArea = 0;
        for (Shape bentukSkrg : shapes) {
            totalArea += bentukSkrg.hitungLuas();
        }
        System.out.println();
        System.out.printf("Total area dari semua shapes: %.2f%n", totalArea);

        // Ekspektasi Output:
        // Total area dari semua shapes: 391.94 --> harusnya 291.94
    }
}

