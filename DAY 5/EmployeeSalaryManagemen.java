import java.util.Scanner;

class Employee {
    // Fields
    private String name;
    private int id;
    private double basicSalary;
    private double allowances;

    // Default constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(String name, int id, double basicSalary, double allowances) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
        this.allowances = allowances;
    }

    // Method to calculate gross salary
    public double calculateGrossSalary() {
        return basicSalary + allowances;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Allowances: $" + allowances);
        System.out.println("Gross Salary: $" + calculateGrossSalary());
    }
}
//File name EmployeeSalaryManagement
public class EmployeeSalaryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (numEmployees <= 0) {
            System.out.println("No employees to manage.");
            return;
        }

        // Create an array to store employees
        Employee[] employees = new Employee[numEmployees];

        // Input employee details
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("ID: ");
            int id = scanner.nextInt();

            System.out.print("Basic Salary: ");
            double basicSalary = scanner.nextDouble();

            System.out.print("Allowances: ");
            double allowances = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            // Create Employee object and add to array
            employees[i] = new Employee(name, id, basicSalary, allowances);
        }

        // Display employee details and gross salaries
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nDetails of employee " + (i + 1) + ":");
            employees[i].displayDetails();
        }

        scanner.close();
    }
}
