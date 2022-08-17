
import java.util.Scanner;

/**
 *
 * @author root
 */
public class Salario9 {
    public static void main(String[] args) {
        /*Calcular el nuevo salario de un obrero si tuvo un incremento del 25 % sobre el salario anterior*/
         Scanner form = new Scanner(System.in);
        
         System.out.println("Digite el salario del Obrero: ");
          float salario = form.nextFloat();
         
          System.out.println("El salario actual es: " + (salario + (salario * 0.25)));
         
         
    }
 
}
