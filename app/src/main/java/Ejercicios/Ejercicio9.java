/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author Daniel
 * 
 * Si listamos todos los n�meros naturales m�ltiplos
 * de 3 o de 5 menores que 10 son 3, 5, 6 y 9. Y la
 * suma de estos n�meros es 23.
 * � C�al es la sumatoria de los m�ltiplos de 3 o de 5
 * menores a 1000?
 * 
 */
public class Ejercicio9 {
    
    public static void main( String[] args ) {
        
        System.out.println("Sumatoria de multiplos: " + solucion(1000));
        
    }
    
    public static int solucion(int n) {
        
        int s = 0;
        for (int i = 3; i < n; i++) {
            if ( (i % 3 == 0) || (i % 5 == 0) ) {
                s += i;
                System.out.println(i);
            }
        }
        
        return s;
    }
    
}
