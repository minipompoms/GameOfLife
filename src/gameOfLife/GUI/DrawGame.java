package gameOfLife.GUI;

import gameOfLife.Cell;
import gameOfLife.Grid;

import javax.swing.*;
import java.awt.*;

public class DrawGame extends JComponent
{
	private Grid grid;

	public DrawGame(Grid grid)
	{
		this.grid = grid;
	}

	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		drawGrid(g);
	}

	public void drawGrid(Graphics g)
	{
		int cellWidth = this.getWidth() / grid.getColumns();
		int cellHeight = this.getHeight() / grid.getRows();

		for (int width = 0; width < grid.getColumns(); width++)
		{
			for (int height = 0; height < grid.getRows(); height++)
			{
				Cell cell = grid.getCell(width, height);

				if (cell.isAlive())
				{
					g.setColor(Color.BLACK);
					g.fillRect(cell.getY() * cellWidth, cell.getX() * cellHeight, cellWidth, cellHeight);
				}
				else
				{
					g.setColor(Color.LIGHT_GRAY);
					g.drawRect(cell.getY() * cellWidth, cell.getX() * cellHeight, cellWidth, cellHeight);
				}
			}
		}
	}
}
