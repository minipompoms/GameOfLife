package gameOfLife;


import java.util.ArrayList;

public class Algorithm {
//    Any live cell with fewer than two live neighbors dies, as if caused by under population.
//    Any live cell with two or three live neighbors lives on to the next generation.
//    Any live cell with more than three live neighbors dies, as if by overpopulation.
//    Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.

    private Grid grid;


    public Algorithm(Grid grid) {
        this.grid = grid;
    }

    private Grid nextGen(Grid grid) {
        setAliveNeighbors(grid);
        for (Cell[] cellRow : grid.getGrid()) {
            for (Cell cell : cellRow) {
                switch (cell.getNumLiveNeighbors()) {
                    case (2):
                        break;
                    case (3):
                        cell.setAlive(true);
                        break;
                    default:
                        cell.setAlive(false);
                        break;
                }
            }
        }
        return grid;
    }

    private void setAliveNeighbors(Grid grid) {

        for (Cell[] cellRow : grid.getGrid()) {
            for (Cell cell : cellRow) {
                int numLiveNeighbors = 0;
                int size = cell.getAllNeighbors().size();
                for (int i = 0; i < size; i++) {
                    Cell neighbor = cell.getAllNeighbors().get(i);
                    if (neighbor.isAlive()) {
                        numLiveNeighbors++;
                    }
                }
                cell.setNumLiveNeighbors(numLiveNeighbors);
            }
        }
    }

    public Grid getNextGrid() {
        return nextGen(grid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Cell[] cellRow : grid.getGrid()) {
            for (Cell cell : cellRow) {
                if (cell.isAlive()) {
                    sb.append("*");
                } else {
                    sb.append("-");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }


}
