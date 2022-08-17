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
public class test {

    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);

        System.out.println("Cantidad total de preguntas realizadas: ");
        double num1 = cr.nextDouble();

        System.out.println("Cantidad de preguntas contestadas correctamente: ");
        double num2 = cr.nextDouble();

        double total = (num2 / num1) * 100;

        System.out.println("Total: " + total);
        if (total >= 90) {
            System.out.println("Nivel Máximo");
        } else if (total >= 75 && total < 90) {
            System.out.println("Nivel Medio");
        } else if (total >= 50 && total < 75) {
            System.out.println("Nivel Regular");
        } else if (total < 50) {
            System.out.println("Fuera de Nivel");
        }
    }
}
