package latihan5;

import java.text.NumberFormat;
import java.util.Locale;

public class PartTimeEmployee extends Employee {
    // Properties
    private double upahPerJam;
    private int jamKerja;
    NumberFormat iniRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

    // Constructor
    public PartTimeEmployee(String name, String employeeId, String department,
                            double upahPerJam, int jamKerja) {
        // TODO: Implementasi
        super(name, employeeId, department);
        this.upahPerJam = upahPerJam;
        this.jamKerja = jamKerja;
    }

    // Override calculateSalary
    @Override
    public double calculateSalary() {
        // TODO: Return upahPerJam * jamKerja
        return upahPerJam * jamKerja;
    }

    // Override calculateBonus
    @Override
    public double calculateBonus() {
        // TODO: Return bonus tetap 500000
        return 500000;
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        // TODO: Implementasi
        super.displayInfo();
        System.out.println("Tipe: Part-Time Employee");
        System.out.println("Upah per Jam: " + iniRupiah.format(upahPerJam));
        System.out.println("Jam Kerja: " + jamKerja);
    }

    //Override generatePayslip
    @Override
    public void generatePayslip() {
        // TODO: Generate dan print payslip
        super.generatePayslip();
        System.out.println("Type: Part-Time Employee");
        System.out.println("Hourly Wage: " + iniRupiah.format(upahPerJam));
        System.out.println("Salary: " + iniRupiah.format(calculateSalary()));
        System.out.println("Bonus: " + iniRupiah.format(calculateBonus()));
        System.out.println("Total: " + iniRupiah.format(calculateSalary() + calculateBonus()));
    }
}

