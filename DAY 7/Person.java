import java.util.Scanner;

// Parent class Person
class Person {
    String name;
    int age;

    // Constructor for Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Child class Employee that inherits from Person
class Employee extends Person {
    String employeeId;
    String department;

    // Constructor for Employee
    public Employee(String name, int age, String employeeId, String department) {
        // Call the constructor of the parent class (Person)
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Get input for name
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        // Get input for age
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over

        // Get input for employeeId
        System.out.print("Enter Employee ID: ");
        String employeeId = scanner.nextLine();

        // Get input for department
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        // Create an instance of Employee
        Employee emp = new Employee(name, age, employeeId, department);

        // Display the details of the employee
        emp.displayEmployeeDetails();

        // Close the scanner
        scanner.close();
    }
}
