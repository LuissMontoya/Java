package package1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TXT {

	public static void main(String[] args) {

		String nombreFichero = "D:\\Luis\\Archivos\\cts.log-server1.log.2023-03-15-09-1.txt";
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(nombreFichero));
			String texto = br.readLine();
			String search = "TaskExecutor-15";
			int i = 0;
			int i2 = 0;
			try {
				FileWriter fw = new FileWriter("D:\\Luis\\Archivos\\Salida23.txt");
				while (texto != null) {
					i++;
					// System.out.println("Linea"+i+": "+texto);
					if (texto.toLowerCase().contains(search.toLowerCase())) {
						i2++;
						System.out.println("Fila" + i + ":" + texto);
						fw.write(texto + "\n");
					}

					texto = br.readLine();
				}

				fw.close();
			} catch (Exception e) {
				System.out.println(e);
			}

			System.out.println("\ncantidad de Registros: " + i);
			System.out.println("cantidad de Registros con la búsqueda: " + i2);
		}

		catch (FileNotFoundException ex) {
			System.out.println("Error: Fichero no encontrado");
			ex.printStackTrace();
		} catch (Exception ex) {
			System.out.println("Error de lectura del fichero");
			ex.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (Exception ex) {
				System.out.println("Error al cerrar el fichero");
				ex.printStackTrace();
			}
		}

	}

}
