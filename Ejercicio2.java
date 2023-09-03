/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;
import java.util.Scanner;
/**
 *
 * Escribir un programa que lea la hora en notación de 24 horas y que imprima en notación de 12; por ejemplo, si la 
entrada es 13:45, la salida será 1:45 pm. El programa debe solicitar al usuario que introduzca exactamente cinco 
caracteres para especificar una hora; por ejemplo, las 9 en punto se debe introducir así: 09:00
 * @author jhon_
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
        System.out.print("Escriba la hora en formato de 24hrs: ");
        int horas = sc.nextInt();
        System.out.print("Escriba los minutos: ");
        int min = sc.nextInt();
        
        if (horas<=12){
            System.out.println(horas+":"+min+"AM");
        }
        else{
             int h=horas-12;
             System.out.println(h+":"+min+"PM");
                }
        
    }
    
}
