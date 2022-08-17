package estructuras;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class Positivo {

    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);

        System.out.print("Digite el valor: ");
        int n1 = cr.nextInt();

        if (n1 == 0) {
            System.out.println("El valor es Nulo");
        }else if(n1>0){
            System.out.println("El valor es positivo");
        }else if(n1<0){
            System.out.println("El valor es Negativo");
        }
    }
}
