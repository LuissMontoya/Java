package matrices;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix1 {

    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);

        System.out.println("Digita el tamaño de la matriz (m): ");
        int m = cr.nextInt();

        int matriz[][] = new int[m][m];
        int vector[] = new int[m * m];

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = (int) (Math.random() * 9 + 1);
            }
        }

        int cont = 0;
        int[] menorFila = new int[matriz[0].length];
        int[] mayorColumna = new int[matriz[0].length];

        for (int x = 0; x < matriz.length; x++) {
            menorFila[x] = matriz[x][0];
            mayorColumna[x] = matriz[x][0];
            for (int y = 0; y < matriz[x].length; y++) {
                vector[cont] = matriz[x][y];
                cont++;
                System.out.print(" " + matriz[x][y]);
                if (matriz[x][y] < menorFila[x]) {
                    menorFila[x] = matriz[x][y];
                }
                if (matriz[x][y] > mayorColumna[x]) {
                    mayorColumna[x] = matriz[x][y];
                }
            }
            System.out.print("\n");
        }
        System.out.println("\n---------------------");
        System.out.println("Menor por Fila");
        for (int i = 0; i < menorFila.length; i++) {
            System.out.print(menorFila[i] + " |");
        }

        System.out.println("\n------------------");
        System.out.println("Mayor por Columna");
        for (int i = 0; i < mayorColumna.length; i++) {
            System.out.print(mayorColumna[i] + " |");
        }
        System.out.println("\n------------------");

        System.out.println("\n------------------");
        System.out.println("Matriz en Vector");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " |");
        }
        System.out.println("\n------------------");
        System.out.println("Matriz Ordenada Descendentemente");

        Arrays.sort(vector);
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.print(vector[i]+ "| ");
        }
        System.out.println("");

    }
}
