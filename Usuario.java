public class Usuario {

	private String nombre, apellido, user, password, email;
	private int edad;
	private boolean cliente_trabajador;
	
	public Usuario(String nombre, String apellido,String user,String password,String email, int edad) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.user=user;
		this.password=password;
		this.email=email;
		this.edad=edad;
		this.cliente_trabajador=false;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isCliente_trabajador() {
		return cliente_trabajador;
	}

	public void setCliente_trabajador(boolean cliente_trabajador) {
		this.cliente_trabajador = cliente_trabajador;
	}
	
}