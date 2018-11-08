package gameOfLife;


import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Grid {

    private final int rows;
    private final int columns;
    private Cell[][] grid;
    private final Random RANDOM = new Random();
    private Algorithm algorithm = new Algorithm(this);
    private boolean cellState;

    public Grid(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.grid = new Cell[this.rows][this.columns];

        //call in the constructor to create
        mapGrid();
        setupNeighbors();
    }

    public void mapGrid() {
        int x;
        int y;
        for (x = 0; x < rows; x++) {
            for (y = 0; y < columns; y++) {
                cellState = RANDOM.nextBoolean();
                Cell cell = new Cell(x, y, this);
                grid[x][y] = cell;
                cell.setAlive(cellState);
            }
        }
    }

    private void setupNeighbors() {
        for (Cell[] cellRow : grid) {
            for (Cell cell : cellRow) {
                cell.setAllNeighbors();
            }

        }
    }

    void getNextGen() {
        algorithm.getNextGrid();
    }

    public Cell getCell(int x, int y) {
        return grid[x][y];
    }

    public Cell[][] getGrid() {
        return grid;
    }

    @Override
    public String toString() {
        return algorithm.toString();
    }

    public boolean contains(int x, int y) {
        return (x < rows) && (y < columns) && (x >= 0) && (y >= 0);
    }
}
