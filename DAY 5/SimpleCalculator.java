import java.util.Scanner;

public class SimpleCalculator {

    // Method for addition
    double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Not a Number
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleCalculator calculator = new SimpleCalculator();
        boolean continueCalculating = true;

        while (continueCalculating) {
            // Prompt for first number
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            // Prompt for second number
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Prompt for operation
            System.out.print("Enter the operation (+, -, *, /): ");
            char operation = scanner.next().charAt(0);

            // Perform the operation and display result
            double result;
            switch (operation) {
                case '+':
                    result = calculator.add(num1, num2);
                    break;
                case '-':
                    result = calculator.subtract(num1, num2);
                    break;
                case '*':
                    result = calculator.multiply(num1, num2);
                    break;
                case '/':
                    result = calculator.divide(num1, num2);
                    if (Double.isNaN(result)) {
                        continue; // Skip the rest of the loop if there's an error
                    }
                    break;
                default:
                    System.out.println("Invalid operation. Please select +, -, *, or /.");
                    continue;
            }

            // Display result if operation was valid
            System.out.println("Result: " + result);

            // Ask if user wants to perform another calculation
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String response = scanner.next().toLowerCase();
            if (response.equals("no")) {
                continueCalculating = false;
            }
        }

        scanner.close();
        System.out.println("Calculator exited.");
    }
}
