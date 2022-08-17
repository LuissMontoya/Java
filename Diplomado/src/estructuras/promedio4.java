
package estructuras;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class promedio4 {
    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        
        System.out.println("Digite la primera nota: ");
        int num1 = cr.nextInt();

        System.out.println("Digite la segunda nota: ");
        int num2 = cr.nextInt();
        
         System.out.println("Digite la tercer nota: ");
        int num3 = cr.nextInt();
        
        int promedio = (num1 + num2 + num3)/ 3;
        
        if ( promedio >=7 ){
            System.out.println("Promocionado");
        }
    }
}
