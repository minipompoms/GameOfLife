package test;

import gameOfLife.Cell;
import gameOfLife.Grid;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GridTest {

    Grid grid = new Grid(3, 3);
    Cell cell = new Cell(1, 1, grid);

    @Test
    public void setGrid() {
        assertEquals(3, grid.getColumns());
        assertEquals(3, grid.getRows());
    }

    @Test
    public void containsCell() {
        assertTrue(grid.contains(cell.getX(), cell.getY()));
    }

    @Test
    public void cellStatus() {
        grid.getCell(cell.getX(), cell.getY()).setAlive(false);
        assertFalse(grid.getCell(cell.getX(), cell.getY()).isAlive());
    }

    @Test
    public void aliveNeighbors() {
        cell.setNumLiveNeighbors(4);
        assertEquals(4, cell.getNumLiveNeighbors());
    }

    @Test
    public void nextGeneration() {
        for (Cell cell : grid.getCell(cell.getX(), cell.getY()).getAllNeighbors()) {
            cell.setAlive(false);
        }

        grid.getCell(1, 0).setAlive(true);
        grid.getCell(1, 1).setAlive(true);
        grid.getCell(1, 2).setAlive(true);
        grid.getNextGen();

        assertTrue(grid.getCell(0, 1).isAlive());
        assertTrue(grid.getCell(1, 1).isAlive());
        assertTrue(grid.getCell(2, 1).isAlive());
    }
}
