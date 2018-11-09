package gameOfLife.GUI;

import gameOfLife.Grid;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameOfLife extends JFrame {
    private Grid grid;
    private DrawGame drawGame;

    public GameOfLife() {
        setTitle("Game of Life");
        setSize(700, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        Border border = BorderFactory.createEmptyBorder(20, 20, 20, 20);
        panel.setLayout(new BorderLayout());
        panel.setBorder(border);
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

    public static void main(String[] args) {
        new GameOfLife().setVisible(true);
    }
}
