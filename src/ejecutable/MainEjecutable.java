package ejecutable;

import java.awt.EventQueue;

import controlador.ControladorApp;
import vista.ConsultaAlumnos;
import vista.EliminarAlumno;
import vista.PanelLogin;
import vista.PanelPrincipal;
import vista.RegistrarProfesor;
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
				RegistrarProfesor panel6 = new RegistrarProfesor();
				Conexion con = new Conexion();
				ControladorApp control = new ControladorApp(prueba,con);
				
														//Abrimos la comunicacion con la base de datos
														//FALTA CERRAR LA BASE AL SALIR
				
				control.setPanel1(panel1);
				control.setPanel2(panel2);
				control.setPanel3(panel3);
				control.setPanel4(panel4);
				control.setPanel5(panel5);
				control.setPanel6(panel6);
				
				panel2.setControlador(control);		//Todos los panelesd se le presentan al controlador
				panel1.setControlador(control);
				panel3.setControlador(control);
				prueba.setControlador(control);
				panel4.setControlador(control);
				panel5.setControlador(control);
				panel6.setControlador(control);
				
				prueba.hacerVisible();
				prueba.setPanel(panel2);
			}
		});

	}

}
