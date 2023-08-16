/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Daniel
 * 
 * Ejercicio 5
 * 
 * Extraido de: https://www.youtube.com/watch?v=2OlEhnqu1Gw
 * 
 * Crea una funcion a la cual le pase un array de numeros
 * y un numero que será el resultado de la suma de dos de los valores
 * 
 * Ejemplos:
 * 
 * SumarDos([3, 7, 8, 2], 10) // [3, 7] (ambos suman 10)
 * SumarDos([4, 5, 9, 1], 10) // [9, 1]
 * SumarDos([1, 2, 3, 4], 5) // [2, 3]
 * 
 */
public class Ejercicio5 {
    public static void main(String args[]){
        
        List<Integer> myArr1 = Arrays.asList(3, 5, 5, 2);
        List<Integer> myArr2 = Arrays.asList(4, 5, 9, 1);
        List<Integer> myArr3 = Arrays.asList(1, 2, 3, 4);
        
        System.out.println("Resultados con mi función:");
        System.out.println(SumarDos(myArr1, 10));
        System.out.println(SumarDos(myArr2, 10));
        System.out.println(SumarDos(myArr3, 5));
        
        System.out.println("Resultados la función de internet:");
        System.out.println(SumarDosv2(myArr1, 10));
        System.out.println(SumarDosv2(myArr2, 10));
        System.out.println(SumarDosv2(myArr3, 5));
    }
    
    // Esta es mi version de resolución
    public static List<Integer> SumarDos( List<Integer> array, int numSum ){
       // Ordenando descendentemente
       // array.sort((o1, o2) -> o2.compareTo(o1));
       
//       array.forEach((t) -> {
//           System.out.println(t);
//       });
    
        int n1 = 0, n2 = 0;

        for (int i = 0; i < array.size(); i++) {
            
            for (int j = 0; j < array.size(); j++) {
                
                if (i != j) {
                    
                    if ((array.get(i) + array.get(j)) == numSum) {
                        
                        n1 = array.get(i);
                        n2 = array.get(j);
                        
                    }
                    
                }
                
            }
            
        }
       return Arrays.asList(n1, n2);
    } 
    
    // Version encontrada en internet, no sirve para valores iguales en el arreglo
    public static List<Integer> SumarDosv2( List<Integer> array, int numSum ){
   

        for (int i = 0; i < array.size(); i++) {
            
            int n1 = array.get(i);
            int n2 = numSum - n1;
            
            if (array.contains(n2) && n1 != n2) {
                return Arrays.asList(n1, n2);
            }
            
        }
       return Arrays.asList(0, 0);
    } 
    
}
