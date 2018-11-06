package gameOfLife;


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
        int liveNeighbors;
        for (Cell[] cellRow : grid.getGrid()) {
            for (Cell cell : cellRow) {
                liveNeighbors = cell.getAliveNeighbors().size();
                switch (liveNeighbors){
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

    public Grid getNextGrid() {
        nextGen(grid);
        return grid;
    }
}
