import java.util.Scanner;

class Book {
    // Fields for book title, author, price, and number of copies
    private String title;
    private String author;
    private double price;
    private int numOfCopies;

    // Method to get book details from the user
    public void getBookDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter book title: ");
        title = scanner.nextLine();

        System.out.print("Enter book author: ");
        author = scanner.nextLine();

        System.out.print("Enter book price: ");
        price = scanner.nextDouble();

        System.out.print("Enter number of copies: ");
        numOfCopies = scanner.nextInt();

        // Consume the newline character left after nextInt() for proper next input
        scanner.nextLine(); 
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: " + price);
        System.out.println("Number of Copies: " + numOfCopies);
    }
}

public class BookstoreInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create an array of 3 Book objects
        Book[] books = new Book[3];

        // Loop to get details for each book
        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            books[i] = new Book(); // Instantiate a new Book object
            books[i].getBookDetails(); // Get details for the current book
        }

        // Display the details of all books
        System.out.println("\nBooks in the inventory:");
        for (int i = 0; i < books.length; i++) {
            books[i].displayBookDetails(); // Display details for each book
            System.out.println(); // Print an empty line between books
        }
    }
}
