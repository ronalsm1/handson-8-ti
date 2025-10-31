package latihan4;

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
        // - Buat Rectangle dengan panjang 10, lebar 5
        // - Buat Triangle dengan base 6, height 8
        // - Calculate dan display luas & keliling masing-masing

        // Ekspektasi Output:
        // Circle: Luas = 153.94, Keliling = 43.98
        // Rectangle: Luas = 50, Keliling = 30
        // Triangle: Luas = 24, Keliling = [calculated]

        // Latihan 2: Square (special case of Rectangle)
        // - Buat Square dengan sisi 8
        // - Square extends Rectangle
        // - Override untuk memastikan panjang = lebar

        // Ekspektasi Output:
        // Square: Luas = 64, Keliling = 32

        // Latihan 3: Compare shapes
        // - Buat method untuk compare area dari 2 shapes
        // - Find shape dengan area terbesar

        // Ekspektasi Output:
        // Circle memiliki area terbesar: 153.94

        // Latihan 4: Scale shapes
        // - Implementasi method scale(factor)
        // - Scale circle dengan factor 2
        // - Scale rectangle dengan factor 0.5

        // Ekspektasi Output:
        // Original Circle area: 153.94
        // Scaled Circle area: 615.75
        // Scale factor: 2.0

        // Latihan 5: Total area calculator
        // - Buat array/list of shapes
        // - Calculate total area dari semua shapes

        // Ekspektasi Output:
        // Total area dari semua shapes: 391.94
    }
}

