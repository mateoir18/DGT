package objetos;

import java.util.ArrayList;

public class Persona {

	private String dni;
	private String nombre;
	private String apellidos;
	private String fechaNacimiento;
	private ArrayList<Coche> coches;
	
	public Persona(String dni,String nombre,String apellidos) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public ArrayList<Coche> getCoches() {
		return coches;
	}

	public void setCoches(ArrayList<Coche> coches) {
		this.coches = coches;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}
	
	
	
	
}
