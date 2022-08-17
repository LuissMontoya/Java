/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class num3cifras {

    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);

        System.out.println("Digite un valor entero positivo: ");
        int num1 = cr.nextInt();

        if (num1 > -1 && Integer.toString(num1).length() <= 3) {
            System.out.println("Cantidad de dígitos: " + Integer.toString(num1).length());
        }else{
            System.out.println("El número de cifras es mayor");}
    }
}
