/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author Daniel
 */
public class Ejercicio10 {
    
    public static void main(String[] args) {

        int[][] b = {
            {0, 1, 1, 0, 0, 1, 0, 1, 1, 1},
            {0, 1, 1, 0, 0, 1, 0, 0, 1, 1},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 1, 1, 0, 0, 1, 0},
            {0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 0, 0},
        };
        
        for (int[] is : b) {
            for (int i : is) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
        
        System.out.println("long max: " + Long.MAX_VALUE + ", long min: " + Long.MIN_VALUE);
        System.out.printf("int max: %s, int min: %s%n", Integer.MAX_VALUE, Integer.MIN_VALUE);
        System.out.printf("double max: %s, double min: %s%n", Double.MAX_VALUE, Double.MIN_VALUE);
        System.out.printf("float max: %s, float min: %s%n", Float.MAX_VALUE, Float.MIN_VALUE);
        System.out.printf("short max: %s, short min: %s%n", Short.MAX_VALUE, Short.MIN_VALUE);
        System.out.printf("byte max: %s, byte min: %s%n", Byte.MAX_VALUE, Byte.MIN_VALUE);
    }
    
    
}
