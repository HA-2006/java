import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a non-negative integer
        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("The number must be non-negative.");
        } else {
            // Calculate factorial
            long factorial = calculateFactorial(n);
            // Display the result
            System.out.println("Factorial of " + n + " is " + factorial);
        }

        scanner.close();
    }

    public static long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
