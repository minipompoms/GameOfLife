package gameOfLife;

import java.awt.*;
import java.util.ArrayList;

public class Cell {

    private Point point;
    private boolean isAlive;
    ArrayList<Cell> neighbors = new ArrayList<>();


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

    public ArrayList<Cell> setAllNeighbors(Cell cell) {
        Point point = new Point();
        int x = cell.getPoint().x;
        int y = cell.getPoint().y;
        point.setLocation(x-1,y-1 );
        cell.setPoint(point);
        neighbors.add(cell);
        point.setLocation(x-1, y);
        cell.setPoint(point);
        neighbors.add(cell);
        point.setLocation(x-1, y+1);
        cell.setPoint(point);
        neighbors.add(cell);
        point.setLocation(x-1, y+1);
        cell.setPoint(point);
        neighbors.add(cell);
        point.setLocation(x, y-1);
        cell.setPoint(point);
        neighbors.add(cell);
        point.setLocation(x, y+1);
        cell.setPoint(point);
        neighbors.add(cell);
        point.setLocation(x+1, y-1);
        cell.setPoint(point);
        neighbors.add(cell);
        point.setLocation(x+1, y);
        cell.setPoint(point);
        neighbors.add(cell);
        point.setLocation(x+1, y+1);
        cell.setPoint(point);
        neighbors.add(cell);
        return neighbors;
    }

    }
