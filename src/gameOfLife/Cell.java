package gameOfLife;

import java.awt.*;

public class Cell {

    private Point point;
    private boolean isAlive;

    public Cell(Point point){
        this.point = point;
    }


    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean isAlive() {
        return isAlive;
    }
}
