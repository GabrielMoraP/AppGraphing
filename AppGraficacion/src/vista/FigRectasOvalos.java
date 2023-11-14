package vista;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class FigRectasOvalos extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FigRectasOvalos() {
		setTitle("FIGURAS JAVA");
		getContentPane().setBackground(Color.WHITE);
		setExtendedState(MAXIMIZED_BOTH);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		g.setColor(Color.BLACK);
		g.drawLine(5, 30, 350, 30);

		int x = 0;
		int y = 0;
		int distance = 0;
		
		g.setColor(Color.BLACK);
		g.drawRect(5, 40, 50, 50);
		x = 5 + (50 / 2);
		y = 40 + (50 / 2);
		distance = 50 / 2;
		g.setColor(Color.BLACK);
		g.drawLine(x, y, x, y + distance);
		
		g.setColor(Color.BLACK);
		g.fillRect(100, 40, 50, 50);
		x = 100 + (50 / 2);
		y = 40 + (50 / 2);
		distance = 50 / 2;
		g.setColor(Color.WHITE);
		g.drawLine(x, y, x, y + distance);
		
		
		g.setColor(Color.BLACK);
		g.draw3DRect(5, 100, 90, 55, true);
		x = 5 + (90 / 2);
		y = 100 + (55 / 2);
		distance = 55 / 2;
		g.setColor(Color.BLACK);
		g.drawLine(x, y, x, y + distance);
		
		g.setColor(Color.BLACK);
		g.fill3DRect(100, 100, 90, 55, true);
		x = 100 + (90 / 2);
		y = 100 + (55 / 2);
		distance = 55 / 2;
		g.setColor(Color.WHITE);
		g.drawLine(x, y, x, y + distance);
		
		g.setColor(Color.BLACK);
		g.fillRoundRect(195, 40, 90, 55, 50, 50);
		x = 195 + (90 / 2);
		y = 40 + (55 / 2);
		distance = 55 / 2;
		g.setColor(Color.WHITE);
		g.drawLine(x, y, x, y + distance);
		
		g.setColor(Color.BLACK);
		g.drawRoundRect(290, 40, 90, 55, 20, 20);
		x = 290 + (90 / 2);
		y = 40 + (55 / 2);
		distance = 55 / 2;
		g.setColor(Color.BLACK);
		g.drawLine(x, y, x, y + distance);
		
		g.setColor(Color.BLACK);
		g.drawOval(195, 100, 90, 55);
		x = 195 + (90 / 2);
		y = 100 + (55 / 2);
		distance = 55 / 2;
		g.setColor(Color.BLACK);
		g.drawLine(x, y, x, y + distance);
		
		g.setColor(Color.BLACK);
		g.fillOval(290, 100, 90, 55);
		x = 290 + (90 / 2);
		y = 100 + (55 / 2);
		distance = 55 / 2;
		g.setColor(Color.WHITE);
		g.drawLine(x, y, x, y + distance);
		
	}
	
	public static void main(String[] args) {
		FigRectasOvalos panel = new FigRectasOvalos();
		panel.setVisible(true);
	}
}