/*
 * ListCmd.java
 *
 * Copyright (c) 2025 Nguyen. All rights reserved.
 * This software is the confidential and proprietary information of Nguyen.
 */

package com.example.cli.cmd;

import com.example.service.ExpenseService;
import picocli.CommandLine;

/**
 * ListCmd.java
 *
 * @author Nguyen
 */
@CommandLine.Command(name = "list")
public class ListCmd implements Runnable {
    @Override
    public void run() {
        new ExpenseService().list();
    }
}
