package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import vista.PanelLogin;
import vista.PanelPrincipal;
import vista.VistaPrincipal;

public class ControladorApp implements ActionListener{

	private VistaPrincipal vistaP;
	private PanelPrincipal panel1;
	private PanelLogin panel2;
	
	public ControladorApp(VistaPrincipal vistaP) {
		this.vistaP = vistaP;
	}

	public void setPanel1(PanelPrincipal panel1) {
		this.panel1 = panel1;
	}

	public void setPanel2(PanelLogin panel2) {
		this.panel2 = panel2;
	}


	@Override
	public void actionPerformed(ActionEvent e) {					//De momento hacen lo mismo uya que esto esta en ALFA
		if(e.getSource().equals(panel2.getBtnBoton())) {			//Si entramos como profesores tendremos los permisos
			vistaP.setPanel(panel1);
			vistaP.hacerMenuVisible(true);
			vistaP.permisosProfesor(true);
		}else if(e.getSource().equals(panel2.getButtonAccesoAlumno())) {
			vistaP.setPanel(panel1);
			vistaP.permisosProfesor(false);
			vistaP.hacerMenuVisible(true);
		}else if(e.getSource().equals(panel1.getBtnNewButton())) {
			vistaP.setPanel(panel2);
			vistaP.hacerMenuVisible(false);
		}
		
	}

}
