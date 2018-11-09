package gameOfLife;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

		grid = new Grid(200, 200);
		drawGame = new DrawGame(grid);

		ActionListener refresher = e -> {
            grid.getNextGen();
            repaint();
        };

		new Timer(50, refresher).start();

		panel.add(drawGame, BorderLayout.CENTER);

		setContentPane(panel);
	}

	public static void main(String[] args)
	{
		new GameOfLife().setVisible(true);
	}
}
