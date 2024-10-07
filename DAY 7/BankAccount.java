import java.util.Scanner;

abstract class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

class CurrentAccount extends BankAccount {

    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}
file name - BankAccountTest

public class BankAccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose account type (1 for Savings, 2 for Current): ");
        int accountType = scanner.nextInt();

        System.out.println("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount account;
        if (accountType == 1) {
            account = new SavingsAccount(initialBalance);
        } else if (accountType == 2) {
            account = new CurrentAccount(initialBalance);
        } else {
            System.out.println("Invalid account type selected.");
            scanner.close();
            return;
        }

        System.out.println("Enter deposit amount (0 to skip): ");
        double depositAmount = scanner.nextDouble();
        if (depositAmount > 0) {
            account.deposit(depositAmount);
        }

        System.out.println("Enter withdrawal amount (0 to skip): ");
        double withdrawAmount = scanner.nextDouble();
        if (withdrawAmount > 0) {
            account.withdraw(withdrawAmount);
        }

        System.out.println("Account Balance: " + account.getBalance());
        scanner.close();
    }
}
