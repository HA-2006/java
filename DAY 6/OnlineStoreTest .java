class Item {
    private String name;
    private double price;
    private static int totalItemsSold = 0; // static to track across all items
    private static double totalRevenue = 0.0; // static to track across all items

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Method to sell the item and update static variables
    public void sell(int quantity) {
        totalItemsSold += quantity; // update total items sold
        totalRevenue += quantity * price; // update total revenue
    }

    // Static method to get total items sold
    public static int getTotalItemsSold() {
        return totalItemsSold;
    }

    // Static method to get total revenue
    public static double getTotalRevenue() {
        return totalRevenue;
    }
}

public class OnlineStoreTest {
    public static void main(String[] args) {
        // Test Case 1: Basic Sale
        Item laptop = new Item("Laptop", 1000);
        laptop.sell(2);
        System.out.println("Total Items Sold: " + Item.getTotalItemsSold());
        System.out.println("Total Revenue: $" + Item.getTotalRevenue());

        // Resetting static values for next test case (for illustration)
        resetStaticValues();

        // Test Case 2: Multiple Item Sale
        Item laptop2 = new Item("Laptop", 1000);
        Item smartphone = new Item("Smartphone", 500);
        laptop2.sell(3);
        smartphone.sell(5);
        System.out.println("Total Items Sold: " + Item.getTotalItemsSold());
        System.out.println("Total Revenue: $" + Item.getTotalRevenue());

        resetStaticValues();

        // Test Case 3: No Sales
        Item laptop3 = new Item("Laptop", 1000);
        System.out.println("Total Items Sold: " + Item.getTotalItemsSold());
        System.out.println("Total Revenue: $" + Item.getTotalRevenue());

        resetStaticValues();

        // Test Case 4: Mixed Item Sale
        Item laptop4 = new Item("Laptop", 1000);
        Item smartphone2 = new Item("Smartphone", 500);
        laptop4.sell(1);
        smartphone2.sell(4);
        System.out.println("Total Items Sold: " + Item.getTotalItemsSold());
        System.out.println("Total Revenue: $" + Item.getTotalRevenue());

        resetStaticValues();

        // Test Case 5: Large Quantity Sale
        Item laptop5 = new Item("Laptop", 1000);
        laptop5.sell(100);
        System.out.println("Total Items Sold: " + Item.getTotalItemsSold());
        System.out.println("Total Revenue: $" + Item.getTotalRevenue());
    }

    // Helper method to reset static values (used in test cases to isolate tests)
    private static void resetStaticValues() {
        try {
            java.lang.reflect.Field totalItemsSoldField = Item.class.getDeclaredField("totalItemsSold");
            totalItemsSoldField.setAccessible(true);
            totalItemsSoldField.setInt(null, 0);

            java.lang.reflect.Field totalRevenueField = Item.class.getDeclaredField("totalRevenue");
            totalRevenueField.setAccessible(true);
            totalRevenueField.setDouble(null, 0.0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
