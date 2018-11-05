package gameOfLife;


import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Grid {

    private final int rows;
    private final int columns;
    private Cell [][] grid;
    private final Random RANDOM = new Random();
    private ArrayList<Cell> aliveNeighbors;

    public Grid(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        this.grid = new Cell[this.rows][this.columns];
    }

    public void mapGrid(){
        boolean cellState = RANDOM.nextBoolean();
        int x;
        int y;
        for(x = 0; x < rows; x++){
            for (y = 0; y < columns; y++){
                Point point = new Point(x,y);
                grid[x][y] = new Cell(point);
                grid[x][y].setAlive(cellState);
            }
        }
    }

    public Cell getCell(){
        return grid[rows][columns];
    }

    public ArrayList<Cell> setAliveNeighbors(Cell cell){
        aliveNeighbors = new ArrayList<>();
        int size = cell.setAllNeighbors(cell).size();
        for(int i = 0; i < size; i++) {
            Cell neighbor = cell.neighbors.get(i);
            if(neighbor.isAlive()){
                aliveNeighbors.add(neighbor);
            }
        }
      return aliveNeighbors;
    }
}
