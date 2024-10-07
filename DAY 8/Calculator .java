import java.util.Scanner;

public class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose operation:");
        System.out.println("1: Add two integers");
        System.out.println("2: Add three integers");
        System.out.println("3: Add two double values");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Add two integers
                System.out.println("Enter two integers:");
                int int1 = scanner.nextInt();
                int int2 = scanner.nextInt();
                System.out.println("Result: " + calc.add(int1, int2));
                break;

            case 2:
                // Add three integers
                System.out.println("Enter three integers:");
                int int3 = scanner.nextInt();
                int int4 = scanner.nextInt();
                int int5 = scanner.nextInt();
                System.out.println("Result: " + calc.add(int3, int4, int5));
                break;

            case 3:
                // Add two double values
                System.out.println("Enter two double values:");
                double double1 = scanner.nextDouble();
                double double2 = scanner.nextDouble();
                System.out.println("Result: " + calc.add(double1, double2));
                break;

            default:
                System.out.println("Invalid choice!");
                break;
        }

        scanner.close();
    }
}
