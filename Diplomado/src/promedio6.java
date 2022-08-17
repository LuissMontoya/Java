
import java.util.Scanner;



/**
 *
 * @author root
 */
public class promedio6 {
    //Calcular el promedio de 5 números, y mostrar la suma y el promedio
    public static void main(String[] args) {
         Scanner cr = new Scanner(System.in);
         int[] nums= new int[5];
         int acum = 0;
         for(int i=0; i< nums.length; i++){
             System.out.println("Digite el número "+ (i+1));
             nums[i] = cr.nextInt();
             acum = acum + nums[i];
         }
         System.out.println("La Suma es: "+ acum);
         System.out.println("El Promedio es: "+ acum/nums.length);
    }
}
