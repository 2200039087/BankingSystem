import java.io.*;
import java.util.*;

public class FileHandler {
    private static final String ACCOUNTS_FILE = "data/accounts.txt";

    public static List<Account> readAccounts() throws IOException {
        List<Account> accounts = new ArrayList<>();
        File file = new File(ACCOUNTS_FILE);
        if (!file.exists()) file.createNewFile();

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            accounts.add(Account.fromString(line));
        }
        reader.close();
        return accounts;
    }

    public static void saveAccounts(List<Account> accounts) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(ACCOUNTS_FILE));
        for (Account acc : accounts) {
            writer.write(acc.toString());
            writer.newLine();
        }
        writer.close();
    }

    public static void appendTransaction(String accountNumber, String message) throws IOException {
        File file = new File("data/txn_" + accountNumber + ".txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
        writer.write(message);
        writer.newLine();
        writer.close();
    }

    public static void showTransactionHistory(String accountNumber) throws IOException {
        File file = new File("data/txn_" + accountNumber + ".txt");
        if (!file.exists()) {
            System.out.println("No transactions found.");
            return;
        }

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
// FileHandler.java 
