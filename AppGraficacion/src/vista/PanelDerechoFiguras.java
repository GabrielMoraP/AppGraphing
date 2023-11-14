package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelDerechoFiguras extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtX;
	private JTextField txtY;
	private JTextField txtEscalamientoWidth;
	private JTextField txtEscalamientoHeight;
	private JLabel labelNombreFigura;
	private JButton btnAceptar;
	private JButton btnMenosX;
	private JButton btnMasX;
	private JButton btnMenosY;
	private JButton btnMasY;
	private JTextField textFieldGrados;

	/**
	 * Create the panel.
	 */
	public PanelDerechoFiguras() {

		setBackground(new Color(11, 20, 26));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0 };
		setLayout(gridBagLayout);

		labelNombreFigura = new JLabel("FIGURA");
		labelNombreFigura.setForeground(new Color(37, 211, 102));
		labelNombreFigura.setFont(new Font("Dialog", Font.BOLD, 24));
		GridBagConstraints gbc_labelNombreFigura = new GridBagConstraints();
		gbc_labelNombreFigura.fill = GridBagConstraints.VERTICAL;
		gbc_labelNombreFigura.weightx = 1;
		gbc_labelNombreFigura.weighty = 2;
		gbc_labelNombreFigura.gridwidth = 4;
		gbc_labelNombreFigura.insets = new Insets(0, 0, 5, 0);
		gbc_labelNombreFigura.gridx = 0;
		gbc_labelNombreFigura.gridy = 0;
		add(labelNombreFigura, gbc_labelNombreFigura);

		JLabel labelTraslacion = new JLabel("TRASLACION");
		labelTraslacion.setForeground(new Color(37, 211, 102));
		labelTraslacion.setFont(new Font("Dialog", Font.BOLD, 24));
		labelTraslacion.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_labelTraslacion = new GridBagConstraints();
		gbc_labelTraslacion.weightx = 1;
		gbc_labelTraslacion.weighty = 1;
		gbc_labelTraslacion.gridwidth = 4;
		gbc_labelTraslacion.fill = GridBagConstraints.BOTH;
		gbc_labelTraslacion.insets = new Insets(0, 0, 5, 0);
		gbc_labelTraslacion.gridx = 0;
		gbc_labelTraslacion.gridy = 3;
		add(labelTraslacion, gbc_labelTraslacion);

		JLabel labelX = new JLabel("X");
		labelX.setForeground(new Color(255, 255, 255));
		labelX.setFont(new Font("Dialog", Font.BOLD, 20));
		labelX.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_labelX = new GridBagConstraints();
		gbc_labelX.gridwidth = 2;
		gbc_labelX.weightx = 1;
		gbc_labelX.weighty = 1;
		gbc_labelX.fill = GridBagConstraints.BOTH;
		gbc_labelX.insets = new Insets(0, 0, 5, 5);
		gbc_labelX.gridx = 0;
		gbc_labelX.gridy = 4;
		add(labelX, gbc_labelX);

		JLabel labelY = new JLabel("Y");
		labelY.setForeground(new Color(255, 255, 255));
		labelY.setFont(new Font("Dialog", Font.BOLD, 20));
		labelY.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_labelY = new GridBagConstraints();
		gbc_labelY.gridwidth = 2;
		gbc_labelY.weightx = 1;
		gbc_labelY.weighty = 1;
		gbc_labelY.fill = GridBagConstraints.BOTH;
		gbc_labelY.insets = new Insets(0, 0, 5, 0);
		gbc_labelY.gridx = 2;
		gbc_labelY.gridy = 4;
		add(labelY, gbc_labelY);

		txtX = new JTextField();
		txtX.setEditable(false);
		txtX.setSelectedTextColor(new Color(0, 0, 0));
		txtX.setSelectionColor(new Color(37, 211, 102));
		txtX.setForeground(new Color(0, 0, 0));
		txtX.setFont(new Font("Dialog", Font.BOLD, 20));
		txtX.setHorizontalAlignment(SwingConstants.CENTER);
		txtX.setText("-");
		GridBagConstraints gbc_txtX = new GridBagConstraints();
		gbc_txtX.gridwidth = 2;
		gbc_txtX.weightx = 1;
		gbc_txtX.weighty = 2;
		gbc_txtX.insets = new Insets(0, 0, 5, 5);
		gbc_txtX.gridx = 0;
		gbc_txtX.gridy = 5;
		add(txtX, gbc_txtX);
		txtX.setColumns(10);

		txtY = new JTextField();
		txtY.setEditable(false);
		txtY.setSelectedTextColor(new Color(0, 0, 0));
		txtY.setSelectionColor(new Color(37, 211, 102));
		txtY.setForeground(new Color(0, 0, 0));
		txtY.setFont(new Font("Dialog", Font.BOLD, 20));
		txtY.setHorizontalAlignment(SwingConstants.CENTER);
		txtY.setText("-");
		GridBagConstraints gbc_txtY = new GridBagConstraints();
		gbc_txtY.gridwidth = 2;
		gbc_txtY.weightx = 1;
		gbc_txtY.weighty = 2;
		gbc_txtY.insets = new Insets(0, 0, 5, 0);
		gbc_txtY.gridx = 2;
		gbc_txtY.gridy = 5;
		add(txtY, gbc_txtY);
		txtY.setColumns(10);

		btnMenosX = new JButton("<");
		GridBagConstraints gbc_btnMenosX = new GridBagConstraints();
		gbc_btnMenosX.insets = new Insets(0, 0, 5, 5);
		gbc_btnMenosX.gridx = 0;
		gbc_btnMenosX.gridy = 6;
		add(btnMenosX, gbc_btnMenosX);

		btnMasX = new JButton(">");
		GridBagConstraints gbc_btnMasX = new GridBagConstraints();
		gbc_btnMasX.insets = new Insets(0, 0, 5, 5);
		gbc_btnMasX.gridx = 1;
		gbc_btnMasX.gridy = 6;
		add(btnMasX, gbc_btnMasX);

		btnMenosY = new JButton("^");
		GridBagConstraints gbc_btnMenosY = new GridBagConstraints();
		gbc_btnMenosY.insets = new Insets(0, 0, 5, 5);
		gbc_btnMenosY.gridx = 2;
		gbc_btnMenosY.gridy = 6;
		add(btnMenosY, gbc_btnMenosY);

		btnMasY = new JButton("v");
		GridBagConstraints gbc_btnMasY = new GridBagConstraints();
		gbc_btnMasY.insets = new Insets(0, 0, 5, 0);
		gbc_btnMasY.gridx = 3;
		gbc_btnMasY.gridy = 6;
		add(btnMasY, gbc_btnMasY);

		JLabel labelRotacion = new JLabel("ROTACION");
		labelRotacion.setForeground(new Color(37, 211, 102));
		labelRotacion.setFont(new Font("Dialog", Font.BOLD, 24));
		labelRotacion.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_labelRotacion = new GridBagConstraints();
		gbc_labelRotacion.weightx = 1;
		gbc_labelRotacion.weighty = 1;
		gbc_labelRotacion.insets = new Insets(0, 0, 5, 0);
		gbc_labelRotacion.fill = GridBagConstraints.BOTH;
		gbc_labelRotacion.gridwidth = 4;
		gbc_labelRotacion.gridx = 0;
		gbc_labelRotacion.gridy = 7;
		add(labelRotacion, gbc_labelRotacion);

		JLabel labelGrados = new JLabel("GRADOS");
		labelGrados.setForeground(new Color(255, 255, 255));
		labelGrados.setFont(new Font("Dialog", Font.BOLD, 20));
		labelGrados.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_labelGrados = new GridBagConstraints();
		gbc_labelGrados.weightx = 1;
		gbc_labelGrados.weighty = 1;
		gbc_labelGrados.fill = GridBagConstraints.BOTH;
		gbc_labelGrados.gridwidth = 4;
		gbc_labelGrados.insets = new Insets(0, 0, 5, 0);
		gbc_labelGrados.gridx = 0;
		gbc_labelGrados.gridy = 8;
		add(labelGrados, gbc_labelGrados);

		textFieldGrados = new JTextField();
		textFieldGrados.setText("-");
		textFieldGrados.setSelectionColor(new Color(37, 211, 102));
		textFieldGrados.setSelectedTextColor(Color.BLACK);
		textFieldGrados.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldGrados.setForeground(Color.BLACK);
		textFieldGrados.setFont(new Font("Dialog", Font.BOLD, 20));
		textFieldGrados.setEditable(false);
		textFieldGrados.setColumns(10);
		GridBagConstraints gbc_textFieldGrados = new GridBagConstraints();
		gbc_textFieldGrados.gridwidth = 4;
		gbc_textFieldGrados.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldGrados.gridx = 0;
		gbc_textFieldGrados.gridy = 9;
		add(textFieldGrados, gbc_textFieldGrados);

		JLabel labelEscalamiento = new JLabel("ESCALAMIENTO");
		labelEscalamiento.setForeground(new Color(37, 211, 102));
		labelEscalamiento.setFont(new Font("Dialog", Font.BOLD, 24));
		labelEscalamiento.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_labelEscalamiento = new GridBagConstraints();
		gbc_labelEscalamiento.fill = GridBagConstraints.VERTICAL;
		gbc_labelEscalamiento.weightx = 1;
		gbc_labelEscalamiento.weighty = 1;
		gbc_labelEscalamiento.insets = new Insets(0, 0, 5, 0);
		gbc_labelEscalamiento.gridwidth = 4;
		gbc_labelEscalamiento.gridx = 0;
		gbc_labelEscalamiento.gridy = 11;
		add(labelEscalamiento, gbc_labelEscalamiento);

		JLabel labelEscalamientoX = new JLabel("N*X");
		labelEscalamientoX.setForeground(new Color(255, 255, 255));
		labelEscalamientoX.setFont(new Font("Dialog", Font.BOLD, 20));
		labelEscalamientoX.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_labelEscalamientoX = new GridBagConstraints();
		gbc_labelEscalamientoX.fill = GridBagConstraints.VERTICAL;
		gbc_labelEscalamientoX.gridwidth = 2;
		gbc_labelEscalamientoX.weightx = 1;
		gbc_labelEscalamientoX.weighty = 1;
		gbc_labelEscalamientoX.insets = new Insets(0, 0, 5, 5);
		gbc_labelEscalamientoX.gridx = 0;
		gbc_labelEscalamientoX.gridy = 12;
		add(labelEscalamientoX, gbc_labelEscalamientoX);

		JLabel labelEscalamientoY = new JLabel("N*Y");
		labelEscalamientoY.setForeground(new Color(255, 255, 255));
		labelEscalamientoY.setFont(new Font("Dialog", Font.BOLD, 20));
		labelEscalamientoY.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_labelEscalamientoY = new GridBagConstraints();
		gbc_labelEscalamientoY.fill = GridBagConstraints.VERTICAL;
		gbc_labelEscalamientoY.gridwidth = 2;
		gbc_labelEscalamientoY.weightx = 1;
		gbc_labelEscalamientoY.weighty = 1;
		gbc_labelEscalamientoY.insets = new Insets(0, 0, 5, 0);
		gbc_labelEscalamientoY.gridx = 2;
		gbc_labelEscalamientoY.gridy = 12;
		add(labelEscalamientoY, gbc_labelEscalamientoY);

		txtEscalamientoWidth = new JTextField();
		txtEscalamientoWidth.setEditable(false);
		txtEscalamientoWidth.setSelectedTextColor(new Color(0, 0, 0));
		txtEscalamientoWidth.setSelectionColor(new Color(37, 211, 102));
		txtEscalamientoWidth.setForeground(new Color(0, 0, 0));
		txtEscalamientoWidth.setFont(new Font("Dialog", Font.BOLD, 20));
		txtEscalamientoWidth.setText("-");
		txtEscalamientoWidth.setHorizontalAlignment(SwingConstants.CENTER);
		txtEscalamientoWidth.setColumns(10);
		GridBagConstraints gbc_txtEscalamientoWidth = new GridBagConstraints();
		gbc_txtEscalamientoWidth.gridwidth = 2;
		gbc_txtEscalamientoWidth.weightx = 1;
		gbc_txtEscalamientoWidth.weighty = 2;
		gbc_txtEscalamientoWidth.insets = new Insets(0, 0, 5, 5);
		gbc_txtEscalamientoWidth.gridx = 0;
		gbc_txtEscalamientoWidth.gridy = 13;
		add(txtEscalamientoWidth, gbc_txtEscalamientoWidth);

		txtEscalamientoHeight = new JTextField();
		txtEscalamientoHeight.setEditable(false);
		txtEscalamientoHeight.setSelectedTextColor(new Color(0, 0, 0));
		txtEscalamientoHeight.setSelectionColor(new Color(37, 211, 102));
		txtEscalamientoHeight.setForeground(new Color(0, 0, 0));
		txtEscalamientoHeight.setFont(new Font("Dialog", Font.BOLD, 20));
		txtEscalamientoHeight.setText("-");
		txtEscalamientoHeight.setHorizontalAlignment(SwingConstants.CENTER);
		txtEscalamientoHeight.setColumns(10);
		GridBagConstraints gbc_txtEscalamientoHeight = new GridBagConstraints();
		gbc_txtEscalamientoHeight.gridwidth = 2;
		gbc_txtEscalamientoHeight.weightx = 1;
		gbc_txtEscalamientoHeight.weighty = 2;
		gbc_txtEscalamientoHeight.insets = new Insets(0, 0, 5, 0);
		gbc_txtEscalamientoHeight.gridx = 2;
		gbc_txtEscalamientoHeight.gridy = 13;
		add(txtEscalamientoHeight, gbc_txtEscalamientoHeight);

		btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setForeground(new Color(0, 0, 0));
		btnAceptar.setFont(new Font("Dialog", Font.BOLD, 20));
		btnAceptar.setEnabled(false);
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.weightx = 1;
		gbc_btnAceptar.weighty = 2;
		gbc_btnAceptar.gridwidth = 4;
		gbc_btnAceptar.gridx = 0;
		gbc_btnAceptar.gridy = 15;
		add(btnAceptar, gbc_btnAceptar);

	}

	public JTextField getTxtX() {
		return txtX;
	}

	public JTextField getTxtY() {
		return txtY;
	}

	public JButton getBtnMenosX() {
		return btnMenosX;
	}

	public JButton getBtnMasX() {
		return btnMasX;
	}

	public JButton getBtnMenosY() {
		return btnMenosY;
	}

	public JButton getBtnMasY() {
		return btnMasY;
	}

	public JTextField getTextFieldGrados() {
		return textFieldGrados;
	}

	public JTextField getTxtEscalamientoWidth() {
		return txtEscalamientoWidth;
	}

	public JTextField getTxtEscalamientoHeight() {
		return txtEscalamientoHeight;
	}

	public JLabel getLabelNombreFigura() {
		return labelNombreFigura;
	}

	public JButton getBtnAceptar() {
		return btnAceptar;
	}

}
