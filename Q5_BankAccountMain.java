class BankAccount {
    protected double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= 100) {
            balance -= amount;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Withdrawal denied. Minimum balance of 100 required.");
        }
    }
}

public class Q5_BankAccountMain {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(500);

        account.deposit(200);
        account.withdraw(550);
        account.displayBalance();
    }
}