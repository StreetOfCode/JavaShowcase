package com.streetofcode.printers;

public class SimplePrinter implements Printer {
    @Override
    public void print(String s) {
        System.out.println(s);
    }
}
