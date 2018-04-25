package vista;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import controlador.ControladorApp;
import modelo.Profesor;

import javax.swing.JTextField;
import javax.swing.JButton;

public class RegistrarProfesor extends JDialog {
	private JTextField textUsu;
	private JTextField textPass;
	private JButton btnRegistrar;
	public RegistrarProfesor() {
		inicializar();
	}
	private void inicializar() {
		getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setBounds(23, 90, 128, 43);
		getContentPane().add(lblUsuario);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setHorizontalAlignment(SwingConstants.CENTER);
		lblPass.setBounds(23, 198, 144, 43);
		getContentPane().add(lblPass);
		
		textUsu = new JTextField();
		textUsu.setBounds(178, 90, 175, 43);
		getContentPane().add(textUsu);
		textUsu.setColumns(10);
		
		textPass = new JTextField();
		textPass.setBounds(177, 198, 180, 43);
		getContentPane().add(textPass);
		textPass.setColumns(10);
		
		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setBounds(89, 268, 207, 64);
		getContentPane().add(btnRegistrar);
		setBounds(0, 0, 400, 400);
		setModalityType(DEFAULT_MODALITY_TYPE);
		setLocationRelativeTo(null);
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	
	public void setControlador(ControladorApp c) {		//Deberemos presentarle todos los botones al controlador
		btnRegistrar.addActionListener(c);
	}
	public JButton getBtnRegistrar() {
		return btnRegistrar;
	}
	
	public Profesor getDatos() {
		
		Profesor profe;
		
		profe = new Profesor(textUsu.getText(), textPass.getText());
		
		return profe;
	}
}
