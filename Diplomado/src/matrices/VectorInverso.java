
package matrices;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class VectorInverso {
    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        
         int[] vect = new int[15];
         
         for (int i = 0; i < vect.length; i++) {
             System.out.print("Digite el Número "+ (i+1) + "-->");
             vect[i] = cr.nextInt();
        }
         System.out.println("El vector es: ");
         
          for (int i = 0; i < vect.length; i++) {
             System.out.print(vect[i]+ "- ");
        }
          
          System.out.println("\nEl vector Inverso es: ");
         
          for (int i = vect.length-1; i >= 0; i--) {
             System.out.print(vect[i]+ "- ");
        }
        
    }
}
