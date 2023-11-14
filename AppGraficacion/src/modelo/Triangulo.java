package modelo;

import java.awt.Polygon;

public class Triangulo extends Polygon {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int x1;
	private int y1;
	private int x2;
	private int y2;

	public Triangulo(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		setPoints();
	}

	private void setPoints() {
		addPoint(x1, y1);
		addPoint((x1 + x2) / 2, y2);
		addPoint(x2, y1);
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
		this.xpoints[0] = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
		this.ypoints[0] = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
		this.xpoints[2] = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
		this.ypoints[1] = y2;
	}

	public void rotar(double angulo) {
	    int centerX = 0;
	    int centerY = 0;

	    for (int i = 0; i < npoints; i++) {
	    	centerX += xpoints[i];
		    centerY += ypoints[i];
	    }
	    
	    centerX /= npoints;
	    centerY /= npoints;
	    
	    double radianes = Math.toRadians(angulo);

	    for (int i = 0; i < npoints; i++) {
	        int dx = xpoints[i] - centerX;
	        int dy = ypoints[i] - centerY;
	        xpoints[i] = (int) Math.round(centerX + dx * Math.cos(radianes) - dy * Math.sin(radianes));
	        ypoints[i] = (int) Math.round(centerY + dx * Math.sin(radianes) + dy * Math.cos(radianes));
	    }
	}

	public void escalar(double factorx, double factory) {
		int centerX = 0;
		int centerY = 0;
		for (int i = 0; i < npoints; i++) {
		    centerX += xpoints[i];
		    centerY += ypoints[i];
		}
		centerX /= npoints;
		centerY /= npoints;
		for (int i = 0; i < npoints; i++) {
			int dx = xpoints[i] - centerX;
		    int dy = ypoints[i] - centerY;
		    xpoints[i] = (int) Math.round(centerX + dx * factorx);
		    ypoints[i] = (int) Math.round(centerY + dy * factory);
		}
	}

}
