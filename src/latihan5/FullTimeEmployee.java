package latihan5;

public class FullTimeEmployee extends Employee {
    // Properties
    private double gajiPokok;
    private double tunjangan;

    // Constructor
    public FullTimeEmployee(String name, String employeeId, String department,
                            double gajiPokok, double tunjangan) {
        // TODO: Implementasi
    }

    // Override calculateSalary
    @Override
    public double calculateSalary() {
        // TODO: Return gajiPokok + tunjangan
        return 0;
    }

    // Override calculateBonus
    @Override
    public double calculateBonus() {
        // TODO: Return 10% dari gaji pokok
        return 0;
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        // TODO: Call super dan tambah info full-time
    }
}

