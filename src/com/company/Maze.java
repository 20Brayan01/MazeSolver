package com.company;

public class Maze {

    public Maze(int[][] map) {
        this.map = map;
    }

    private int[][] map;

    //    0-> Road,  1-> Wall, 2-> Maze entry, 3-> Maze exit, 4-> Cell part of the path from entry to exit
    private int road = 0;
    private int wall = 1;
    private int entry = 2;
    private int exit = 3;
    private int cell = 4;
    private Coordinate start;
    private Coordinate end;


    Coordinate getEntry() {
    return   start;
     }

}
