package latihan3;

public class Motorcycle extends Vehicle {
    // Properties tambahan
    private String jenisMotor; // "Sport", "Matic", "Bebek"
    private int kapasitasMesin; // dalam CC

    // Constructor
    public Motorcycle(String merk, String model, int tahunProduksi,
                      String nomorPolisi, double hargaRentalPerHari,
                      String jenisMotor, int kapasitasMesin) {
        // TODO: Implementasi
        super(merk, model, tahunProduksi, nomorPolisi, hargaRentalPerHari);
        this.jenisMotor = jenisMotor;
        this.kapasitasMesin = kapasitasMesin;
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        // TODO: Implementasi
        super.displayInfo();
        System.out.println("Jenis Motor: " + jenisMotor);
        System.out.println("Kapasitas Mesin: " + kapasitasMesin);
    }

    // Override biaya rental (Motor lebih murah)
    @Override
    public double hitungBiayaRental(int jumlahHari) {
        // TODO: Implementasi
        return 0;
    }
}

