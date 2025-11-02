package latihan3;

import java.text.NumberFormat;
import java.util.*;

public class VehicleManagementSystem {
    public static void main(String[] args) {
        /*
         * REAL-WORLD PROJECT: Vehicle Rental Management System
         *
         * Deskripsi: Sistem untuk mengelola rental kendaraan dengan berbagai
         * tipe kendaraan dan perhitungan biaya rental yang berbeda.
         */

        // ===== SETUP RENTAL SYSTEM =====
        System.out.println("=== VEHICLE RENTAL MANAGEMENT SYSTEM ===\n");

        // Latihan 1: Create vehicle fleet
        List<Vehicle> fleet = new ArrayList<>();
        // - Buat 3 Mobil: Toyota Avanza, Honda Jazz, Suzuki Ertiga
        fleet.add(new Car("Toyota", "Avanza", 2011, "D 1234 RON", 300000, 7, "Manual", false));
        fleet.add(new Car("Honda", "Jazz", 2021, "DK 5678 ANG", 320000, 5, "Automatic", true));
        fleet.add(new Car("Suzuki", "Ertiga", 2022, "Z 9087 CHI", 350000, 7, "Automatic", true));
        // - Buat 2 Motor: Honda Beat, Yamaha NMAX
        fleet.add(new Motorcycle("Honda", "Beat", 2024, "B 6354 SHA", 90000, "Matic", 109));
        fleet.add(new Motorcycle("Yamaha", "NMAX", 2024, "A 1753 HEL", 125000, "Sport", 155));
        // - Set harga rental per hari untuk masing-masing (udah ada di atas sir)

        // Ekspektasi Output:
        // Fleet created: 5 vehicles
        System.out.println("Fleet created: " + fleet.size() + " vehicles");

        // Latihan 2: Display all vehicles
        // - Loop semua kendaraan
        // - Display info lengkap masing-masing
        for (Vehicle kendaraan : fleet){
            kendaraan.displayInfo();
        }

        // Ekspektasi Output:
        // [Info detail untuk setiap kendaraan]

        // Latihan 3: Rent a vehicle
        // - Customer "Andi" rental Toyota Avanza selama 3 hari
        Vehicle toyotaAvanza = fleet.get(0);
        RentalTransaction rental1 = new RentalTransaction("Andi", toyotaAvanza, 3);
        // - Calculate total biaya
        // - Display rental details
        rental1.displayRentalDetails();

        // Ekspektasi Output:
        // Rental untuk: Andi
        // Kendaraan: Toyota Avanza (Mobil)
        // Durasi: 3 hari
        // Biaya per hari: Rp 300,000
        // Total biaya: Rp 900,000

        // Latihan 4: Calculate monthly revenue
        // - Rent beberapa kendaraan
        List<RentalTransaction> dapatBulanan = new ArrayList<>();
        dapatBulanan.add(rental1);
        dapatBulanan.add(new RentalTransaction("Ronald", fleet.get(2), 4));
        dapatBulanan.add(new RentalTransaction("Angel", fleet.get(1), 5));
        dapatBulanan.add(new RentalTransaction("Jessica", fleet.get(3), 5));
        dapatBulanan.add(new RentalTransaction("Josef", fleet.get(4), 6));
        // - Calculate total revenue bulan ini
        double totalDapat = 0;
        for (RentalTransaction traren : dapatBulanan) {
            totalDapat += traren.getTotalBiaya();
        }
        // Ekspektasi Output:
        // Total revenue bulan ini: Rp 5,400,000
        NumberFormat iniRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        System.out.println("\nTotal revenue bulan ini: " + iniRupiah.format(totalDapat));

        // Latihan 5: Vehicle maintenance
        // - Misal 5 kendaraan tersedia lagi untuk di-rental
        fleet.get(0).setTersedia(true);
        fleet.get(1).setTersedia(true);
        fleet.get(2).setTersedia(true);
        fleet.get(3).setTersedia(true);
        fleet.get(4).setTersedia(true);
        // - Mark beberapa kendaraan sebagai "under maintenance"
        fleet.get(0).setTersedia(false);
        fleet.get(4).setTersedia(false);
        // - Display available vehicles only
        int kendaraanTersedia = 0;
        int underMaintenance = 0;
        for (Vehicle kendaraan : fleet) {
            if (kendaraan.isTersedia()) {
                kendaraan.displayInfo();
                kendaraanTersedia++;
            } else {
                underMaintenance++;
            }
        }

        // Ekspektasi Output:
        // Available vehicles: 3
        // Under maintenance: 2
        System.out.println("\nAvailable vehicles: " + kendaraanTersedia);
        System.out.println("Under maintenance: " + underMaintenance);


        // Latihan 6: Find vehicles by criteria
        // - Find all Mobil dengan harga < Rp 350,000/hari
        // - Find all Motor jenis "matic"
        int hitungMobil = 0;
        int hitungMatic = 0;
        for (Vehicle kendaraan : fleet) {
            if (kendaraan instanceof Car && kendaraan.getHargaRentalPerHari() < 350000) {
                hitungMobil++;
            }
            if (kendaraan instanceof Motorcycle && ((Motorcycle) kendaraan).getJenisMotor().equals("Matic")) {
                hitungMatic++;
            }
        }

        // Ekspektasi Output:
        // Found 2 Mobil sesuai kriteria
        // Found 1 Motor matic
        System.out.println("\nMencari semua mobil dgn harga rental < Rp 350.000/hari dan semua motor jenis matic");
        System.out.println("Found " + hitungMobil + " Mobil sesuai kriteria");
        System.out.println("Found " + hitungMatic + " Motor matic");
        for (Vehicle kendaraan : fleet) {
            if (kendaraan instanceof Car && kendaraan.getHargaRentalPerHari() < 350000) {
                kendaraan.displayInfo();
            }
            if (kendaraan instanceof Motorcycle && ((Motorcycle) kendaraan).getJenisMotor().equals("Matic")) {
                kendaraan.displayInfo();
            }
        }

        // Latihan 7: Generate rental report
        // - Display summary rental bulan ini
        // - Group by vehicle type
        // - Show total revenue per type
        int rentalMobil = 0;
        double revenueMobil = 0;
        int rentalMotor = 0;
        double revenueMotor = 0;
        for (RentalTransaction traren : dapatBulanan) {
            if (traren.getKendaraan() instanceof Car) {
                rentalMobil++;
                revenueMobil += traren.getTotalBiaya();
            }
            if (traren.getKendaraan() instanceof Motorcycle) {
                rentalMotor++;
                revenueMotor += traren.getTotalBiaya();
            }
        }
        // Ekspektasi Output:
        // === RENTAL REPORT ===
        // Mobil: 15 rentals, Rp 4,200,000
        // Motor: 8 rentals, Rp 1,200,000
        // Total: Rp 5,400,000
        System.out.println("\n=== RENTAL REPORT ===");
        System.out.println("Mobil: " + rentalMobil + " rentals, " + iniRupiah.format(revenueMobil));
        System.out.println("Motor: " + rentalMotor + " rentals, " + iniRupiah.format(revenueMotor));
        System.out.println("Total: " + iniRupiah.format(totalDapat));
    }
}

