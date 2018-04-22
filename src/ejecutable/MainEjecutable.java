package ejecutable;

import java.awt.EventQueue;

import controlador.ControladorApp;
import vista.PanelLogin;
import vista.PanelPrincipal;
import vista.VistaPrincipal;

public class MainEjecutable {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				VistaPrincipal prueba = new VistaPrincipal();
				PanelPrincipal panel1 = new PanelPrincipal();
				PanelLogin panel2 = new PanelLogin();
				ControladorApp control = new ControladorApp(prueba);
				
				control.setPanel1(panel1);
				control.setPanel2(panel2);
				panel2.setControlador(control);		//Todos los panelesd se le presentan al controlador
				panel1.setControlador(control);
				prueba.hacerVisible();
				prueba.setPanel(panel2);
			}
		});

	}

}
