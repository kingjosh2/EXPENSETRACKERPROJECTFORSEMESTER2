package service;

import model.Expense;
import java.util.ArrayList;
import java.util.List;

public class ExpenseService {
    private List<Expense> expenses;

    public ExpenseService() {
        expenses = new ArrayList<>();
    }

    // Add a new expense to the list
    public void addExpense(String description, double amount) {
        Expense expense = new Expense(description, amount);
        expenses.add(expense);
    }

    // Show all expenses
    public void showExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
        } else {
            System.out.println("\nYour Expenses:");
            for (Expense e : expenses) {
                System.out.println("- " + e.getDescription() + ": $" + e.getAmount());
            }
        }
    }

    // Calculate the total amount of all expenses
    public double getTotalExpenses() {
        double total = 0;
        for (Expense e : expenses) {
            total += e.getAmount();
        }
        return total;
    }
}

