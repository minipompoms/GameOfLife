package test;

import gameOfLife.Cell;
import gameOfLife.Grid;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class CellTest {

    Grid grid = new Grid(3, 3);
    Cell cell = new Cell(1, 1, grid);


    @Test
    public void addNeighbors() {
        cell.setAllNeighbors();
        assertEquals(8, cell.getAllNeighbors().size());
    }

    @Test
    public void aliveNeighbors() {
        cell.setNumLiveNeighbors(4);
        assertEquals(4, cell.getNumLiveNeighbors());
    }

    @Test
    public void containsNeighbors() {
        cell.setAllNeighbors();
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    j++;
                }
                assertEquals(i, cell.getAllNeighbors().get(count).getX());
                assertEquals(j, cell.getAllNeighbors().get(count).getY());

                count++;
            }
        }
    }


}
