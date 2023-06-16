
public class EliminarDuplicados {

	public static void main(String[] args) {
		int[] numeros = {1,2,2,2,3,4,4,5,6,7,8,8,8,9,0};

		for(int i=0; i <numeros.length; i++) {
			System.out.print(numeros[i] + " ");			
		}
		System.out.println(" ----------------- \n");
		eliminarD(numeros);
	}
	
	public static int[] eliminarD(int[] vector) {
		
		for(int i=0; i < vector.length; i++) {
			for(int j=0; j < vector.length-1;j++) {
				if(i!=j) {
					if(vector[i] == vector[j]) {
						System.out.println(" > " + vector[i] + " - "+  vector[j]);
						vector[i] = -1;
					}
				}
			}
		}
		
		for(int i=0; i < vector.length; i++) {
			if(vector[i] != -1) {
				System.out.print(" "+ vector[i] + " -");
			}
		}
		return vector;
	}

}
