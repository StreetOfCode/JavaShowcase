package com.streetofcode;

// a class to partially demonstrate the minesweeper game field and the use of encapsulation
public class Field {
    public int[] getShape() {
        return shape;
    }

    public void setShape(int[] shape) {
        this.shape = shape;
        initialize();
    }

    public int getWidth() {
        return shape[0];
    }

    public int getHeight() {
        return shape[1];
    }

    private int[] shape;
    private int numberOfMines;

    public Field(int[] shape, int numberOfMines) {
        this.shape = shape;
        this.numberOfMines = numberOfMines;
    }

    public void initialize() {

    }
}
