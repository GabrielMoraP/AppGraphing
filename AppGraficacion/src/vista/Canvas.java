package vista;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

import javax.swing.JPanel;

import modelo.Circulo;
import modelo.Cuadrado;
import modelo.CurvaBezier;
import modelo.Triangulo;

public class Canvas extends JPanel implements MouseListener, MouseMotionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String figura = "";

	private ArrayList<Cuadrado> c = new ArrayList<Cuadrado>();
	private ArrayList<Circulo> ci = new ArrayList<Circulo>();
	private ArrayList<Triangulo> tri = new ArrayList<Triangulo>();
	private ArrayList<CurvaBezier> curB = new ArrayList<CurvaBezier>();

	private int x, y;
	private int x1, x2, y1, y2;
	private Point lastMousePosition = new Point();
	private boolean draw = false;

	private Point2D[] keyPointP = new Point2D[4];
	private Ellipse2D.Double[] keyPointE = new Ellipse2D.Double[4];;
	private int keyPointNum = 0;
	private int keyPointID = -1;
	private double t = 0.001;

	public Canvas() {
		setFont(new Font("Product Sans", Font.PLAIN, 20));
		setBackground(new Color(17, 27, 33));
		setForeground(Color.WHITE);
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		setVisible(true);
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void seleccionarFigura(String figura) {
		this.figura = figura;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString(x + " , " + y + " " + figura, 20, 30);
		if (draw) {
			int width = this.x1 - this.x2;
			int height = this.y1 - this.y2;
			x = width < 0 ? x1 : x2;
			y = height < 0 ? y1 : y2;
			if (figura.equals("Cuadrado")) {
				g.drawPolygon(new Cuadrado(x1, y1, x2, y2));
			} else if (figura.equals("Circulo")) {
				g.drawPolygon(new Circulo(x1, y1, x2, y2));
			} else if (figura.equals("Triangulo")) {
				g.drawPolygon(new Triangulo(x1, y1, x2, y2));
			} else if (figura.equals("Bezier")) {
				drawBezier(g, new CurvaBezier(keyPointP, keyPointE, keyPointNum, t), t);
			}
		}
		drawCuadrado(g);
		drawCirculo(g);
		drawTriangulo(g);
		drawCurvas(g);
	}

	private void drawCuadrado(Graphics g) {
		for (int i = 0; i < c.size(); i++) {
			g.setColor(Color.MAGENTA);
			Cuadrado tmp = c.get(i);
			g.drawPolygon(tmp);
			repaint();
		}
	}

	private void drawCirculo(Graphics g) {
		for (int i = 0; i < ci.size(); i++) {
			g.setColor(Color.YELLOW);
			Circulo tmp = ci.get(i);
			g.drawPolygon(tmp);
			repaint();
		}
	}

	private void drawTriangulo(Graphics g) {
		for (int i = 0; i < tri.size(); i++) {
			g.setColor(Color.CYAN);
			Triangulo tmp = tri.get(i);
			g.drawPolygon(tmp);
			repaint();
		}
	}

	private void drawCurvas(Graphics g) {
		for (int i = 0; i < curB.size(); i++) {
			g.setColor(Color.WHITE);
			CurvaBezier tmp = curB.get(i);
			drawBezier(g, tmp, t);
			repaint();
		}
	}

	public void drawBezier(Graphics gs, CurvaBezier curva, double t) {
		Graphics2D g = (Graphics2D) gs;
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.WHITE);
		for (int i = 0; i < curva.getKeyPointNum(); i++) {
			if (i > 0 && i < (curva.getKeyPointNum() - 1)) {
				g.fill(curva.getKeyPointE()[i]);
			} else {
				g.draw(curva.getKeyPointE()[i]);
			}
			if (curva.getKeyPointNum() > 1 && i < (curva.getKeyPointNum() - 1)) {
				g.drawLine((int) curva.getKeyPointP()[i].getX(), (int) curva.getKeyPointP()[i].getY(),
						(int) curva.getKeyPointP()[i + 1].getX(), (int) curva.getKeyPointP()[i + 1].getY());
			}
		}
		if (curva.getKeyPointNum() == 3) {
			for (double k = curva.getT(); k <= 1 + curva.getT(); k += curva.getT()) {
				g.setColor(new Color(155, 46, 254));
				Point punto = curva.calcularPuntoEnCurva(k);
				g.drawOval(punto.x, punto.y, 1, 1);
			}

		}
		if (curva.getKeyPointNum() == 4) {
			for (double k = curva.getT(); k <= 1 + curva.getT(); k += curva.getT()) {
				g.setColor(new Color(155, 46, 254));
				Point punto = curva.calcularPuntoEnCurva(k);
				g.drawOval(punto.x, punto.y, 1, 1);
			}
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (keyPointNum < 4) {
			draw = true;
			double x = e.getX();
			double y = e.getY();
			keyPointP[keyPointNum] = new Point2D.Double(x, y);
			keyPointE[keyPointNum] = new Ellipse2D.Double(x - 4, y - 4, 8, 8);
			keyPointNum++;
		}
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		draw = true;
		x1 = e.getX();
		y1 = e.getY();
		x2 = x1;
		y2 = y1;
		for (int i = 0; i < keyPointNum; i++) {
			if (keyPointE[i].contains((Point2D) e.getPoint())) {
				keyPointID = i;
				break;
			} else {
				keyPointID = -1;
			}
		}
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (figura.equals("Bezier")) {
			draw = true;
		} else {
			draw = false;
			if (figura.equals("Cuadrado")) {
				c.add(new Cuadrado(x1, y1, x2, y2));
			} else if (figura.equals("Circulo")) {
				ci.add(new Circulo(x1, y1, x2, y2));
			} else if (figura.equals("Triangulo")) {
				tri.add(new Triangulo(x1, y1, x2, y2));
			}
			seleccionarFigura("");
			setForeground(Color.WHITE);
		}
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if (contains(e.getPoint())) {
			lastMousePosition = e.getLocationOnScreen();
			x2 = e.getX();
			y2 = e.getY();
			x = e.getX();
			y = e.getY();
			if (keyPointID != -1) {
				double x = e.getX();
				double y = e.getY();
				keyPointP[keyPointID] = new Point2D.Double(x, y);
				keyPointE[keyPointID] = new Ellipse2D.Double(x - 4, y - 4, 8, 8);
			}
			repaint();
		} else {
			try {
				Robot robot = new Robot();
				robot.mouseMove(lastMousePosition.x, lastMousePosition.y);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		repaint();
	}

	public Object getFigura(Point p) {
		for (int i = 0; i < c.size(); i++) {
			Cuadrado tmp = c.get(i);
			if (tmp.contains(p)) {
				return tmp;
			}
		}
		for (int i = 0; i < ci.size(); i++) {
			Circulo tmp = ci.get(i);
			if (tmp.contains(p)) {
				return tmp;
			}
		}
		for (int i = 0; i < tri.size(); i++) {
			Triangulo tmp = tri.get(i);
			if (tmp.contains(p)) {
				return tmp;
			}
		}
		return null;
	}

	public Object getCurva() {
		CurvaBezier curva = curB.get(0);
		return curva;
	}

	public void borrarFiguras() {
		c = new ArrayList<Cuadrado>();
		ci = new ArrayList<Circulo>();
		tri = new ArrayList<Triangulo>();
		curB = new ArrayList<CurvaBezier>();
		repaint();
	}

	public void setT(double t) {
		this.t = t;
	}
	
	public void resetCurva() {
		keyPointP = new Point2D[4];
		keyPointE = new Ellipse2D.Double[4];;
		keyPointNum = 0;
		keyPointID = -1;
	}
	
	public void resetPoins() {
		x = 0;
		y = 0;
		x1 = 0;
		x2 = 0;
		y1 = 0;
		y2 = 0;
	}
	
	public void addCurva() {
		curB.add(new CurvaBezier(keyPointP, keyPointE, keyPointNum, t));
	}
	
}
