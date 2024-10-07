import java.util.Scanner;

// Base class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void printSound(Animal a) {
        a.makeSound();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 'animal' or 'dog':");
        String input = scanner.nextLine().trim().toLowerCase();

        Animal myAnimal;
        if (input.equals("dog")) {
            myAnimal = new Dog();
        } else {
            myAnimal = new Animal();
        }

        printSound(myAnimal);
        scanner.close();
    }
}
