package modelo;

import java.awt.Point;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public class CurvaBezier {

	private Point2D[] keyPointP;
	private int keyPointNum;
	private Ellipse2D.Double[] keyPointE;
	private double t;
	
	public CurvaBezier(Point2D[] keyPointP, Ellipse2D.Double[] keyPointE, int keyPointNum, double t) {
		this.keyPointP = keyPointP;
		this.keyPointE = keyPointE;
		this.keyPointNum = keyPointNum;
		this.t = t;
	}

	public Point calcularPuntoEnCurva(double t) {
		Point punto = null;
		if (keyPointNum == 3) {
			double x = Math.pow(1 - t, 2) * keyPointP[0].getX() + 2 * t * (1 - t) * keyPointP[1].getX() + Math.pow(t, 2) * keyPointP[2].getX();
			double y = Math.pow(1 - t, 2) * keyPointP[0].getY() + 2 * t * (1 - t) * keyPointP[1].getY() + Math.pow(t, 2) * keyPointP[2].getY();
			punto = new Point((int)x, (int)y);
		} else if (keyPointNum == 4) {
			double x = Math.pow(1 - t, 3) * keyPointP[0].getX() + 3 * t * Math.pow(1 - t, 2) * keyPointP[1].getX()
						+ 3 * Math.pow(t, 2) * (1 - t) * keyPointP[2].getX() + Math.pow(t, 3) * keyPointP[3].getX();
			double y = Math.pow(1 - t, 3) * keyPointP[0].getY() + 3 * t * Math.pow(1 - t, 2) * keyPointP[1].getY()
						+ 3 * Math.pow(t, 2) * (1 - t) * keyPointP[2].getY() + Math.pow(t, 3) * keyPointP[3].getY();
			punto = new Point((int)x, (int)y);
		}
		return punto;
	}

	public Point2D[] getKeyPointP() {
		return keyPointP;
	}

	public void setKeyPointP(Point2D[] keyPointP) {
		this.keyPointP = keyPointP;
	}

	public Ellipse2D.Double[] getKeyPointE() {
		return keyPointE;
	}

	public void setKeyPointE(Ellipse2D.Double[] keyPointE) {
		this.keyPointE = keyPointE;
	}

	public int getKeyPointNum() {
		return keyPointNum;
	}

	public void setKeyPointNum(int keyPointNum) {
		this.keyPointNum = keyPointNum;
	}

	public double getT() {
		return t;
	}

	public void setT(double t) {
		this.t = t;
	}
	
}
