/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

/**
 *
 * @author root
 */
public class vector3 {

    public static void main(String[] args) {
        int[] vect = new int[50];
        int[] mayorPr = new int[vect.length];
        double min = 10;
        double max = 100;
        int acum = 0;
        for (int i = 0; i < vect.length; i++) {
            double aleatorio = (int) (Math.random() * ((max - min) + 1)) + min;
            acum += aleatorio;
            vect[i] = (int) aleatorio;
        }
        for (int i = 0; i < vect.length; i++) {
            System.out.println((i + 1) + ": " + vect[i] + '\t');
            if (vect[i] > (acum / vect.length)) {
                mayorPr[i] = vect[i];
            }
        }
        System.out.println("Promedio: " + (acum / vect.length));
        System.out.println("Valores mayores al promedio");

        for (int i = 0; i < mayorPr.length; i++) {
            if (mayorPr[i] != 0) {
                System.out.println((i + 1) + ": " + mayorPr[i] + '\t');
            }

        }
    }
}
