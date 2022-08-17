/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class numeros2a {
    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        
        System.out.println("Digite el primer número: ");
        int num1 = cr.nextInt();

        System.out.println("Digite el primer número: ");
        int num2 = cr.nextInt();
        
        if ( num1 > num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);}
    }
}
