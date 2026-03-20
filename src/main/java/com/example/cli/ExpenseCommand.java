/*
 * ExpenseCommand.java
 *
 * Copyright (c) 2025 Nguyen. All rights reserved.
 * This software is the confidential and proprietary information of Nguyen.
 */

package com.example.cli;

import com.example.cli.cmd.*;
import picocli.CommandLine;

/**
 * ExpenseCommand.java
 *
 * @author Nguyen
 */
@CommandLine.Command(name = "expense-tracker", mixinStandardHelpOptions = true,
        subcommands = {Add.class, ListCmd.class, Delete.class, Summary.class, Update.class})
public class ExpenseCommand implements Runnable {
    @Override
    public void run() {
        System.out.println("Use subcommand");
    }
}
