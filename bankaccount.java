import java.util.Scanner;

public class SimpleBankingSystem {

    static double balance = 0.0;

    public static void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public static void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    public static void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int choice;
        double amount;

        System.out.println("== Simple Banking System ==");

        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            choice = s.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    amount = s.nextDouble();
                    deposit(amount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    amount = s.nextDouble();
                    withdraw(amount);
                    break;

                case 3:
                    checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using our service.");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }

        } while (choice != 4);

        s.close();
    }
}