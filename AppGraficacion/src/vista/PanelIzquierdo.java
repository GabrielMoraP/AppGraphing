package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class PanelIzquierdo extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnCuadrado;
	private JButton btnCirculo;
	private JButton btnTriangulo;
	private JButton btnLimpiar;
	private JButton btnSalir;
	private JButton btnBezier;

	/**
	 * Create the panel.
	 */
	public PanelIzquierdo() {
		setBackground(new Color(11, 20, 26));
		setLayout(new GridLayout(6, 1, 0, 45));

		btnCuadrado = new JButton("CUADRADO");
		btnCuadrado.setForeground(Color.BLACK);
		btnCuadrado.setFont(new Font("Dialog", Font.BOLD, 22));
		btnCuadrado.setBackground(Color.MAGENTA);
		add(btnCuadrado);
		
		btnCirculo = new JButton("CIRCULO");
		btnCirculo.setForeground(Color.BLACK);
		btnCirculo.setFont(new Font("Dialog", Font.BOLD, 22));
		btnCirculo.setBackground(Color.YELLOW);
		add(btnCirculo);
		
		btnTriangulo = new JButton("TRIANGULO");
		btnTriangulo.setForeground(Color.BLACK);
		btnTriangulo.setFont(new Font("Dialog", Font.BOLD, 22));
		btnTriangulo.setBackground(Color.CYAN);
		add(btnTriangulo);
		
		btnBezier = new JButton("BEZIER");
		btnBezier.setForeground(Color.BLACK);
		btnBezier.setFont(new Font("Dialog", Font.BOLD, 22));
		btnBezier.setBackground(new Color(155, 46, 254));
		add(btnBezier);
		
		btnLimpiar = new JButton("LIMPIAR");
		btnLimpiar.setForeground(Color.BLACK);
		btnLimpiar.setFont(new Font("Dialog", Font.BOLD, 22));
		btnLimpiar.setBackground(Color.WHITE);
		add(btnLimpiar);
		
		btnSalir = new JButton("SALIR");
		btnSalir.setForeground(Color.BLACK);
		btnSalir.setFont(new Font("Dialog", Font.BOLD, 22));
		btnSalir.setBackground(Color.WHITE);
		add(btnSalir);
	}

	public JButton getBtnCuadrado() {
		return btnCuadrado;
	}

	public JButton getBtnCirculo() {
		return btnCirculo;
	}

	public JButton getBtnTriangulo() {
		return btnTriangulo;
	}

	public JButton getBtnBezier() {
		return btnBezier;
	}

	public JButton getBtnLimpiar() {
		return btnLimpiar;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}
	
}
