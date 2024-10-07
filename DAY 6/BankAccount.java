class BankAccount {
    private double balance;

    // Constructor to initialize the balance
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            balance = initialBalance;
        } else {
            balance = 0;
            System.out.println("Initial balance cannot be negative. Set to 0.");
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Cannot deposit a negative amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            System.out.println("Cannot withdraw a negative amount.");
        }
    }

    // Method to check the balance
    public double getBalance() {
        return balance;
    }

    // Test cases
    public static void main(String[] args) {
        // Test Case 1: Initial Balance Test
        BankAccount account = new BankAccount(1000.0);
        System.out.println("Test Case 1: Initial Balance: " + account.getBalance()); // Expected: 1000.0

        // Test Case 2: Deposit Test
        account.deposit(500.0);
        System.out.println("Test Case 2: Balance after deposit: " + account.getBalance()); // Expected: 1500.0

        // Test Case 3: Withdraw Test
        account.withdraw(200.0);
        System.out.println("Test Case 3: Balance after withdrawal: " + account.getBalance()); // Expected: 1300.0

        // Test Case 4: Overdraw Test
        account.withdraw(2000.0);
        System.out.println("Test Case 4: Balance after overdraw attempt: " + account.getBalance()); // Expected: 1300.0

        // Test Case 5: Negative Deposit Test
        account.deposit(-500.0);
        System.out.println("Test Case 5: Balance after negative deposit attempt: " + account.getBalance()); // Expected: 1300.0
    }
}
