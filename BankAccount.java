
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Amount: " + amount);
        } else {
            System.out.println("Deposit amount should be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful. Amount: " + amount);
            } else {
                System.out.println("Insufficient funds for withdrawal.");
            }
        } else {
            System.out.println("Withdrawal amount should be positive.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.printf("Balance: %.2f\n", balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC123456", 0);

        System.out.println("Initial Account Details:");
        account.displayAccountInfo();

        account.deposit(2000);
        account.withdraw(8000);
        account.withdraw(3000);

        System.out.println("Final Account Details:");
        account.displayAccountInfo();
    }
}
