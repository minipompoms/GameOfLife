package gameOfLife;

import javax.swing.*;
import java.awt.*;

public class DrawGame extends JComponent
{
	private Grid grid;

	public DrawGame(Grid grid)
	{
		this.grid = grid;

		grid.getNextGen();


	}

	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		drawGrid(g);
	}

	public void drawGrid(Graphics g)
	{
		int cellWidth = 700 / (grid.getColumns() + 1);
		int cellHeight = 700 / (grid.getRows() + 1);

		for (int width = 0; width < grid.getColumns(); width++)
		{
			for (int height = 0; height < grid.getRows(); height++)
			{
				Cell cell = grid.getCell(width, height);

				g.setColor(Color.GRAY);

				if (cell.isAlive())
				{
					g.setColor(Color.BLACK);
				}

				g.fillRect(cell.getY()*cellWidth, cell.getX()*cellHeight, cellWidth, cellHeight);
				System.out.println(grid.toString());
			}
		}
	}
}
