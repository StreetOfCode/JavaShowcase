package com.streetofcode;

import com.streetofcode.printers.Printer;

public class Numbers {
    protected Printer printer;

    public Numbers(Printer printer) {
        this.printer = printer;
    }

    public void printNumbers() {
        for (int i = 0; i < 10; i++) {
            this.printer.print(String.valueOf(i));
        }
    }
}
