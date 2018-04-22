package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import controlador.ControladorApp;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class PanelPrincipal extends JPanel {
	private JButton btnNewButton;
	private JLabel lblNewLabel;

	public PanelPrincipal() {
		setLayout(null);
	
		JLabel lblAplicacion = new JLabel("APLICACION");
		lblAplicacion.setForeground(Color.WHITE);
		lblAplicacion.setFont(new Font("Trebuchet MS", Font.BOLD, 32));
		lblAplicacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblAplicacion.setBounds(188, 58, 343, 162);
		add(lblAplicacion);
		
		btnNewButton = new JButton("BOTON PRUEBAS");
		btnNewButton.setBounds(203, 364, 284, 68);
		add(btnNewButton);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/images/fondo2.jpg")));
		lblNewLabel.setBounds(0, 0, 700, 700);
		add(lblNewLabel);

	}

	public void setControlador(ControladorApp c) {		//Deberemos presentarle todos los botones al controlador
		btnNewButton.addActionListener(c);
	}

	public JButton getBtnNewButton() {
		return btnNewButton;
	}
	
}


