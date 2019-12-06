package com.streetofcode;

import com.streetofcode.printers.ExtraPrinter;
import com.streetofcode.printers.Printer;
import com.streetofcode.printers.SimplePrinter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // create objects, but use only as interface
        Printer extraPrinter = new ExtraPrinter();
        Printer simplePrinter = new SimplePrinter();
        // supply different printers to the Numbers instances
        Numbers numbers1 = new Numbers(extraPrinter);
        Numbers numbers2 = new Numbers(simplePrinter);
        // execute the numbers
        numbers1.printNumbers();
        numbers2.printNumbers();

        double testDouble = 5.0;
        float testFloat = 10.0f;
        // implicit cast. Float can be assigned to double, because double
        // has more precision
        testDouble = testFloat;
        // explicit cast. Double has to be cast to float explicitly.
        // Some precision is lost here.
        testFloat = (float) testDouble;

        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                System.out.println(i);
            }
            else if (i == 6) {
                // appending int to string implicitly converts the int
                System.out.println("Printing: " + i);
            }
            // or
            else if (i == 7 || i == 8) {
                System.out.println("i is 7 or 8.");
            }
            else {
                System.out.println("Else");
            }
        }

        String stringNumber = "9";
        int number = Integer.parseInt(stringNumber);

        // read file lines to List
        List<String> lines = new ArrayList<>();
        try {
            Path path = Paths.get("input.txt");
            Charset charset = Charset.forName("ISO-8859-1");
            lines = Files.readAllLines(path, charset);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // convert lines to integer and print them (or do anything you need to do)
        for (String line : lines) {
            int numberFromLine = Integer.valueOf(line);
            System.out.println("N: " + numberFromLine);
        }

        // read input from console (wtf? good job java)
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Please enter your name: ");
            String input = consoleReader.readLine();
            System.out.println("Hello " + input);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // we don't need to specify the generic types in creation statement
        Map<String, Integer> peopleAges = new HashMap<>();
        peopleAges.put("Gabriel", 25);
        peopleAges.put("Jakub", 26);

        System.out.println(peopleAges.get("Gabriel"));
    }
}