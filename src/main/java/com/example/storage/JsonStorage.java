/*
 * JsonStorage.java
 *
 * Copyright (c) 2025 Nguyen. All rights reserved.
 * This software is the confidential and proprietary information of Nguyen.
 */

package com.example.storage;

import com.example.model.Expense;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * JsonStorage.java
 *
 * @author Nguyen
 */
public class JsonStorage {
    private static final String FILE = "expense.json";
    private final ObjectMapper mapper = new ObjectMapper();

    public List<Expense> load() {
        try {
            File file = new File(FILE);
            if (!file.exists()) {
                return new ArrayList<>();
            }

            return new ArrayList<>(Arrays.asList(mapper.readValue(file, Expense[].class)));
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    public void save(List<Expense> expenses) {
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(FILE), expenses);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
