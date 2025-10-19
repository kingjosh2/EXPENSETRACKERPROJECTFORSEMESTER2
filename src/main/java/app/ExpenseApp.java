package app;

import service.ExpenseService;
import java.util.Scanner;

public class ExpenseApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExpenseService service = new ExpenseService();
        int choice;

        System.out.println("Welcome to Expense Tracker!");

        // Menu loop
        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. View Total Expenses");
            System.out.println("4. Exit");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    System.out.print("Enter description: ");
                    String desc = scanner.nextLine();

                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();

                    service.addExpense(desc, amount);
                    System.out.println("Expense added!");
                    break;

                case 2:
                    service.showExpenses();
                    break;

                case 3:
                    double total = service.getTotalExpenses();
                    System.out.println("Total Expenses: $" + total);
                    break;

                case 4:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
