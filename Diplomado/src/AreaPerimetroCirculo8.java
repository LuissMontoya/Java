
import java.util.Scanner;



/**
 *
 * @author root
 */
public class AreaPerimetroCirculo8 {
    public static void main(String[] args) {
        Scanner form = new Scanner(System.in);
        
        System.out.println("Digite el radio del Círculo");
        double radio = form.nextDouble();
        
        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;
        System.out.println("El Área del círculo es:" + area);
        System.out.println("El Perímetro del círculo es:" + perimetro);
    }
}
