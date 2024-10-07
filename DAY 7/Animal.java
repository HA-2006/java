import java.util.Scanner;

// Animal class
class Animal {
    String speciesName;

    // Constructor for Animal
    public Animal(String speciesName) {
        this.speciesName = speciesName;
    }

    // Method to display species name
    public void displaySpecies() {
        System.out.println("Species: " + speciesName);
    }
}

// Mammal class inheriting from Animal
class Mammal extends Animal {
    boolean hasFur;

    // Constructor for Mammal
    public Mammal(String speciesName, boolean hasFur) {
        super(speciesName); // Call the superclass constructor
        this.hasFur = hasFur;
    }

    // Method to display if the mammal has fur
    public void displayHasFur() {
        System.out.println("Has Fur: " + hasFur);
    }
}

// Dog class inheriting from Mammal
class Dog extends Mammal {
    String breed;

    // Constructor for Dog
    public Dog(String speciesName, boolean hasFur, String breed) {
        super(speciesName, hasFur); // Call the superclass constructor
        this.breed = breed;
    }

    // Method to display the breed of the dog
    public void displayBreed() {
        System.out.println("Breed: " + breed);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for Animal properties
        System.out.print("Enter species name: ");
        String speciesName = scanner.nextLine();

        // Get user input for Mammal properties
        System.out.print("Does it have fur? (true/false): ");
        boolean hasFur = scanner.nextBoolean();
        scanner.nextLine(); // Consume newline

        // Get user input for Dog properties
        System.out.print("Enter breed: ");
        String breed = scanner.nextLine();

        // Creating an instance of Dog with user input
        Dog dog = new Dog(speciesName, hasFur, breed);

        // Displaying all the properties
        dog.displaySpecies();
        dog.displayHasFur();
        dog.displayBreed();
        
        // Close scanner
        scanner.close();
    }
}
