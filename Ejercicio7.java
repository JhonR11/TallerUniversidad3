/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;
import java.util.Scanner;
/**
 *
 * @author jhon_
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int h;
        double s,i,b;
        System.out.println("Ingrese su salario :");
        s= entrada.nextDouble();
        System.out.println("Ingrese cuantas horas trabajo :");
        h= entrada.nextInt();
        
        if(h>=38){
            b=(s*50/100);
        }
            else{ 
            b=0;
        }
        if(s<=750){
            i=0;
            }else{
            i=(s*10/100);   
        }
        s=(s+b)-i;
        System.out.println("Su bonificacion es de: "+b);
        System.out.println("Sus impuestos son: "+i );
        System.out.println("Su salario es:"+ s);
    
    }
    
}
