package package1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TXT {

	public static void main(String[] args) {
		
		String nombreFichero = "D:\\Luis\\Archivos\\prueba.txt";
		BufferedReader br = null;
		
		try {
		    br = new BufferedReader(new FileReader(nombreFichero));
		    String texto = br.readLine();
		    String search = "claro";
		    while(texto != null) {
		        //System.out.println(texto);
		        texto = br.readLine();
		        
		        if(search.equals(texto)) {
		        	 System.out.println(texto);
		        }
		    }
		    

		}
		
		
		
		catch (FileNotFoundException ex) {
		    System.out.println("Error: Fichero no encontrado");
		    ex.printStackTrace();
		}
		catch(Exception ex) {
		    System.out.println("Error de lectura del fichero");
		    ex.printStackTrace();
		}
		finally {
		    try {
		        if(br != null) {
		            br.close();
		        }
		    }
		    catch (Exception ex) {
		        System.out.println("Error al cerrar el fichero");
		        ex.printStackTrace();
		    }
		}

	}

}
