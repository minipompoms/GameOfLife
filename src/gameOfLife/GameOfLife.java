package gameOfLife;

import javax.swing.*;
import java.awt.*;

public class GameOfLife extends JFrame
{
	private  Grid grid;
	private DrawGame drawGame;
	public GameOfLife()
	{
		setTitle("Game of Life");
		setSize(700, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());

		grid = new Grid(50, 50);
		drawGame = new DrawGame(grid);

		/*try
		{
			Thread.sleep(1000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}*/

		repaint();

		panel.add(drawGame, BorderLayout.CENTER);

		setContentPane(panel);
	}

	public static void main(String[] args)
	{
		new GameOfLife().setVisible(true);
	}
}
