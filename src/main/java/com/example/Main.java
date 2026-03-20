package com.example;

import com.example.cli.ExpenseCommand;
import picocli.CommandLine;

public class Main {
    public static void main(String[] args) {
        int exitCode = new CommandLine(new ExpenseCommand()).execute(args);
        System.exit(exitCode);
    }
}