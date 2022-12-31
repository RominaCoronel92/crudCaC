package dto;

public class JugadoresDTO {

	private int idJugadores;
	private String nombre;
	private String apellido;
	private int dni;
	private String domicilio;
	private int telefono;
	private int idCategoria;

	public JugadoresDTO() {
		super();
	}

	public JugadoresDTO(String nombre, String apellido, int dni, String domicilio, int telefono, int idCategoria) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.idCategoria = idCategoria;
	}

	public JugadoresDTO(int idJugadores, String nombre, String apellido, int dni, String domicilio, int telefono,
			int idCategoria) {
		super();
		this.idJugadores = idJugadores;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.idCategoria = idCategoria;
	}

	public int getIdJugadores() {
		return idJugadores;
	}

	public void setIdJugadores(int idJugadores) {
		this.idJugadores = idJugadores;
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

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;

	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;

	}

	@Override
	public String toString() {
		return "JugadoresDTO [idJugadores=" + idJugadores + ", nombre=" + nombre + ", apellido=" + apellido + ", dni="
				+ dni + ", domicilio=" + domicilio + ", telefono=" + telefono + ", idCategoria=" + idCategoria + "]";
	}

}
