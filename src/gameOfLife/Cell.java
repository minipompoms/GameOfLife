package gameOfLife;

import java.awt.*;
import java.util.ArrayList;

public class Cell {

    private Point point;
    private boolean isAlive;
    ArrayList<Cell> neighbors;// = new ArrayList<>();
    private ArrayList<Cell> aliveNeighbors;

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
    //can we do it all in one method, instead of creating 2 array lists?
    public void setAllNeighbors(Cell cell) {
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
        //return neighbors;
        setAliveNeighbors();
    }

    public void setAliveNeighbors(){
        int size = neighbors.size();
        for(int i = 0; i < size; i++) {
            Cell neighbor = neighbors.get(i);
            if(neighbor.isAlive()){
                aliveNeighbors.add(neighbor);
            }
        }
    }

    public ArrayList<Cell> getAliveNeighbors() {
        return aliveNeighbors;
    }
}
