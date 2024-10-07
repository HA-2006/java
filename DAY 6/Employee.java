public class Employee {
    // Private attributes
    private String name;
    private double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        setSalary(salary);  // Using setter to ensure validation
    }

    // Public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for salary with validation
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Error: Salary cannot be negative.");
        }
    }

    // Public getter for salary
    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        // Test Case 1: Valid Name Test
        Employee emp1 = new Employee("John Doe", 50000.0);
        System.out.println("Test Case 1: Name = " + emp1.getName()); // Expected: John Doe

        // Test Case 2: Valid Salary Test
        emp1.setSalary(50000.0);
        System.out.println("Test Case 2: Salary = " + emp1.getSalary()); // Expected: 50000.0

        // Test Case 3: Invalid Negative Salary Test
        emp1.setSalary(-10000.0);
        System.out.println("Test Case 3: Salary after invalid set = " + emp1.getSalary()); // Expected: Salary unchanged

        // Test Case 4: Edge Case Zero Salary Test
        emp1.setSalary(0);
        System.out.println("Test Case 4: Salary = " + emp1.getSalary()); // Expected: 0

        // Test Case 5: Change Name Test
        emp1.setName("Jane Smith");
        System.out.println("Test Case 5: Name = " + emp1.getName()); // Expected: Jane Smith
    }
}
