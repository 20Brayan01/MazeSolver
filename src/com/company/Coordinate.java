package com.company;

public class Coordinate {

    private int row;
    private int column;
    Coordinate parent;


    public Coordinate(int row, int column, Coordinate parent) {
        this.row = row;
        this.column = column;
        this.parent = parent;
    }

    //These coordinates, when added to any given coordinate, will return one of the neighboring coordinates:
    public static int[][] DIRECTIONS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    int getRow() {
        return row;
    }

    int getColumn() {
        return column;
    }
}
