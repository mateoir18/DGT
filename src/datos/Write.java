package datos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

import objetos.Persona;

public class Write {

	public static void escribir(Iterator<Persona> lista) {

		BufferedWriter ficheroSalida;
		ArrayList<Persona> personas = new ArrayList<Persona>();

		try {
			ficheroSalida = new BufferedWriter(new FileWriter("C:\\Users\\User\\Documents\\DGT final.txt"));

			while (lista.hasNext()) {
				personas.add(lista.next());
			}
			ficheroSalida.write(personas.toString());
			ficheroSalida.close();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
