package test;

import gameOfLife.Cell;
import gameOfLife.Grid;
import gameOfLife.NextGeneration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NextGenerationTest {

    Grid grid = new Grid(3, 3);
    NextGeneration nexGen = new NextGeneration(grid);

    @Test
    public void nextGenerationNeighbors(){
        for (Cell cell : grid.getCell(1, 1).getAllNeighbors()) {
            cell.setAlive(false);
        }
        grid.getCell(1, 1).setAlive(false);

        assertEquals(nexGen.toString(), "---\n" + "---\n" + "---\n");

        grid.getCell(1, 0).setAlive(true);
        grid.getCell(1, 1).setAlive(true);
        grid.getCell(1, 2).setAlive(true);
        
        assertEquals(nexGen.toString(),  "---\n" + "***\n" + "---\n");
        nexGen.getNextGrid();
        assertEquals(nexGen.toString(),  "-*-\n" + "-*-\n" + "-*-\n");
        grid.getCell(1, 1).setAlive(false);

        assertEquals(nexGen.toString(),"-*-\n" + "---\n" + "-*-\n");



    }

}
