package ejecutable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
            JOptionPane.showConfirmDialog(null, "Usuario guardado correctamente", "Mensaje de confirmación", JOptionPane.CLOSED_OPTION);
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Usuario ya existente");
        }		
	}
	
	public boolean buscarUsuario(Profesor profe) {
		
		boolean encontrado = false;
		try {
			PreparedStatement st = conexion.prepareStatement("SELECT * FROM profesores where usuario = ? AND contraseña = ?");
			st.setString(1, profe.getUsuario());
			st.setString(2, profe.getPass());
								//Si queremos guardar todas las columnas en una especie de coleccion haremos ResultSet rs = st.executeQuery();
			
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				if(rs.getString("usuario").equals(profe.getUsuario()) && rs.getString("contraseña").equals(profe.getPass())){
					encontrado = true;
				}
			}			
		}catch(SQLException e) {
			JOptionPane.showConfirmDialog(null, e.getMessage(), "Error al logearse", JOptionPane.CANCEL_OPTION);
		}		
		return encontrado;
	}
	
}
	
	

