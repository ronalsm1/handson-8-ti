package latihan5;

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
        // - Buat FullTimeEmployee: "John", gajiPokok: 8000000, tunjangan: 2000000
        // - Buat PartTimeEmployee: "Sarah", upahPerJam: 50000, jamKerja: 120
        // - Buat ContractEmployee: "Mike", gajiKontrak: 15000000, durasi: 6 bulan

        // Ekspektasi Output:
        // 3 employees created

        // Latihan 2: Calculate salaries
        // - Calculate gaji untuk setiap employee
        // - Display salary details

        // Ekspektasi Output:
        // John (Full-Time): Rp 10,000,000
        // Sarah (Part-Time): Rp 6,000,000
        // Mike (Contract): Rp 15,000,000

        // Latihan 3: Add bonus
        // - Full-time dapat bonus 10% dari gaji pokok
        // - Part-time dapat bonus tetap Rp 500,000
        // - Contract tidak dapat bonus
        // - Calculate total dengan bonus

        // Ekspektasi Output:
        // John total dengan bonus: Rp 10,800,000
        // Sarah total dengan bonus: Rp 6,500,000
        // Mike total dengan bonus: Rp 15,000,000

        // Latihan 4: Calculate total payroll
        // - Sum semua salary + bonus
        // - Display payroll summary

        // Ekspektasi Output:
        // Total Payroll: Rp 32,300,000

        // Latihan 5: Generate payslip
        // - Generate payslip detail untuk setiap employee
        // - Include: nama, tipe, gaji pokok, bonus, potongan, total

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

