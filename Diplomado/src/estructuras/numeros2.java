package estructuras;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class numeros2 {

    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);

        System.out.println("Digite el primer número: ");
        int num1 = cr.nextInt();

        System.out.println("Digite el primer número: ");
        int num2 = cr.nextInt();

        if (num1 > num2) {
            System.out.println("Suma: " + (num1 + num2));
            System.out.println("Diferencia: " + (num1 - num2));
        }else{
        System.out.println("Producto: "+ (num1*num2));
        System.out.println("División: "+ (num1/num2));
        }
    }
}
