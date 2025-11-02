package latihan5;

import java.text.NumberFormat;
import java.util.Locale;

public class ContractEmployee extends Employee {
    // Properties
    private double gajiKontrak;
    private int durasiKontrakBulan;
    NumberFormat iniRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

    // Constructor
    public ContractEmployee(String name, String employeeId, String department,
                            double gajiKontrak, int durasiKontrakBulan) {
        // TODO: Implementasi
        super(name, employeeId, department);
        this.gajiKontrak = gajiKontrak;
        this.durasiKontrakBulan = durasiKontrakBulan;
    }

    // Override calculateSalary
    @Override
    public double calculateSalary() {
        // TODO: Return gaji kontrak
        return gajiKontrak;
    }

    // Override calculateBonus
    @Override
    public double calculateBonus() {
        // TODO: Return 0 (tidak dapat bonus)
        return 0;
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        // TODO: Implementasi
        super.displayInfo();
        System.out.println("Tipe: Contract Employee");
        System.out.println("Gaji Kontrak: " + iniRupiah.format(gajiKontrak));
        System.out.println("Durasi Kontrak Bulan: " + durasiKontrakBulan);
    }

    //Override generatePayslip
    @Override
    public void generatePayslip() {
        // TODO: Generate dan print payslip
        super.generatePayslip();
        System.out.println("Type: Contract Employee");
        System.out.println("Salary: " + iniRupiah.format(calculateSalary()));
        System.out.println("Bonus: " + iniRupiah.format(calculateBonus()));
        System.out.println("Total: " + iniRupiah.format(calculateSalary() + calculateBonus()));
    }
}

