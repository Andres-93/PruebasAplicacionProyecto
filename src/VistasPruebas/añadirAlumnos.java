package VistasPruebas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.Cursor;

public class añadirAlumnos extends JPanel {
	private JTextField textNombreAl;
	private JTextField textExpAl;
	private JTextField textApellidoAl;
	public añadirAlumnos() {
		setLayout(null);
		
		textNombreAl = new JTextField();
		textNombreAl.setBounds(348, 234, 245, 36);
		add(textNombreAl);
		textNombreAl.setColumns(10);
		
		textApellidoAl = new JTextField();
		textApellidoAl.setColumns(10);
		textApellidoAl.setBounds(348, 427, 245, 36);
		add(textApellidoAl);
		
		textExpAl = new JTextField();
		textExpAl.setColumns(10);
		textExpAl.setBounds(348, 326, 245, 36);
		add(textExpAl);
		
		JButton button = new JButton("");
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setRolloverIcon(new ImageIcon(añadirAlumnos.class.getResource("/images/PulsadoBotonCancelar.png")));
		button.setIcon(new ImageIcon(añadirAlumnos.class.getResource("/images/BotonCancelar.png")));
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBorder(null);
		button.setBounds(435, 505, 188, 55);
		add(button);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setRolloverIcon(new ImageIcon(añadirAlumnos.class.getResource("/images/PulsadoBotonA\u00F1adir.png")));
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setIcon(new ImageIcon(añadirAlumnos.class.getResource("/images/BotonA\u00F1adir.png")));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBorder(null);
		btnNewButton.setBounds(135, 505, 188, 55);
		add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("A\u00D1ADIR ALUMNO");
		lblNewLabel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Sitka Small", Font.BOLD, 50));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(121, 85, 502, 90);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Sitka Small", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(98, 230, 188, 42);
		add(lblNewLabel_2);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setHorizontalAlignment(SwingConstants.CENTER);
		lblApellidos.setForeground(Color.WHITE);
		lblApellidos.setFont(new Font("Sitka Small", Font.BOLD, 20));
		lblApellidos.setBounds(98, 322, 188, 42);
		add(lblApellidos);
		
		JLabel lblNumeroDeExpediente = new JLabel("N\u00BA Expediente");
		lblNumeroDeExpediente.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumeroDeExpediente.setForeground(Color.WHITE);
		lblNumeroDeExpediente.setFont(new Font("Sitka Small", Font.BOLD, 20));
		lblNumeroDeExpediente.setBounds(98, 423, 188, 42);
		add(lblNumeroDeExpediente);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(añadirAlumnos.class.getResource("/images/LogoMirmidonBajo.png")));
		lblNewLabel_1.setBounds(0, 600, 100, 100);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(añadirAlumnos.class.getResource("/images/FondoAlumnos700X700.png")));
		lblNewLabel.setBounds(0, 29, 700, 700);
		add(lblNewLabel);
	}
}
