package model;

// This class holds the structure of an expense
public class Expense {
    private String description;
    private double amount;

    // Constructor to create a new expense
    public Expense(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Getter for amount
    public double getAmount() {
        return amount;
    }
}

