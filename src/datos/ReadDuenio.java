package datos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import ayudas.GuardadorObjetos;

public class ReadDuenio {

	public static String FICHERO = "C:\\Users\\User\\Documents\\vinculaciones.txt";

	public static void readFiles(String Fichero) {

		BufferedReader ficheroEntrada;
		ArrayList<String> datosPC = new ArrayList<String>();

		try {
			ficheroEntrada = new BufferedReader(new FileReader(Fichero));

			String matricula = ficheroEntrada.readLine();

			while (matricula != null) {

				String dni = ficheroEntrada.readLine();

				GuardadorObjetos.guardarDuenio(matricula, dni);
				datosPC.add(dni);

				matricula = ficheroEntrada.readLine();

			}
			ficheroEntrada.close();
		} catch (Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}
}
