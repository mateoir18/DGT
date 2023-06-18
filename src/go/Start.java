package go;

import ayudas.GuardadorObjetos;
import datos.ReadCoche;
import datos.ReadDuenio;
import datos.ReadPersona;
import datos.Write;

public class Start {

	public static void main(String[] args) {

		ReadCoche.readFiles("C:\\Users\\User\\Documents\\vehiculos.txt");

		ReadPersona.readFiles("C:\\Users\\User\\Documents\\propietarios.txt");

		ReadDuenio.readFiles("C:\\Users\\User\\Documents\\vinculaciones.txt");

		Write.escribir(GuardadorObjetos.sacarPersonas());

	}

}
