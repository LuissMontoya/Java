/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author root+
 */
public class matriz3x4 {

    public static void main(String[] args) {
        int matriz[][] = new int[3][4];
         List<Integer> lista = new Vector<Integer>();
        double promedio = 0;
        int cont = 0;
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = (int) (Math.random() * 9 + 1);
                promedio += matriz[x][y];
            }
        }
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(" " + matriz[x][y]);
            }
            System.out.print("\n");
        }
        promedio = (promedio / 12);
        System.out.println("--------------------");
        System.out.println("Promedio: " + promedio);
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                if (matriz[x][y] > promedio) {
                    cont++;
                    lista.add(matriz[x][y]);
                }
            }
        }
        System.out.println("Número mayores que el promedio: " + cont);
        System.out.println("lista de valores mayores que el promedio:  ");

        for (int i : lista){
            System.out.print(i + "| ");
        }

    }
}
