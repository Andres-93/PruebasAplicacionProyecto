package modelo;

public class Profesor {

	private String usuario;
	private String pass;
	
		
	public Profesor(String usuario, String pass) {
		this.usuario = usuario;
		this.pass = pass;
	}
	public String getUsuario() {
		return usuario;
	}

	public String getPass() {
		return pass;
	}	
}
