public class Trabajador extends Usuario {
	
	private int codigo_trabajador;

	public Trabajador(String nombre, String apellido, String user, String password, String email, int edad, int codigo_trabajador) {
		super(nombre, apellido, user, password, email, edad);
		this.codigo_trabajador=codigo_trabajador;
	}

	public int getCodigo_trabajador() {
		return codigo_trabajador;
	}

	public void setCodigo_trabajador(int codigo_trabajador) {
		this.codigo_trabajador = codigo_trabajador;
	}
	
}
