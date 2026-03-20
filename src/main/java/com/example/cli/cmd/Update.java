/*
 * Update.java
 *
 * Copyright (c) 2025 Nguyen. All rights reserved.
 * This software is the confidential and proprietary information of Nguyen.
 */

package com.example.cli.cmd;

import com.example.service.ExpenseService;
import picocli.CommandLine;

/**
 * Update.java
 *
 * @author Nguyen
 */
@CommandLine.Command(name = "update")
public class Update implements Runnable {
    @CommandLine.Option(names = "--id", required = true)
    int id;

    @CommandLine.Option(names = "--description")
    String description;

    @CommandLine.Option(names = "--amount")
    double amount;

    @Override
    public void run() {
        new ExpenseService().update(id, description, amount);
    }
}
