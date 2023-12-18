package com.example.geektrust;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Sample code to read from file passed as command line argument
        try {
            // the file to be opened for reading
            FileInputStream fis = new FileInputStream(args[0]);
            Scanner sc = new Scanner(fis); // file to be scanned
            // returns true if there is another line to read
            while (sc.hasNextLine()) {
               //Add your code here to process input commands
                final String input = sc.nextLine();
                if (input.contains("ALLOCATE")) {
                    final AllocationService allocationService = new AllocationService();
                    final Allocation allocation = allocationService.allocate(input);
                    System.out.println(allocation);
                }
            }
            sc.close(); // closes the scanner
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
