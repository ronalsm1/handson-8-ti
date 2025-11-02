package latihan5;

import java.text.NumberFormat;
import java.util.Locale;

public class FullTimeEmployee extends Employee {
    // Properties
    private double gajiPokok;
    private double tunjangan;
    NumberFormat iniRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

    // Constructor
    public FullTimeEmployee(String name, String employeeId, String department,
                            double gajiPokok, double tunjangan) {
        // TODO: Implementasi
        super(name, employeeId, department);
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }

    // Override calculateSalary
    @Override
    public double calculateSalary() {
        // TODO: Return gajiPokok + tunjangan
        return gajiPokok + tunjangan;
    }

    // Override calculateBonus
    @Override
    public double calculateBonus() {
        // TODO: Return 10% dari gaji pokok
        return 0.1 * gajiPokok;
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        // TODO: Call super dan tambah info full-time
        super.displayInfo();
        System.out.println("Tipe: Full-Time Employee");
        System.out.println("Gaji Pokok: " + iniRupiah.format(gajiPokok));
        System.out.println("Tunjangan: " + iniRupiah.format(tunjangan));
    }

    //Override generatePayslip
    @Override
    public void generatePayslip() {
        // TODO: Generate dan print payslip
        super.generatePayslip();
        System.out.println("Type: Full-Time Employee");
        System.out.println("Base Salary: " + iniRupiah.format(gajiPokok));
        System.out.println("Allowance: " + iniRupiah.format(tunjangan));
        System.out.println("Bonus: " + iniRupiah.format(calculateBonus()));
        System.out.println("Total: " + iniRupiah.format(calculateSalary() + calculateBonus()));
    }
}

