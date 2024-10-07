import java.util.Scanner;

// Base class
class a{
    private String make;
    private String model;

    // Constructor
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Getter and Setter for make
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    // Getter and Setter for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

// Derived class Car
class Car extends Vehicle {
    private int numberOfDoors;

    // Constructor
    public Car(String make, String model, int numberOfDoors) {
        super(make, model);
        this.numberOfDoors = numberOfDoors;
    }

    // Getter and Setter for numberOfDoors
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    // Method to display car details
    public void displayCarDetails() {
        System.out.println("Car Make: " + getMake());
        System.out.println("Car Model: " + getModel());
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Derived class Bike
class Bike extends Vehicle {
    private String type;

    // Constructor
    public Bike(String make, String model, String type) {
        super(make, model);
        this.type = type;
    }

    // Getter and Setter for type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Method to display bike details
    public void displayBikeDetails() {
        System.out.println("Bike Make: " + getMake());
        System.out.println("Bike Model: " + getModel());
        System.out.println("Bike Type: " + type);
    }
}

// Main class to test the functionality
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input and create Car instance
        System.out.println("Enter Car details:");
        System.out.print("Make: ");
        String carMake = scanner.nextLine();
        System.out.print("Model: ");
        String carModel = scanner.nextLine();
        System.out.print("Number of Doors: ");
        int numberOfDoors = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Car myCar = new Car(carMake, carModel, numberOfDoors);

        // Input and create Bike instance
        System.out.println("Enter Bike details:");
        System.out.print("Make: ");
        String bikeMake = scanner.nextLine();
        System.out.print("Model: ");
        String bikeModel = scanner.nextLine();
        System.out.print("Type (e.g., Sport, Cruiser): ");
        String type = scanner.nextLine();

        Bike myBike = new Bike(bikeMake, bikeModel, type);

        // Display details
        System.out.println();
        myCar.displayCarDetails();
        System.out.println(); // New line for better readability
        myBike.displayBikeDetails();
        
        scanner.close(); // Close the scanner
    }
}
