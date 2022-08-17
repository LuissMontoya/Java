
package estructuras;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class CantidadDigitos5 {
    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        
        System.out.println("Digite la primera nota: ");
        int num1 = cr.nextInt();
        if ( num1 > -1 && num1<=99){
            System.out.println("Cantidad de dígitos: " + Integer.toString(num1).length());
        }
    }
}
