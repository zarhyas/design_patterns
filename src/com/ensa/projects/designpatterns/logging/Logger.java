package com.ensa.projects.designpatterns.logging;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private String logFileName;

    public Logger(String logFileName) {
        this.logFileName = logFileName;
    }

    public void log(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFileName, true))) {
            writer.write(message);
            writer.newLine();
        } catch (IOException e) {
            // Handle or log the exception here
            e.printStackTrace();
        }
    }
}

