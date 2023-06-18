package objetos;

public class Coche {

	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	
	public Coche(String matricula, String marca, String modelo, String color) {
		this.marca = marca;
		this.matricula = matricula;
		this.modelo = modelo;
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", matricula=" + matricula + ", modelo=" + modelo + ", color=" + color
				+ "]";
	}
	
	
	
}
