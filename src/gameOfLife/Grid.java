package gameOfLife;


import java.awt.*;

public class Grid {

    private int rows;
    private int columns;
    private Cell[][] grid;

    public Grid(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        this.grid = new Cell[rows][columns];
    }

    public void setGrid(){
        int x = 0;
        int y = 0;
        Point point = new Point(x,y);

        for(x = 0; x < rows; x++){
            for (y = 0; y < columns; y++){
                Cell cell = new Cell(point)  ;
            }
        }
    }



}
