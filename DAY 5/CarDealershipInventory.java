import java.util.Scanner;

class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    // Constructor to initialize car details
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Method to display car information
    public void displayCarInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }
}

public class CarDealershipInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting user for car details
        System.out.print("Enter car make: ");
        String make = scanner.nextLine();
        
        System.out.print("Enter car model: ");
        String model = scanner.nextLine();
        
        System.out.print("Enter car year: ");
        int year = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Enter car price: ");
        double price = Double.parseDouble(scanner.nextLine());

        // Create an instance of Car class
        Car car = new Car(make, model, year, price);

        // Display the car details
        car.displayCarInfo();

        scanner.close();
    }
}
