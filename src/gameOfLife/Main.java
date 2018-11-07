package gameOfLife;

//temp class
public class Main {

    public static void main(String [] args){
        int generations = 10;
        Grid grid = new Grid(10, 10);
        for (int i = 0; i < generations; i++)
            grid.getNextGen();
            System.out.println(grid.toString());
    }
}
