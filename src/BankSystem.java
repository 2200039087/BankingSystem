import java.util.*;
import java.io.*;

public class BankSystem {
    private List<Account> accounts;

    public BankSystem() {
        try {
            accounts = FileHandler.readAccounts();
        } catch (IOException e) {
            accounts = new ArrayList<>();
        }
    }

    public void createAccount(Scanner sc) {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        String accNo = UUID.randomUUID().toString().substring(0, 8);
        System.out.print("Set 4-digit PIN: ");
        String pin = sc.nextLine();
        Account acc = new Account(accNo, name, pin, 0.0);
        accounts.add(acc);
        saveData();
        System.out.println("Account created. Account No: " + accNo);
    }

    public void login(Scanner sc) {
        System.out.print("Enter account number: ");
        String accNo = sc.nextLine();
        System.out.print("Enter PIN: ");
        String pin = sc.nextLine();

        Account user = findAccount(accNo, pin);
        if (user != null) {
            userMenu(sc, user);
        } else {
            System.out.println("Invalid credentials.");
        }
    }

    private void userMenu(Scanner sc, Account user) {
        while (true) {
            System.out.println("\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. Transactions\n5. Logout");
            System.out.print("Select: ");
            int choice = Integer.parseInt(sc.nextLine());
            try {
                switch (choice) {
                    case 1:
                        System.out.println("Balance: ₹" + user.getBalance());
                        break;
                    case 2:
                        System.out.print("Enter amount: ");
                        double dep = Double.parseDouble(sc.nextLine());
                        user.deposit(dep);
                        FileHandler.appendTransaction(user.getAccountNumber(), "Deposited ₹" + dep);
                        saveData();
                        break;
                    case 3:
                        System.out.print("Enter amount: ");
                        double wd = Double.parseDouble(sc.nextLine());
                        if (user.withdraw(wd)) {
                            FileHandler.appendTransaction(user.getAccountNumber(), "Withdrew ₹" + wd);
                            saveData();
                        } else {
                            System.out.println("Insufficient balance.");
                        }
                        break;
                    case 4:
                        FileHandler.showTransactionHistory(user.getAccountNumber());
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private Account findAccount(String accNo, String pin) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accNo) && acc.getPin().equals(pin)) {
                return acc;
            }
        }
        return null;
    }

    private void saveData() {
        try {
            FileHandler.saveAccounts(accounts);
        } catch (IOException e) {
            System.out.println("Error saving data.");
        }
    }
}
// BankSystem.java 
