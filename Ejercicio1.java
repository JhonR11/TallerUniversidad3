/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
import java.util.Scanner;
/**
 *
 * @author jhon_
 */
public class Ejercicio1 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la longitud de la habitacion: ");
        float longitud = sc.nextFloat();
        System.out.println("Inrese la altura de la habitacion: ");
        float altura = sc.nextFloat();
        
        System.out.println("El area de la habitacion es: "+ altura* longitud 1+" Metros cuadrados");
        
    }
    
}
