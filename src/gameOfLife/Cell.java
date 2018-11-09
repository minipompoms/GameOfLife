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

    public void setAllNeighbors() {
        setNeighbor(x - 1, y - 1);
        setNeighbor(x - 1, y);
        setNeighbor(x - 1, y + 1);
        setNeighbor(x, y - 1);
        setNeighbor(x, y + 1);
        setNeighbor(x + 1, y - 1);
        setNeighbor(x + 1, y);
        setNeighbor(x + 1, y + 1);
    }

    public void setNeighbor(int x, int y) {
        if (grid.contains(x, y)) {
            allNeighbors.add(grid.getCell(x, y));
        }
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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
