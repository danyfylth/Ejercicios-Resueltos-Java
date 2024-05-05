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
 * � Cu�l es el factor primo m�s grande del n�mero 600851475143 ?
 * 
 * L�gica de soluci�n:
 * Para reducir la iteraci�n de n�meros, al encontrar un
 * n�mero factor primo dividimos el n�mero entre este, porque
 * no afecta al n�mero de factores primos.
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
