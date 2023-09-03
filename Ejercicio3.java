/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg3;
import java.util.Scanner;
/**
 *
 * @author jhon_
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        
        System.out.print("Escriba el numero: ");
        int x= sc.nextInt();
        double y = x/Math.pow(2,x);
        System.out.println("La suma de los terminos (n/2^n) es: "+ y);
    }
    
}
