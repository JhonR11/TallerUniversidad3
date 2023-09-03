/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg6;
import java.util.Scanner;
/**
 *
 * @author jhon_
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
         double a,b,c,A,C;
         System.out.println("Ingrese el valor de el Primer cateto: ");
         a= entrada.nextDouble();
         System.out.println("Ingrese el valor de el segundo cateto: ");
         b= entrada.nextDouble();
       
       c = Math.sqrt(Math.pow(a, 2)+ Math.pow(b, 2));
       A = Math.asin(a/c);
       C = Math.asin(b/c);
       C = Math.toDegrees(C);
       A = Math.toDegrees(A);
        System.out.println("La hipotenusa es: " + c);
        System.out.println("Los angulos son: "+ A + " y "+ C);
    
    }
    
}
