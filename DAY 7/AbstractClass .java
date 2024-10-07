import java.util.Scanner;

// Abstract class with an abstract method 'display'
abstract class AbstractClass {
    abstract void display();
}

// Parent class with a constructor that takes a 'name' parameter
class Parent {
    String name;

    // Constructor using 'this' keyword to assign the instance variable
    Parent(String name) {
        this.name = name;
    }
}

// Child class inheriting from Parent and extending AbstractClass
class Child extends Parent {

    // Constructor that uses 'super' to call the parent constructor
    Child(String name) {
        super(name);
    }

    // Implementation of the abstract method 'display'
    void display() {
        System.out.println("Name: " + name);
    }
}

// Main class to create an instance of Child and call the 'display' method
public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a name
        System.out.print("Enter the name: ");
        String name = scanner.nextLine();

        // Creating an instance of Child and passing the user input as name
        Child child = new Child(name);
        
        // Calling the 'display' method to print the name
        child.display();
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
