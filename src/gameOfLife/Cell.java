package gameOfLife;

import java.awt.*;
import java.util.ArrayList;

public class Cell {

    private Point point;
    private boolean isAlive;
    private ArrayList<Cell> allNeighbors;

    public Cell(Point point){
        this.point = point;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }


    //is there a better way?
    //need to validate points to ensure they are in the grid
    //can we do this without making a new point, and instead access the cells in the grid?
    public ArrayList<Cell> setAllNeighbors(Cell cell) {
        Point point = new Point();
        int x = cell.getPoint().x;
        int y = cell.getPoint().y;
        point.setLocation(x-1,y-1 );
        cell.setPoint(point);
        allNeighbors.add(cell);
        point.setLocation(x-1, y);
        cell.setPoint(point);
        allNeighbors.add(cell);
        point.setLocation(x-1, y+1);
        cell.setPoint(point);
        allNeighbors.add(cell);
        point.setLocation(x-1, y+1);
        cell.setPoint(point);
        allNeighbors.add(cell);
        point.setLocation(x, y-1);
        cell.setPoint(point);
        allNeighbors.add(cell);
        point.setLocation(x, y+1);
        cell.setPoint(point);
        allNeighbors.add(cell);
        point.setLocation(x+1, y-1);
        cell.setPoint(point);
        allNeighbors.add(cell);
        point.setLocation(x+1, y);
        cell.setPoint(point);
        allNeighbors.add(cell);
        point.setLocation(x+1, y+1);
        cell.setPoint(point);
        allNeighbors.add(cell);
        return allNeighbors;
        //setAliveNeighbors();
    }

    public ArrayList<Cell> getAllNeighbors() {
        return allNeighbors;
    }
}
