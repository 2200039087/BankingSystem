import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankSystem bank = new BankSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- BANKING SYSTEM ---");
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int ch = Integer.parseInt(sc.nextLine());
            switch (ch) {
                case 1:
                    bank.createAccount(sc);
                    break;
                case 2:
                    bank.login(sc);
                    break;
                case 3:
                    System.out.println("Thanks for using the banking system.");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
// Main.java 
