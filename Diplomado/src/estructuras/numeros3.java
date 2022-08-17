package estructuras;

import java.util.Scanner;

public class numeros3 {

    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        
        System.out.print("Digite la primer número: ");
        int n1 = cr.nextInt();
        System.out.print("Digite la primer número: ");
        int n2 = cr.nextInt();
        System.out.print("Digite la primer número: ");
        int n3 = cr.nextInt();
        
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("El mayor es: " + n1);                                             
            } else {
                System.out.println("el mayor es: " + n3);     
            }
        } else if (n2 > n3) {
            System.out.println("el mayor es: " + n2);
        } else {
            System.out.println("el mayor es: " + n3);
        }
    }
}
