package gameOfLife;

import java.awt.*;
import java.util.ArrayList;

public class Cell {

    private int x;
    private int y;
    private boolean isAlive;
    private Grid grid;
    private ArrayList<Cell> allNeighbors = new ArrayList<>();
    private int numLiveNeighbors;


    public Cell(int x, int y, Grid grid) {
        this.x = x;
        this.y = y;
        this.grid = grid;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public ArrayList<Cell> setAllNeighbors() {
        if (verifyPoint(x-1, y-1)){
            allNeighbors.add(grid.getCell(x-1,y-1));}
        if (verifyPoint(x-1, y)){
            allNeighbors.add(grid.getCell(x-1, y));}
        if (verifyPoint(x-1, y+1)){
            allNeighbors.add(grid.getCell(x-1,y+1));}
        if (verifyPoint(x, y-1)){
            allNeighbors.add(grid.getCell(x,y-1));}
        if (verifyPoint(x, y+1)){
            allNeighbors.add(grid.getCell(x,y+1));}
        if (verifyPoint(x+1, y-1)){
            allNeighbors.add(grid.getCell(x+1,y-1));}
        if (verifyPoint(x+1, y)){
            allNeighbors.add(grid.getCell(x+1,y));}
        if (verifyPoint(x+1, y+1)){
            allNeighbors.add(grid.getCell(x+1,y+1));}
        return allNeighbors;
    }

    public boolean verifyPoint(int x,int y){
        return grid.contains(x,y);
    }

    public ArrayList<Cell> getAllNeighbors() {
        return allNeighbors;
    }

    public void setNumLiveNeighbors(int numLiveNeighbors) {
        this.numLiveNeighbors = numLiveNeighbors;
    }

    public int getNumLiveNeighbors() {
        return numLiveNeighbors;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
}
