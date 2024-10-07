import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner natural = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = natural.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int totalSum = 0;
            for (int i = 1; i <= n; i++) {
                totalSum += i;
            }
            System.out.println("Sum of first " + n + " natural numbers: " + totalSum);
        }

        natural.close();
     }
 }