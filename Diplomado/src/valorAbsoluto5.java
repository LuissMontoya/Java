
import java.util.Scanner;



/**
 *
 * @author root
 */
public class valorAbsoluto5 {
    public static void main(String[] args) {
        
       Scanner cr= new Scanner(System.in);
        int num;
        System.out.print("ingrese el numero:");
        num=cr.nextInt();
        if (num<0)
            System.out.println("El valor absoluto es: " + (num * -1));
        else
            System.out.println("El valor absoluto es: " + num );
    
}
    
}
