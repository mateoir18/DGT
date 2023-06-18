package ayudas;

import objetos.Coche;

public class CocheCreator {

	public CocheCreator() {
		
	}
	
	public static Coche ConstruirCoche(String matricula, String marca, String modelo, String color) {
		
		Coche coche = new Coche(matricula, marca, modelo, color);
		
		GuardadorObjetos.guardarCoche(coche);
		
		return coche;
	}
}
