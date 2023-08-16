/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author Daniel
 * 
 * Sumatoria de los multiplos de 3 o de 5 menores que 1000
 */
public class Ejercicio6 {
    
    public static void main (String args[]) {
        
        System.out.println(Solucion());
        
    }
    
    
    public static int Solucion() {
        int sumatoria = 0;
        
        for (int i = 1; i < 1000; i++) {
            if ( ( i % 3 == 0 ) || ( i % 5 == 0 ) ) {
                sumatoria += i;
            }
        }
        
        return sumatoria;
    }
}
