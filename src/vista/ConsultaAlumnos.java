package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;

import controlador.ControladorApp;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Cursor;

public class ConsultaAlumnos extends JPanel {
	private JTextField textFiltro;
	private JComboBox comboBox;
	private JButton button;
	public ConsultaAlumnos() {
		inicializar();
	}
	private void inicializar() {
		setLayout(null);
		
		JLabel lblConsultarAlumnos = new JLabel("CONSULTAR ALUMNOS");
		lblConsultarAlumnos.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsultarAlumnos.setForeground(Color.WHITE);
		lblConsultarAlumnos.setFont(new Font("Sitka Small", Font.BOLD, 50));
		lblConsultarAlumnos.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		lblConsultarAlumnos.setBounds(38, 44, 630, 90);
		add(lblConsultarAlumnos);
		
		JLabel label = new JLabel("LISTA ALUMNOS:");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Sitka Small", Font.BOLD, 20));
		label.setBounds(38, 295, 204, 41);
		add(label);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(89, 333, 540, 217);
		add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JLabel lblFiltrar = new JLabel("FILTRAR:");
		lblFiltrar.setForeground(Color.WHITE);
		lblFiltrar.setFont(new Font("Sitka Small", Font.BOLD, 18));
		lblFiltrar.setBounds(48, 145, 115, 41);
		add(lblFiltrar);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Nombre", "N\u00BA Expediente"}));
		comboBox.setBounds(97, 209, 115, 41);
		add(comboBox);
		
		textFiltro = new JTextField();
		textFiltro.setBounds(325, 209, 255, 41);
		add(textFiltro);
		textFiltro.setColumns(10);
		
		button = new JButton("");
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setRolloverIcon(new ImageIcon(ConsultaAlumnos.class.getResource("/images/PulsadoBotonCancelar.png")));
		button.setIcon(new ImageIcon(ConsultaAlumnos.class.getResource("/images/BotonCancelar.png")));
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBorder(null);
		button.setBounds(249, 561, 188, 55);
		add(button);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ConsultaAlumnos.class.getResource("/images/FondoAlumnos700X700.png")));
		lblNewLabel.setBounds(0, 0, 700, 625);
		add(lblNewLabel);
	}
	
	public void setControlador(ControladorApp c) {		//Deberemos presentarle todos los botones al controlador
		button.addActionListener(c);
	}
	public JButton getButton() {
		return button;
	}
	
}
