import java.util.Scanner;

// Abstract class Vehicle
abstract class Vehicle {
    String make;
    String model;

    // Constructor to set make and model
    Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Abstract method to print vehicle details
    abstract void printDetails();
}

// Abstract class FourWheeler extending Vehicle
abstract class FourWheeler extends Vehicle {
    int numberOfDoors;

    // Constructor to set make, model and number of doors
    FourWheeler(String make, String model, int numberOfDoors) {
        super(make, model);
        this.numberOfDoors = numberOfDoors;
    }
}

// Abstract class TwoWheeler extending Vehicle
abstract class TwoWheeler extends Vehicle {
    boolean hasCarrier;

    // Constructor to set make, model and whether it has a carrier
    TwoWheeler(String make, String model, boolean hasCarrier) {
        super(make, model);
        this.hasCarrier = hasCarrier;
    }
}

// Class Car extending FourWheeler
class Car extends FourWheeler {

    // Constructor to set make, model and number of doors
    Car(String make, String model, int numberOfDoors) {
        super(make, model, numberOfDoors);
    }

    // Override the printDetails method
    @Override
    void printDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Class Bike extending TwoWheeler
class Bike extends TwoWheeler {

    // Constructor to set make, model and whether it has a carrier
    Bike(String make, String model, boolean hasCarrier) {
        super(make, model, hasCarrier);
    }

    // Override the printDetails method
    @Override
    void printDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Has Carrier: " + hasCarrier);
    }
}

// Main class to test the functionality
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Car
        System.out.println("Enter details for Car:");
        System.out.print("Make: ");
        String carMake = scanner.nextLine();
        System.out.print("Model: ");
        String carModel = scanner.nextLine();
        System.out.print("Number of Doors: ");
        int numberOfDoors = scanner.nextInt();
        scanner.nextLine();  // Consume newline character

        // Input for Bike
        System.out.println("\nEnter details for Bike:");
        System.out.print("Make: ");
        String bikeMake = scanner.nextLine();
        System.out.print("Model: ");
        String bikeModel = scanner.nextLine();
        System.out.print("Has Carrier (true/false): ");
        boolean hasCarrier = scanner.nextBoolean();

        // Create Car and Bike objects
        Car car = new Car(carMake, carModel, numberOfDoors);
        Bike bike = new Bike(bikeMake, bikeModel, hasCarrier);

        // Print details of Car
        System.out.println("\nCar Details:");
        car.printDetails();

        // Print details of Bike
        System.out.println("\nBike Details:");
        bike.printDetails();
    }
}
