package gameOfLife;


import java.util.Random;

public class Grid {

    private final int rows;
    private final int columns;
    private Cell[][] grid;
    private final Random RANDOM = new Random();
    private NextGeneration nextGeneration = new NextGeneration(this);
    private boolean cellState;

    public Grid(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.grid = new Cell[this.rows][this.columns];

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

    public void getNextGen() {
        nextGeneration.getNextGrid();
    }

    public Cell getCell(int x, int y) {
        return grid[x][y];
    }

    public Cell[][] getGrid() {
        return grid;
    }

    public int getRows()
    {
        return rows;
    }

    public int getColumns()
    {
        return columns;
    }

    public boolean contains(int x, int y) {
        return (x < rows) && (y < columns) && (x >= 0) && (y >= 0);
    }
    @Override
    public String toString() {
        return nextGeneration.toString();
    }
}
