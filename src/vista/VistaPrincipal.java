package vista;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controlador.ControladorApp;


import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import java.awt.Insets;

public class VistaPrincipal extends JFrame{
	private JScrollPane scrollPane;
	private JMenu mnMenuAlumnos;
	private JMenuItem mntConsultaAl;
	private JMenuBar menuBar;
	private JMenuItem mntmAadirAl;
	
	public VistaPrincipal() {
		inicializar();
	}
	
	private void inicializar() {
		getContentPane().setLayout(null);		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 700, 700);
		getContentPane().add(scrollPane);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		menuBar = new JMenuBar();
		menuBar.setAutoscrolls(true);
		menuBar.setMargin(new Insets(0, 5, 0, 5));
		menuBar.setBorder(null);
		menuBar.setBackground(new Color(0, 153, 255));
		menuBar.setForeground(new Color(51, 102, 204));
		setJMenuBar(menuBar);
		
		mnMenuAlumnos = new JMenu("Alumnos");
		mnMenuAlumnos.setBackground(new Color(0, 0, 204));
		mnMenuAlumnos.setForeground(Color.WHITE);
		mnMenuAlumnos.setFont(new Font("Segoe UI Semibold", Font.BOLD, 22));
		menuBar.add(mnMenuAlumnos);
		
		mntConsultaAl = new JMenuItem("Consulta");
		mntConsultaAl.setBorder(null);
		mntConsultaAl.setForeground(Color.WHITE);
		mntConsultaAl.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mntConsultaAl.setBackground(new Color(0, 153, 255));
		mnMenuAlumnos.add(mntConsultaAl);
		
		mntmAadirAl = new JMenuItem("A\u00F1adir");
		mntmAadirAl.setBorderPainted(true);
		mntmAadirAl.setBorder(null);
		mntmAadirAl.setForeground(Color.WHITE);
		mntmAadirAl.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mntmAadirAl.setBackground(new Color(0, 153, 255));
		mnMenuAlumnos.add(mntmAadirAl);
	}
	
	public void permisosProfesor(boolean permitir) {
		
		if(permitir) {
			mntmAadirAl.setEnabled(true);
		}
		else {
			mntmAadirAl.setEnabled(false);
		}
		
	}
	
	public JMenuItem getMntConsultaAl() {
		return mntConsultaAl;
	}

	public JMenuItem getMntmAadirAl() {
		return mntmAadirAl;
	}

	public void setPanel(JPanel panel) {			
		scrollPane.setViewportView(panel);
	}
	
	public void hacerMenuVisible(boolean si) {
		menuBar.setVisible(si);
	}
	
	
	public void hacerVisible() {
		this.setVisible(true);
		this.setSize(670, 670);
		setLocationRelativeTo(null);
		menuBar.setVisible(false);

	}
}
