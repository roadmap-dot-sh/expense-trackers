/*
 * Delete.java
 *
 * Copyright (c) 2025 Nguyen. All rights reserved.
 * This software is the confidential and proprietary information of Nguyen.
 */

package com.example.cli.cmd;

import com.example.service.ExpenseService;
import picocli.CommandLine;

/**
 * Delete.java
 *
 * @author Nguyen
 */
@CommandLine.Command(name = "delete")
public class Delete implements Runnable {
    @CommandLine.Option(names = "--id", required = true)
    int id;

    @Override
    public void run() {
        new ExpenseService().delete(id);
    }
}
