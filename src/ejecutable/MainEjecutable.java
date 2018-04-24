package ejecutable;

import java.awt.EventQueue;

import controlador.ControladorApp;
import vista.ConsultaAlumnos;
import vista.EliminarAlumno;
import vista.PanelLogin;
import vista.PanelPrincipal;
import vista.VistaPrincipal;
import vista.añadirAlumnos;

public class MainEjecutable {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				VistaPrincipal prueba = new VistaPrincipal();
				PanelPrincipal panel1 = new PanelPrincipal();
				PanelLogin panel2 = new PanelLogin();
				añadirAlumnos panel3 = new añadirAlumnos();
				EliminarAlumno panel4 = new EliminarAlumno();
				ConsultaAlumnos panel5 = new ConsultaAlumnos();
				ControladorApp control = new ControladorApp(prueba);
				
				
				control.setPanel1(panel1);
				control.setPanel2(panel2);
				control.setPanel3(panel3);
				control.setPanel4(panel4);
				control.setPanel5(panel5);
				
				panel2.setControlador(control);		//Todos los panelesd se le presentan al controlador
				panel1.setControlador(control);
				panel3.setControlador(control);
				prueba.setControlador(control);
				panel4.setControlador(control);
				panel5.setControlador(control);
				
				prueba.hacerVisible();
				prueba.setPanel(panel2);
			}
		});

	}

}
