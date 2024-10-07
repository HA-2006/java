// Define the final class Car
public final class Car {
    private String model;

    // Constructor to initialize the model
    public Car(String model) {
        this.model = model;
    }

    // Final method to return the model of the car
    public final String getModel() {
        return model;
    }
}
// Main class to test the Car class
public class Main {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Tesla Model S");

        // Print the model of the car
        System.out.println("Car model: " + myCar.getModel());
        
        // Uncommenting the following code will cause a compile-time error
        // because you cannot extend a final class.
        
        // public class SportsCar extends Car { // This line will cause an error
        //     // Inherited methods cannot be overridden
        // }
    }
}
