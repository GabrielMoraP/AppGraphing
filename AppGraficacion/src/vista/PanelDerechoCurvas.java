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

public class PanelDerechoCurvas extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel labelNombreLinea;
	private JButton btnAceptar;
	private JTextField textFieldT;
	private JButton btnAplicar;

	/**
	 * Create the panel.
	 */
	public PanelDerechoCurvas() {

		setBackground(new Color(11, 20, 26));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWidths = new int[] { 95, 95, 95, 95 };
		gridBagLayout.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0 };
		setLayout(gridBagLayout);

		labelNombreLinea = new JLabel("LINEA");
		labelNombreLinea.setForeground(new Color(37, 211, 102));
		labelNombreLinea.setFont(new Font("Dialog", Font.BOLD, 24));
		GridBagConstraints gbc_labelNombreLinea = new GridBagConstraints();
		gbc_labelNombreLinea.fill = GridBagConstraints.VERTICAL;
		gbc_labelNombreLinea.weightx = 1;
		gbc_labelNombreLinea.weighty = 2;
		gbc_labelNombreLinea.gridwidth = 4;
		gbc_labelNombreLinea.insets = new Insets(0, 0, 5, 0);
		gbc_labelNombreLinea.gridx = 0;
		gbc_labelNombreLinea.gridy = 0;
		add(labelNombreLinea, gbc_labelNombreLinea);

		JLabel labelGrados = new JLabel("T");
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
		gbc_labelGrados.gridy = 7;
		add(labelGrados, gbc_labelGrados);

		textFieldT = new JTextField();
		textFieldT.setText("0.001");
		textFieldT.setSelectionColor(new Color(37, 211, 102));
		textFieldT.setSelectedTextColor(Color.BLACK);
		textFieldT.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldT.setForeground(Color.BLACK);
		textFieldT.setFont(new Font("Dialog", Font.BOLD, 20));
		textFieldT.setColumns(10);
		GridBagConstraints gbc_textFieldT = new GridBagConstraints();
		gbc_textFieldT.gridwidth = 2;
		gbc_textFieldT.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldT.gridx = 1;
		gbc_textFieldT.gridy = 8;
		add(textFieldT, gbc_textFieldT);
		
		btnAplicar = new JButton("APLICAR");
		btnAplicar.setForeground(Color.BLACK);
		btnAplicar.setFont(new Font("Dialog", Font.BOLD, 20));
		GridBagConstraints gbc_btnAplicar = new GridBagConstraints();
		gbc_btnAplicar.gridwidth = 4;
		gbc_btnAplicar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAplicar.gridx = 0;
		gbc_btnAplicar.gridy = 14;
		add(btnAplicar, gbc_btnAplicar);

		btnAceptar = new JButton("GUARDAR CURVA");
		btnAceptar.setForeground(new Color(0, 0, 0));
		btnAceptar.setFont(new Font("Dialog", Font.BOLD, 20));
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.weightx = 1;
		gbc_btnAceptar.weighty = 2;
		gbc_btnAceptar.gridwidth = 4;
		gbc_btnAceptar.gridx = 0;
		gbc_btnAceptar.gridy = 15;
		add(btnAceptar, gbc_btnAceptar);

	}

	public JTextField getTextFieldT() {
		return textFieldT;
	}

	public JButton getBtnAceptar() {
		return btnAceptar;
	}
	
	public JButton getBtnAplicar() {
		return btnAplicar;
	}

}
