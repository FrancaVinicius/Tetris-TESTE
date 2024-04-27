package tetris;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Quadro extends JPanel {
	
	public static final int BOARD_WIDHT = 10;
	public static final int BOARD_HEIGHT = 20;
	public static final int BLOCK_SIZE = 30;
	private Timer looper;
	private Color[][] board = new Color[BOARD_WIDHT][BOARD_HEIGHT];
	
	public Quadro () {
		looper = new Timer(500, new ActionListener() {
			int n = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(n++);
				
			}
			
		});
		looper.start();
		
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.setColor(Color.black);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		g.setColor(Color.white);
		for(int row = 0; row < BOARD_HEIGHT; row++) {
			g.drawLine(0, BLOCK_SIZE * row, BLOCK_SIZE * BOARD_WIDHT, BLOCK_SIZE * row);
		}
		
		for(int col = 0; col < BOARD_WIDHT + 1; col++) {
			g.drawLine(col * BLOCK_SIZE, 0, col * BLOCK_SIZE, BLOCK_SIZE * BOARD_HEIGHT);
		}	
	}
	
}
