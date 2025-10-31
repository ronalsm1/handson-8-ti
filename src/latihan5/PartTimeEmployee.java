package latihan5;

public class PartTimeEmployee extends Employee {
    // Properties
    private double upahPerJam;
    private int jamKerja;

    // Constructor
    public PartTimeEmployee(String name, String employeeId, String department,
                            double upahPerJam, int jamKerja) {
        // TODO: Implementasi
    }

    // Override calculateSalary
    @Override
    public double calculateSalary() {
        // TODO: Return upahPerJam * jamKerja
        return 0;
    }

    // Override calculateBonus
    @Override
    public double calculateBonus() {
        // TODO: Return bonus tetap 500000
        return 0;
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        // TODO: Implementasi
    }
}

