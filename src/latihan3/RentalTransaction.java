package latihan3;

import java.text.NumberFormat;
import java.util.*;

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
        this.totalBiaya = kendaraan.hitungBiayaRental(durasiHari);
        kendaraan.setTersedia(false);
    }

    // Method display rental details
    public void displayRentalDetails() {
        NumberFormat iniRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        // TODO: Print detail rental
        System.out.println("\n--- Detail Rental ---");
        System.out.println("Rental untuk: " + namaPelanggan);
        System.out.println("Kendaraan: " + kendaraan.getMerk() + " " + kendaraan.getModel() + " (" + (this.kendaraan instanceof Car ? "Mobil" : "Motor") + ")");
        System.out.println("Durasi Hari: " + durasiHari + " hari");
        System.out.println("Biaya per hari: " + iniRupiah.format(kendaraan.getHargaRentalPerHari()));
        System.out.println("Total Biaya: " + iniRupiah.format(totalBiaya));
    }

    // Getters
    public double getTotalBiaya() {
        return totalBiaya;
    }

    public Vehicle getKendaraan() {
        return kendaraan;
    }
}

