
import java.util.Scanner;



/**
 *
 * @author root
 */
public class Ecuacion10 {
    public static void main(String[] args) {
        /*Realizar un algoritmo que obtenga e imprima el valor de y a partir de la ecuación. Y= 3*x2 + 7x –1*/
        
           Scanner form = new Scanner(System.in);
           
           System.out.println("Digite los valores para Y= 3*x2 + 7x –1");
           System.out.print("Valor de x --> ");
           double x = form.nextDouble();
           
            System.out.print("Valor de x2 --> ");
           double x2 = form.nextDouble();
          
           double y = 3*x2 + 7*x - 1;
           System.out.println("El resultado es: " +y);
    }
}
