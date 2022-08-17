
package estructuras;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class saldo1 {
    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        System.out.println("Digite su sueldo: ");
        int sueldo = cr.nextInt();
        
        if (sueldo > 3000){
            System.out.println("Debe abonar Impuestos");
        }


    }
}
