package datos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import ayudas.PersonaCreator;
import objetos.Persona;

public class ReadPersona {

	public static String FICHERO = "C:\\Users\\User\\Documents\\propietarios.txt";

	public static void readFiles(String Fichero) {

		BufferedReader ficheroEntrada;
		ArrayList<Persona> personas = new ArrayList<Persona>();

		try {
			ficheroEntrada = new BufferedReader(new FileReader(Fichero));

			String dni = ficheroEntrada.readLine();

			while (dni != null) {

				String nombre = ficheroEntrada.readLine();

				String fechaNacimiento = ficheroEntrada.readLine();

				Persona persona = PersonaCreator.crearPersona(dni, nombre, fechaNacimiento);

				personas.add(persona);

				dni = ficheroEntrada.readLine();

			}
			ficheroEntrada.close();
		} catch (Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}

	}
}
