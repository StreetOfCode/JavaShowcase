package com.streetofcode.printers;

public class ExtraPrinter implements Printer {
    @Override
    public void print(String s) {
        System.out.println("Printing: " + s);
    }
}
