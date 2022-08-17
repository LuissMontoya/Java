package matrices;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class Vector2 {

    public static void main(String[] args) {
        int[] vect = new int[15];
        double min = 10;
        double max = 100;
        for (int i = 0; i < vect.length; i++) {
            
            double aleatorio = (int)(Math.random()*((max-min)+1))+min;
            vect[i] = (int) aleatorio;
        }
        for (int i = 0; i < vect.length; i++) {
            System.out.println((i+1)+ ": "+vect[i] + '\t' );
        }

    }
}
