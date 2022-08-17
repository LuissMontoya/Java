
import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @Luiss Montoya
 */
public class Operadores1 {
    

     public static void main(String[] args) {
         Scanner cr = new Scanner(System.in);
         int[] nums= new int[5];
         
         for(int i=0; i< nums.length; i++){
             nums[i] = cr.nextInt();
         }
         
         System.out.println("La raíz del tercer número es: " + Math.sqrt(nums[2]) );
         System.out.println("La potencia del primer Número con el último es: " + Math.pow(nums[0], nums[4]));
         
         Arrays.sort(nums);
         
         System.out.println("Menor número " +nums[0]);
         System.out.println("Mayor número " +nums[4]);
    }
}
