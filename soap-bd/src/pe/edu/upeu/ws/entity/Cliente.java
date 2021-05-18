package pe.edu.upeu.ws.entity;

public class Cliente {
	private int idcliente;
	private String nombres;
	private String apellidos;
	private String dni;
	private String direccion;
	public Cliente(int idcliente, String nombres, String apellidos, String dni, String direccion) {
		super();
		this.idcliente = idcliente;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
	}
	
	public Cliente() {
		super();
	}

	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
}
