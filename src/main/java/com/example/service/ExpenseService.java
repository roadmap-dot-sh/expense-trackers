/*
 * ExpenseService.java
 *
 * Copyright (c) 2025 Nguyen. All rights reserved.
 * This software is the confidential and proprietary information of Nguyen.
 */

package com.example.service;

import com.example.model.Expense;
import com.example.storage.JsonStorage;

import java.time.LocalDate;
import java.util.List;

/**
 * ExpenseService.java
 *
 * @author Nguyen
 */
public class ExpenseService {
    private final JsonStorage storage = new JsonStorage();
    private List<Expense> expenses;

    public ExpenseService() {
        expenses = storage.load();
    }

    private int nextId() {
        return expenses.stream()
                .mapToInt(Expense::getId).max().orElse(0) + 1;
    }

    public void add(String desc, double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");

        Expense e = new Expense();
        e.setId(nextId());
        e.setDescription(desc);
        e.setAmount(amount);
        e.setDate(LocalDate.now());

        expenses.add(e);
        storage.save(expenses);

        System.out.println("Expense added successfully (ID: " + e.getId() + ")");
    }

    public void list() {
        System.out.printf("%-3s %-10s %-15s %-10s\n", "ID", "Date", "Description", "Amount");
        for (Expense e : expenses) {
            System.out.printf("%-3d %-10s %-15s $%.2f\n",
                    e.getId(), e.getDate(), e.getDescription(), e.getAmount());
        }
    }

    public void delete(int id) {
        boolean removed = expenses.removeIf(e -> e.getId() == id);
        if (!removed) {
            System.out.println("Expense not found");
            return;
        }
        storage.save(expenses);
        System.out.println("Expense deleted successfully");
    }

    public void update(int id, String desc, Double amount) {
        for (Expense e : expenses) {
            if (e.getId() == id) {
                if (desc != null) e.setDescription(desc);
                if (amount != null) e.setAmount(amount);
                storage.save(expenses);
                System.out.println("Updated successfully");
                return;
            }
        }
        System.out.println("Expense not found");
    }

    public void summary(Integer month) {
        double total = expenses.stream()
                .filter(e -> month == null || e.getDate().getMonthValue() == month)
                .mapToDouble(Expense::getAmount)
                .sum();

        if (month == null) {
            System.out.println("Total expenses: $" + total);
        } else {
            System.out.println("Total expenses for month " + month + ": $" + total);
        }
    }
}
