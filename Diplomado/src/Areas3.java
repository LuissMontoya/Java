
import java.util.Scanner;

public class Areas3 {
        
     public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        System.out.println("Seleccione una Opción: ");
        menu();  
        int op = cr.nextInt();
        switch (op){
            case 1:
                System.out.print("Digite la base-->");
                double base = cr.nextDouble();
                System.out.print("Digite la altura-->");
                double h = cr.nextDouble();
                System.out.println("El área del triángulo es: "+ (base * h)/2);
                break;
       
            case 2: 
                System.out.print("Digite el lado-->");
                double lado = cr.nextDouble();
                System.out.println("El área del Cuadrado es: "+ Math.pow(lado, 2));
                break;
             
            case 3:
                System.out.print("Digite el radio-->");
                double radio = cr.nextDouble();
                System.out.println("El área del Círculo es: "+ (Math.PI* Math.pow(radio, 2)));
                break;
         
            default:
                System.out.println("Dígito no conocido!");
                break;
        }
    }
     
public static void menu(){
    System.out.println("1.Área de triángulo");
    System.out.println("2.Área de Cuadrado");
    System.out.println("3.Área de Círculo");
    
}     

}
