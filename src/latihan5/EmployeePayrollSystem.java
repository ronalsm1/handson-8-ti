package latihan5;

import java.text.NumberFormat;
import java.util.*;

public class EmployeePayrollSystem {
    public static void main(String[] args) {
        /*
         * ADVANCED PROJECT: Employee Payroll System
         *
         * Deskripsi: Sistem untuk menghitung gaji berbagai tipe karyawan
         * dengan aturan perhitungan yang berbeda-beda.
         */

        // ===== SETUP EMPLOYEE DATA =====
        System.out.println("=== EMPLOYEE PAYROLL SYSTEM ===\n");

        // Latihan 1: Create employees
        List<Employee> karyawan = new ArrayList<>();
        // - Buat FullTimeEmployee: "John", gajiPokok: 8000000, tunjangan: 2000000
        // - Buat PartTimeEmployee: "Sarah", upahPerJam: 50000, jamKerja: 120
        // - Buat ContractEmployee: "Mike", gajiKontrak: 15000000, durasi: 6 bulan
        karyawan.add(new FullTimeEmployee("John", "RD25001", "Research & Development", 8000000, 2000000));
        karyawan.add(new PartTimeEmployee("Sarah", "MD25002", "Marketing", 50000, 120));
        karyawan.add(new ContractEmployee("Mike", "IT25003", "IT", 15000000, 6));

        // Ekspektasi Output:
        // 3 employees created
        System.out.println(karyawan.size() + " employees created\n");

        // Latihan 2: Calculate salaries
        // - Calculate gaji untuk setiap employee
        // - Display salary details
        NumberFormat iniRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        for (Employee kar : karyawan) {
            System.out.println(kar.getName() +
                    " (" + kar.getClass().getSimpleName().replace("Time", "-Time").replace("Employee", "") + "): " +
                    iniRupiah.format(kar.calculateSalary()));
        }
        System.out.println();

        // Ekspektasi Output:
        // John (Full-Time): Rp 10,000,000
        // Sarah (Part-Time): Rp 6,000,000
        // Mike (Contract): Rp 15,000,000

        // Latihan 3: Add bonus
        // - Full-time dapat bonus 10% dari gaji pokok
        // - Part-time dapat bonus tetap Rp 500,000
        // - Contract tidak dapat bonus
        // - Calculate total dengan bonus
        for (Employee kar : karyawan) {
            System.out.println(kar.getName() + " total dengan bonus: " +
                    iniRupiah.format(kar.calculateSalary() + kar.calculateBonus()));
        }

        // Ekspektasi Output:
        // John total dengan bonus: Rp 10,800,000
        // Sarah total dengan bonus: Rp 6,500,000
        // Mike total dengan bonus: Rp 15,000,000

        // Latihan 4: Calculate total payroll
        // - Sum semua salary + bonus
        // - Display payroll summary
        double totalPayroll = 0;
        for (Employee kar : karyawan) {
            totalPayroll += kar.calculateSalary() + kar.calculateBonus();
        }
        System.out.println("\nTotal Payroll: " + iniRupiah.format(totalPayroll));

        // Ekspektasi Output:
        // Total Payroll: Rp 32,300,000

        // Latihan 5: Generate payslip
        // - Generate payslip detail untuk setiap employee
        // - Include: nama, tipe, gaji pokok, bonus, potongan, total
        System.out.println();
        for (Employee kar : karyawan) {
            kar.generatePayslip();
            System.out.println();
        }

        // Ekspektasi Output:
        // === PAYSLIP ===
        // Name: John
        // Type: Full-Time Employee
        // Base Salary: Rp 8,000,000
        // Allowance: Rp 2,000,000
        // Bonus: Rp 800,000
        // Total: Rp 10,800,000
    }
}

