import java.util.Scanner;
public class Swap{
    public static void main(String[] args){
        Scanner swap = new Scanner(System.in);
        System.out.print("enter number 1: ");
        int num1 = swap.nextInt();
        System.out.print("enter number 2: ");
        int num2 = swap.nextInt();
        
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        
        System.out.println("After swapping :");
        System.out.println("number 1 is "+num1);
        System.out.println("number 2 is "+num2);
        
    }
}