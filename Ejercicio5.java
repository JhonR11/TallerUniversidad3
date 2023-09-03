/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;
import java.util.Scanner;

/**
 *
 * @author jhon_
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int ne, i = 0, tuv = 0, tid = 0,mayor=0,mayorv=0,pos=0;
   
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("ingrese el numero de elementos a registrar: ");
        ne = entrada.nextInt();
        int[] a = new int[ne];
        int[] b = new int[ne];
        int[] c = new int[ne];
                for (i = 0; i < ne; i++) {
                    System.out.println( "Ingrese el codigo del prodcuto numero:("+(i + 1) +") : ");
                    a[i] = entrada.nextInt();
                    System.out.println("Ingrese el valor de la venta: ");
                    b[i] = entrada.nextInt();
                    System.out.println( "Ingrese la cantidad de unidades vendidas: ");
                    c[i] = entrada.nextInt();
                }
                for (int uv : c) {
                    tuv = tuv + uv;
                }
                for(i=0;i<b.length;i++){
                    if(b[i]>mayor){
                        mayor=b[i];}
                    }
                for(i=0;i<c.length;i++){
                    if(c[i]>mayor){
                        mayorv=c[i];
                        pos+=1;
                        }
                    }
                for (int id : b) {
                    tid = tid + id;
    System.out.println ("El total de todos los productos es: " + tuv);
    System.out.println("El valor total de todas las ventas son: "+tid);
    System.out.println("La mayor venta registrada: "+mayor);
    System.out.println("Producto mas vendido fue el numero: "+a[pos]+"con un total en ventas de de: "+mayorv);
    }
    
}
