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
import javax.swing.JButton;
import java.awt.Cursor;

public class EliminarAlumno extends JPanel {
	private JButton btnNewButton;
	private JButton btnCancelar;
	private JList list;
	public EliminarAlumno() {
		setLayout(null);
		
		JLabel lblListaAlumnos = new JLabel("LISTA ALUMNOS:");
		lblListaAlumnos.setForeground(Color.WHITE);
		lblListaAlumnos.setFont(new Font("Sitka Small", Font.BOLD, 20));
		lblListaAlumnos.setBounds(97, 266, 204, 41);
		add(lblListaAlumnos);
		
		JLabel lblFiltros = new JLabel("FILTROS:");
		lblFiltros.setForeground(Color.WHITE);
		lblFiltros.setFont(new Font("Sitka Small", Font.BOLD, 18));
		lblFiltros.setBounds(97, 131, 115, 41);
		add(lblFiltros);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(128, 318, 498, 208);
		add(scrollPane);
		
		list = new JList();
		scrollPane.setViewportView(list);
		
		btnNewButton = new JButton("");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setRolloverIcon(new ImageIcon(EliminarAlumno.class.getResource("/images/botonEliminarPulsado.png")));
		btnNewButton.setIcon(new ImageIcon(EliminarAlumno.class.getResource("/images/BotonoEliminar.png")));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorder(null);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(130, 550, 193, 49);
		add(btnNewButton);
		
		JLabel lblEliminarAlumno = new JLabel("ELIMINAR ALUMNO");
		lblEliminarAlumno.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminarAlumno.setForeground(Color.WHITE);
		lblEliminarAlumno.setFont(new Font("Sitka Small", Font.BOLD, 50));
		lblEliminarAlumno.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		lblEliminarAlumno.setBounds(97, 41, 549, 90);
		add(lblEliminarAlumno);
		
		btnCancelar = new JButton("");
		btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancelar.setRolloverIcon(new ImageIcon(EliminarAlumno.class.getResource("/images/PulsadoBotonCancelar.png")));
		btnCancelar.setIcon(new ImageIcon(EliminarAlumno.class.getResource("/images/BotonCancelar.png")));
		btnCancelar.setFocusPainted(false);
		btnCancelar.setContentAreaFilled(false);
		btnCancelar.setBorderPainted(false);
		btnCancelar.setBorder(null);
		btnCancelar.setBounds(433, 544, 188, 55);
		add(btnCancelar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(EliminarAlumno.class.getResource("/images/FondoAlumnos700X700.png")));
		lblNewLabel.setBounds(0, 0, 700, 625);
		add(lblNewLabel);
	}
	
	public void setControlador(ControladorApp c) {		//Deberemos presentarle todos los botones al controlador
		btnCancelar.addActionListener(c);
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}
	
}