/*
 * Add.java
 *
 * Copyright (c) 2025 Nguyen. All rights reserved.
 * This software is the confidential and proprietary information of Nguyen.
 */

package com.example.cli.cmd;

import com.example.service.ExpenseService;
import picocli.CommandLine;

/**
 * Add.java
 *
 * @author Nguyen
 */
@CommandLine.Command(name = "add")
public class Add implements Runnable {
    @CommandLine.Option(names = "--description", required = true)
    String description;

    @CommandLine.Option(names = "--amount", required = true)
    double amount;
    
    @Override
    public void run() {
        new ExpenseService().add(description, amount);
    }
}
