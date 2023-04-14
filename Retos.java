import java.time.LocalDate;
import java.util.*;

public class App {

    private void invertirString(String text){
        String newText = new StringBuilder(text).reverse().toString();
        System.out.println(newText);
    }

    private void esCapicua(int number){
        String numberText = String.valueOf(number);
        String reverseNumber = new StringBuilder(numberText).reverse().toString();
        if (numberText.equals(reverseNumber)){
            System.out.println("Es Capicua");
        }else{
            System.out.println("No Es Capicua");
        }
    }

    private  void  esMultiplode2(int number){
        if( number % 2 == 0){
            System.out.println("Es Múltiplo");
        }else{
            System.out.println("No Es Múltiplo");
        }
    }

    private void esBisiesto(int year){
       boolean yearB =  LocalDate.of(year,1,1).isLeapYear();
        System.out.println(yearB);
    }

    private void randomOrdenString(String text){
        String[] array = text.split("");
        List<String> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.forEach(System.out::print);
    }

    private void obtenerNoDuplicados(List<Integer> list){
        Set<Integer> set = new HashSet<>(list);
        set.forEach(System.out::println);

    }

    private void vocalTexto(String text){
        boolean result = text.matches(".*[aeiou].*");
        System.out.println(result);
    }

    private boolean esPalindromo(String text){
        boolean result = true;
        int length = text.length();
        
        for (int i = 0; i < length/2; i++){
            if(text.charAt(i) != text.charAt(length-i-1)){
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        App app = new App();
        app.invertirString("luismontoya");
        app.esCapicua(524);
        app.esMultiplode2(18);
        app.esBisiesto(2024);
        app.randomOrdenString("luis");
        System.out.println("\n");
        app.obtenerNoDuplicados(Arrays.asList(12,2,3,4,5,5,5,6,78,8,9,1,1,1,1,1,2,3));
        System.out.println("\n");
        app.vocalTexto("llssdfo");
        System.out.println(app.esPalindromo("oro"));
    }





}
