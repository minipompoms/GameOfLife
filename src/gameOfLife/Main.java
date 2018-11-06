package gameOfLife;

//temp class
public class Main {

    public static void main(String [] args){
        int generations = 10;
        Grid lifeGrid = new Grid(10, 10);
        for (int i = 0; i < generations; i++)
            lifeGrid.getNextGen();
            System.out.println(lifeGrid.toString());
    }
}
