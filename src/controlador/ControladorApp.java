package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import vista.ConsultaAlumnos;
import vista.EliminarAlumno;
import vista.PanelLogin;
import vista.PanelPrincipal;
import vista.VistaPrincipal;
import vista.añadirAlumnos;

public class ControladorApp implements ActionListener{

	private VistaPrincipal vistaP;
	private PanelPrincipal panel1;
	private PanelLogin panel2;
	private añadirAlumnos panel3;
	private EliminarAlumno panel4;
	private ConsultaAlumnos panel5;
	
	public ControladorApp(VistaPrincipal vistaP) {
		this.vistaP = vistaP;
	}

	public void setPanel1(PanelPrincipal panel1) {
		this.panel1 = panel1;
	}

	public void setPanel2(PanelLogin panel2) {
		this.panel2 = panel2;
	}
	
	public void setPanel3(añadirAlumnos panel3) {
		this.panel3 = panel3;
	}
	
	public void setPanel4(EliminarAlumno panel4) {
		this.panel4 = panel4;
	}
	
	public void setPanel5(ConsultaAlumnos panel5) {
		this.panel5 = panel5;
	}


	@Override
	public void actionPerformed(ActionEvent e) {					//De momento hacen lo mismo uya que esto esta en ALFA
		if(e.getSource().equals(panel2.getBtnBoton())) {			//Si entramos como profesores tendremos los permisos
			vistaP.setPanel(panel1);
			vistaP.hacerMenuVisible(true);
			vistaP.permisosProfesor(true);
		}else if(e.getSource().equals(panel2.getButtonAccesoAlumno())) {				
			int respuesta = JOptionPane.showConfirmDialog(panel2, "Si entra con una cuenta de Alumno unicamente podra realizar consultas. Desea Continuar?","Confirmacion",JOptionPane.YES_NO_OPTION);
			if(respuesta == JOptionPane.YES_OPTION) {
				vistaP.setPanel(panel1);
				vistaP.permisosProfesor(false);
				vistaP.hacerMenuVisible(true);
			}
		}else if(e.getSource().equals(panel1.getBtnNewButton())) {
			vistaP.setPanel(panel2);
			vistaP.hacerMenuVisible(false);
		}else if(e.getSource().equals(vistaP.getMntmAadirAl())) {
			vistaP.setPanel(panel3);
		}else if(e.getSource().equals(panel3.getBtnCancelar()) || e.getSource().equals(panel4.getBtnCancelar()) || e.getSource().equals(panel5.getButton())) {
			vistaP.setPanel(panel1);			
		}else if(e.getSource().equals(vistaP.getMntmEliminar())) {
			vistaP.setPanel(panel4);
		}else if(e.getSource().equals(vistaP.getMntConsultaAl())) {
			vistaP.setPanel(panel5);
		}
		
	}

}
