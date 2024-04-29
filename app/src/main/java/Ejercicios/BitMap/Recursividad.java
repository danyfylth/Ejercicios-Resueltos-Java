/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.BitMap;

/**
 *
 * @author Daniel
 */
public class Recursividad {
    
    public static void main(String args[]) {
        System.out.println("Factorial: " + factorial(5));
        System.out.println("Division entera: " + division(10, 2));
        System.out.println("Suma Fibonacci: " + serieFibonacci(8, -1, 1));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int division(int divisor, int dividendo) {
        if ((divisor - dividendo) < 0) {
            return 0;
        }
        return 1 + division((divisor - dividendo), dividendo);
    }

    //Secuencia inicial, a = -1, b = 1
    public static int serieFibonacci(int n, int a, int b) {
        if (n == 0) {
            return 0;
        }
        System.out.println(a + b);
        return (a + b) + serieFibonacci(n - 1, b, a + b);
    }
}
