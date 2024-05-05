/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 * 
 * Los factores primos de 13195 son 5, 7, 13 y 29.
 * ¿ Cuál es el factor primo más grande del número 600851475143 ?
 * 
 * Lógica de solución:
 * Para reducir la iteración de números, al encontrar un
 * número factor primo dividimos el número entre este, porque
 * no afecta al número de factores primos.
 * 
 */
public class Ejercicio8 {

    public static void main(String args[]) {
        
        System.out.println("El primo mayor es: " + encontrarMayorPrimo(600851475143L));
        
    }
    
    public static long encontrarMayorPrimo(long n) {
        
        long number = n;
        List<Long> primos = new ArrayList<>();
        primos.add(2L);
        boolean flag = true;
        
        for (long i = 2; i <= number; i++) {
            boolean sw = false;
            
            if (number % i == 0) {
                for (Long primo : primos) {
                    if (i % primo == 0) {
                        sw = true;
                        break;
                    }
                }
                if (!sw) {
                    if (flag) {
                        primos.clear();
                        flag = false;
                    }
                   primos.add(i);
                   number = number / i;
                }
                
            }  


        }
        System.out.println(primos);
        return primos.get(primos.size() - 1);
    }
    
}
