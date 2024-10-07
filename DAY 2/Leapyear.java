import java.util.Scanner;
public class Leapyear{
    public static void main(String []args){
        Scanner y = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = y.nextInt();
        if(year% 4==0 & year%100!=0 & year%400==0){
            System.out.println("It is a leap year!");
         }
        else{
            System.out.println("It in not a leap year!");
        }
    }
}