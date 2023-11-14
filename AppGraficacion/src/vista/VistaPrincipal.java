package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Circulo;
import modelo.Cuadrado;
import modelo.Triangulo;

public class VistaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private PanelIzquierdo panelIzquierdo = new PanelIzquierdo();
	private PanelDerechoFiguras panelDerechoFiguras = new PanelDerechoFiguras();
	private PanelDerechoCurvas panelDerechoLineas = new PanelDerechoCurvas();
	private Canvas panelCanvas = new Canvas();
	private Object figura = new Object();
	private GridBagConstraints gbcPanelDerecho = new GridBagConstraints();
	private GridBagConstraints gbcPanelIzquierdo = new GridBagConstraints();
	private GridBagConstraints gbcCanvas = new GridBagConstraints();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaPrincipal frame = new VistaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VistaPrincipal() {
		setUndecorated(true);
		setTitle("FIGURAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setLocationRelativeTo(null);

		GridBagLayout gbl = new GridBagLayout();
		gbcPanelIzquierdo = new GridBagConstraints();
		gbcPanelIzquierdo.weightx = 5;
		gbcPanelIzquierdo.weighty = 1;
		gbcPanelIzquierdo.fill = GridBagConstraints.BOTH;
		gbcPanelIzquierdo.gridx = 0;
		gbcPanelIzquierdo.gridy = 0;
		gbcPanelIzquierdo.gridwidth = 1;
		gbcPanelIzquierdo.gridheight = 1;

		gbcCanvas = new GridBagConstraints();
		gbcCanvas.weightx = 90;
		gbcCanvas.weighty = 1;
		gbcCanvas.fill = GridBagConstraints.BOTH;
		gbcCanvas.gridx = 1;
		gbcCanvas.gridy = 0;
		gbcCanvas.gridwidth = 3;
		gbcCanvas.gridheight = 1;

		gbcPanelDerecho = new GridBagConstraints();
		gbcPanelDerecho.weightx = 5;
		gbcPanelDerecho.weighty = 1;
		gbcPanelDerecho.fill = GridBagConstraints.BOTH;
		gbcPanelDerecho.gridx = 4;
		gbcPanelDerecho.gridy = 0;
		gbcPanelDerecho.gridwidth = 1;
		gbcPanelDerecho.gridheight = 1;

		panelIzquierdo.getBtnCuadrado().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCanvas.resetPoins();
				panelCanvas.seleccionarFigura("Cuadrado");
				panelCanvas.setForeground(Color.MAGENTA);
				quitarPaneles(panelDerechoFiguras);
			}
		});
		panelIzquierdo.getBtnCirculo().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCanvas.resetPoins();
				panelCanvas.seleccionarFigura("Circulo");
				panelCanvas.setForeground(Color.YELLOW);
				quitarPaneles(panelDerechoFiguras);
			}
		});
		panelIzquierdo.getBtnTriangulo().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCanvas.resetPoins();
				panelCanvas.seleccionarFigura("Triangulo");
				panelCanvas.setForeground(Color.CYAN);
				quitarPaneles(panelDerechoFiguras);
			}
		});
		panelIzquierdo.getBtnBezier().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCanvas.seleccionarFigura("Bezier");
				panelCanvas.setForeground(new Color(155, 46, 254));
				panelCanvas.resetCurva();
				quitarPaneles(panelDerechoLineas);
			}
		});
		panelIzquierdo.getBtnSalir().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		panelIzquierdo.getBtnLimpiar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCanvas.borrarFiguras();
				panelDerechoFiguras.getLabelNombreFigura().setText("FIGURA");

				panelDerechoFiguras.getTxtX().setText("-");
				panelDerechoFiguras.getTxtX().setEditable(false);

				panelDerechoFiguras.getTxtY().setText("-");
				panelDerechoFiguras.getTxtY().setEditable(false);

				panelDerechoFiguras.getTextFieldGrados().setText("0");
				panelDerechoFiguras.getTextFieldGrados().setEditable(false);

				panelDerechoFiguras.getTxtEscalamientoWidth().setText("-");
				panelDerechoFiguras.getTxtEscalamientoWidth().setEditable(false);

				panelDerechoFiguras.getTxtEscalamientoHeight().setText("-");
				panelDerechoFiguras.getTxtEscalamientoHeight().setEditable(false);
			}
		});

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(getInsets()));
		contentPane.setLayout(gbl);
		panelCanvas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() > 1) {
					figura = panelCanvas.getFigura(e.getPoint());
					if (figura instanceof Cuadrado) {
						panelDerechoFiguras.getLabelNombreFigura().setText("CUADRADO");

						panelDerechoFiguras.getTxtX().setText("0");
						panelDerechoFiguras.getTxtX().setEditable(true);

						panelDerechoFiguras.getTxtY().setText("0");
						panelDerechoFiguras.getTxtY().setEditable(true);

						panelDerechoFiguras.getTextFieldGrados().setText("0");
						panelDerechoFiguras.getTextFieldGrados().setEditable(true);

						panelDerechoFiguras.getTxtEscalamientoWidth().setText("1");
						panelDerechoFiguras.getTxtEscalamientoWidth().setEditable(true);

						panelDerechoFiguras.getTxtEscalamientoHeight().setText("1");
						panelDerechoFiguras.getTxtEscalamientoHeight().setEditable(true);

						panelDerechoFiguras.getBtnAceptar().setEnabled(true);
					} else if (figura instanceof Circulo) {
						panelDerechoFiguras.getLabelNombreFigura().setText("CIRCULO");

						panelDerechoFiguras.getTxtX().setText("0");
						panelDerechoFiguras.getTxtX().setEditable(true);

						panelDerechoFiguras.getTxtY().setText("0");
						panelDerechoFiguras.getTxtY().setEditable(true);

						panelDerechoFiguras.getTextFieldGrados().setText("0");
						panelDerechoFiguras.getTextFieldGrados().setEditable(true);

						panelDerechoFiguras.getTxtEscalamientoWidth().setText("1");
						panelDerechoFiguras.getTxtEscalamientoWidth().setEditable(true);

						panelDerechoFiguras.getTxtEscalamientoHeight().setText("1");
						panelDerechoFiguras.getTxtEscalamientoHeight().setEditable(true);

						panelDerechoFiguras.getBtnAceptar().setEnabled(true);
					} else if (figura instanceof Triangulo) {
						panelDerechoFiguras.getLabelNombreFigura().setText("TRIANGULO");

						panelDerechoFiguras.getTxtX().setText("0");
						panelDerechoFiguras.getTxtX().setEditable(true);

						panelDerechoFiguras.getTxtY().setText("0");
						panelDerechoFiguras.getTxtY().setEditable(true);

						panelDerechoFiguras.getTextFieldGrados().setText("0");
						panelDerechoFiguras.getTextFieldGrados().setEditable(true);

						panelDerechoFiguras.getTxtEscalamientoWidth().setText("1");
						panelDerechoFiguras.getTxtEscalamientoWidth().setEditable(true);

						panelDerechoFiguras.getTxtEscalamientoHeight().setText("1");
						panelDerechoFiguras.getTxtEscalamientoHeight().setEditable(true);

						panelDerechoFiguras.getBtnAceptar().setEnabled(true);
					}
				}
			}
		});
		contentPane.add(panelCanvas, gbcCanvas);
		contentPane.add(panelIzquierdo, gbcPanelIzquierdo);
		contentPane.add(panelDerechoFiguras, gbcPanelDerecho);
		setContentPane(contentPane);
		
		panelDerechoFiguras.getBtnAceptar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (figura instanceof Cuadrado) {
					Cuadrado cuadrado = (Cuadrado) figura;
					cuadrado.translate(Integer.parseInt(panelDerechoFiguras.getTxtX().getText()),
							Integer.parseInt(panelDerechoFiguras.getTxtY().getText()));
					cuadrado.escalar(Double.parseDouble(panelDerechoFiguras.getTxtEscalamientoWidth().getText()),
							Double.parseDouble(panelDerechoFiguras.getTxtEscalamientoHeight().getText()));
					cuadrado.rotar(Double.parseDouble(panelDerechoFiguras.getTextFieldGrados().getText()));
				} else if (figura instanceof Circulo) {
					Circulo circulo = (Circulo) figura;
					circulo.translate(Integer.parseInt(panelDerechoFiguras.getTxtX().getText()),
							Integer.parseInt(panelDerechoFiguras.getTxtY().getText()));
					circulo.escalar(Double.parseDouble(panelDerechoFiguras.getTxtEscalamientoWidth().getText()),
							Double.parseDouble(panelDerechoFiguras.getTxtEscalamientoHeight().getText()));
					circulo.rotar(Double.parseDouble(panelDerechoFiguras.getTextFieldGrados().getText()));
				} else if (figura instanceof Triangulo) {
					Triangulo triangulo = (Triangulo) figura;
					triangulo.translate(Integer.parseInt(panelDerechoFiguras.getTxtX().getText()),
							Integer.parseInt(panelDerechoFiguras.getTxtY().getText()));
					triangulo.escalar(Double.parseDouble(panelDerechoFiguras.getTxtEscalamientoWidth().getText()),
							Double.parseDouble(panelDerechoFiguras.getTxtEscalamientoHeight().getText()));
					triangulo.rotar(Double.parseDouble(panelDerechoFiguras.getTextFieldGrados().getText()));
				}
				panelDerechoFiguras.getTxtX().setText("0");
				panelDerechoFiguras.getTxtY().setText("0");
				panelDerechoFiguras.getTextFieldGrados().setText("0");
				panelDerechoFiguras.getTxtEscalamientoWidth().setText("1");
				panelDerechoFiguras.getTxtEscalamientoHeight().setText("1");
			}
		});
		panelDerechoFiguras.getBtnMasX().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (figura instanceof Cuadrado) {
					Cuadrado cuadrado = (Cuadrado) figura;
					cuadrado.translate(1, 0);
				} else if (figura instanceof Circulo) {
					Circulo circulo = (Circulo) figura;
					circulo.translate(1, 0);
				} else if (figura instanceof Triangulo) {
					Triangulo triangulo = (Triangulo) figura;
					triangulo.translate(1, 0);
				}
			}
		});
		panelDerechoFiguras.getBtnMenosX().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (figura instanceof Cuadrado) {
					Cuadrado cuadrado = (Cuadrado) figura;
					cuadrado.translate(-1, 0);
				} else if (figura instanceof Circulo) {
					Circulo circulo = (Circulo) figura;
					circulo.translate(-1, 0);
				} else if (figura instanceof Triangulo) {
					Triangulo triangulo = (Triangulo) figura;
					triangulo.translate(-1, 0);
				}
			}
		});
		panelDerechoFiguras.getBtnMasY().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (figura instanceof Cuadrado) {
					Cuadrado cuadrado = (Cuadrado) figura;
					cuadrado.translate(0, 1);
				} else if (figura instanceof Circulo) {
					Circulo circulo = (Circulo) figura;
					circulo.translate(0, 1);
				} else if (figura instanceof Triangulo) {
					Triangulo triangulo = (Triangulo) figura;
					triangulo.translate(0, 1);
				}
			}
		});
		panelDerechoFiguras.getBtnMenosY().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (figura instanceof Cuadrado) {
					Cuadrado cuadrado = (Cuadrado) figura;
					cuadrado.translate(0, -1);
				} else if (figura instanceof Circulo) {
					Circulo circulo = (Circulo) figura;
					circulo.translate(0, -1);
				} else if (figura instanceof Triangulo) {
					Triangulo triangulo = (Triangulo) figura;
					triangulo.translate(0, -1);
				}
			}
		});
		
		panelDerechoLineas.getBtnAplicar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double t = Double.parseDouble(panelDerechoLineas.getTextFieldT().getText());
				panelCanvas.setT(t);
				panelCanvas.repaint();
			}
		});
		
		panelDerechoLineas.getBtnAceptar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCanvas.addCurva();
				panelCanvas.getGraphics().setColor(Color.WHITE);
				panelCanvas.repaint();
				panelCanvas.resetCurva();
			}
		});
		
	}

	public void quitarPaneles(JPanel panelNuevo) {
		if (panelNuevo instanceof PanelDerechoCurvas) {

			contentPane.removeAll();
			contentPane.add(panelDerechoLineas, gbcPanelDerecho);
			contentPane.add(panelCanvas, gbcCanvas);
			contentPane.add(panelIzquierdo, gbcPanelIzquierdo);

			repaint();
			setVisible(true);
			System.gc();

		} else if (panelNuevo instanceof PanelDerechoFiguras) {

			contentPane.removeAll();
			contentPane.add(panelDerechoFiguras, gbcPanelDerecho);
			contentPane.add(panelCanvas, gbcCanvas);
			contentPane.add(panelIzquierdo, gbcPanelIzquierdo);

			repaint();
			setVisible(true);
			System.gc();

		}
	}
}
