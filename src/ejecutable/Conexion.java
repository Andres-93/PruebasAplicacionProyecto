package ejecutable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import modelo.Profesor;

public class Conexion {

	String ruta = "C:\\Users\\PcCom\\Desktop\\sqlite\\SQLiteDatabaseBrowserPortable\\Data\\Prueba.db";
	Connection conexion;
	
	
	public void conectar() {
		try {
			Class.forName("org.sqlite.JDBC");
			 conexion = DriverManager.getConnection("jdbc:sqlite:" + ruta);
			 if (conexion!=null) {
		         System.out.println("Conectado");
		     }
		}catch(SQLException | ClassNotFoundException e) {
			System.out.println("ERROR");
			JOptionPane.showMessageDialog(null, e.getMessage());
		}				
	}
	
	
	public void cerrar() {
		try {
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("No se pudo cerrar");
        }
	}
	
	
	public void añadirProfesor(Profesor profe) {
		
		try {
            PreparedStatement st = conexion.prepareStatement("insert into profesores (usuario, contraseña) values (?,?)");
            st.setString(1, profe.getUsuario());
            st.setString(2, profe.getPass());
            st.execute();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Usuario ya existente");
        }
		
		
		
		
	}
	
}
	
	

