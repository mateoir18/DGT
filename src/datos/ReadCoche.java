package datos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

import ayudas.CocheCreator;
import objetos.Coche;

public class ReadCoche {

	public static String FICHERO = "C:\\Users\\User\\Documents\\vehiculos.txt";

	public static Iterator<Coche> readFiles(String fichero) {

		BufferedReader ficheroEntrada;
		ArrayList<Coche> coches = new ArrayList<Coche>();

		try {
			ficheroEntrada = new BufferedReader(new FileReader(fichero));

			String matricula = ficheroEntrada.readLine();

			while (matricula != null) {
				String marca = ficheroEntrada.readLine();

				String modelo = ficheroEntrada.readLine();

				String color = ficheroEntrada.readLine();

				Coche cochenuevo = CocheCreator.ConstruirCoche(matricula, marca, modelo, color);

				coches.add(cochenuevo);

				matricula = ficheroEntrada.readLine();
			}
			ficheroEntrada.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return coches.iterator();
	}
}
