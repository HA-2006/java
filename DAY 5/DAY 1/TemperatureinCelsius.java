import java.util.Scanner;
public class TemperatureinCelsius{
    public static void main(String[] args){
        Scanner temp = new Scanner(System.in);
        System.out.println("Enter temperature in fahrenheit: ");
        double fahrenheit = temp.nextDouble();
        double Celsius = (fahrenheit - 32) * 5/9;
        System.out.println("Temperature in Celsius is :  "+Celsius);
    }
}