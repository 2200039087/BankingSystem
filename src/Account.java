// Account.java 
import java.io.Serializable;

public class Account implements Serializable {
    private String accountNumber;
    private String name;
    private String pin;
    private double balance;

    public Account(String accountNumber, String name, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getName() { return name; }
    public String getPin() { return pin; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return accountNumber + "," + name + "," + pin + "," + balance;
    }

    public static Account fromString(String data) {
        String[] parts = data.split(",");
        return new Account(parts[0], parts[1], parts[2], Double.parseDouble(parts[3]));
    }
}
