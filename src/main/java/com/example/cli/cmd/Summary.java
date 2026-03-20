/*
 * Summary.java
 *
 * Copyright (c) 2025 Nguyen. All rights reserved.
 * This software is the confidential and proprietary information of Nguyen.
 */

package com.example.cli.cmd;

import com.example.service.ExpenseService;
import picocli.CommandLine;

/**
 * Summary.java
 *
 * @author Nguyen
 */
@CommandLine.Command(name = "summary")
public class Summary implements Runnable {
    @CommandLine.Option(names = "--month")
    Integer month;
    
    @Override
    public void run() {
        new ExpenseService().summary(month);
    }
}
