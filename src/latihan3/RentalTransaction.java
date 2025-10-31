package latihan3;

public class RentalTransaction {
    // Properties
    private String namaPelanggan;
    private Vehicle kendaraan;
    private int durasiHari;
    private double totalBiaya;

    // Constructor
    public RentalTransaction(String namaPelanggan, Vehicle kendaraan, int durasiHari) {
        // TODO: Implementasi
        this.namaPelanggan = namaPelanggan;
        this.kendaraan = kendaraan;
        this.durasiHari = durasiHari;
        // TODO: Calculate total biaya
        this.totalBiaya = getTotalBiaya();
    }

    // Method display rental details
    public void displayRentalDetails() {
        // TODO: Print detail rental
        System.out.println("--- Detail Rental ---");
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Kendaraan: " + kendaraan);
        System.out.println("Durasi Hari: " + durasiHari);
        System.out.println("Total Biaya: " + totalBiaya);
    }

    // Getters
    public double getTotalBiaya() {
        return totalBiaya;
    }

    public Vehicle getKendaraan() {
        return kendaraan;
    }
}

