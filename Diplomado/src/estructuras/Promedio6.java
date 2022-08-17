package estructuras;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class Promedio6 {

    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        System.out.print("Digite la primer nota: ");
        double nota1 = cr.nextDouble();
        System.out.print("Digite la primer nota: ");
        double nota2 = cr.nextDouble();
        System.out.print("Digite la primer nota: ");
        double nota3 = cr.nextDouble();
        double prome = (nota1 + nota2 + nota3) / 3;

        System.out.print("El promedio es: " + prome);
        System.out.println("\n");
        if (prome >= 7) {
            System.out.println("Promocionado");
        } else if (prome >= 4 && prome < 7) {
            System.out.println("Regular");
        } else if (prome < 4) {
            System.out.println("Reprobado");
        }
    }
}
