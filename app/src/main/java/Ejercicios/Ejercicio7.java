/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import com.google.common.math.IntMath;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Daniel
 * 
 * Una permutación es una disposición ordenada de onjetos.
 * Por ejemplo, 3124 es una posible permutación de los digitos
 * 1, 2, 3 y 4. Si todas las permutaciones se enumeran numérica
 * o alfabéticamente, lo llamamos orden lexicográfico. Las
 * permutaciones lexicográficas de A, B y C son:
 * 
 * ABC ACB BAC BCA CAB CBA
 * 
 * ¿Cuál es la millonésima permutación lexicográfica de los digitos
 * A, B, C, D, E, F, G, H, I, J?
 * 
 * 
 * >>>>>>>>>>>>>>> Lógica de Solución:
 * 
 * Si los dígitos serían A, B, C, D:
 * 
 * El factorial de 4 es 24 entonces:
 * 24/4 = 6, esto significan 4 bloques de cada elemento de la lista.
 * Para completar cada combinación, utilizamos la misma lógica restando
 * el valor de implementando a la lista y volver a evaluar:
 * 
 * Si tomamos como ejemplo el primer bloque la letra A ya no estaria en la lista
 * y la lista quedaría B, C, D. El factorial de 3 es 6, y 6 dividido entre 3 es 2
 * entonces habra 3 subbloques de cada elemento de esta nueva lista.
 * 
 * Aplicamos lo mismo y resolvemos todo, como por ejemplo en el bloque 2.
 * 
 * AB
 * AB
 * AC
 * AC
 * AD
 * AD
 * 
 * BACD
 * BADC
 * BCAD
 * BCDA
 * BDAC
 * BDCA
 * 
 * C
 * C
 * C
 * C
 * C
 * C
 * 
 * D
 * D
 * D
 * D
 * D
 * D
 * 
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        // Lista a resolver, el programa supondra que la lista esta ordenada y no hay valores repetidos.
        List<String> myArray = Arrays.asList("A","B","C","D","E","F","G","H","I","J");
        // Pasamos el arrelo a la función de resolución y el número n-ésimo de combinación a encontrar.
        System.out.println(solucion(myArray, 1000000));
    }
    
    public static String solucion(List<String> myList, int n) {
        
        int fact = IntMath.factorial( myList.size() );
        List<String> myArray = myList;
        String resultado = "";
        
        if (fact >= n) {
            List<Integer> combinaciones = encontrarCombinacion(myList, n);
            for (int i = 0; i < combinaciones.size(); i++) {
                String item = myArray.get(combinaciones.get(i));
                resultado = resultado + item;
                myArray = refactorizarLista(myArray, item);
            }

            return resultado;
        } else {
            return new ExceptionInInitializerError("El numero no esta en el rango de combinaciones!!").getMessage();
        }

    }
    
    // Esta funcion elimina un elemento de una lista y nos devuelve una nueva lista
    public static List<String> refactorizarLista( List<String> secuencia, String item ) {
        List<String> listaAux = new ArrayList<>();
        secuencia.forEach((t) -> {
            if (t != item) {
                listaAux.add(t);
            }
        });
        return listaAux;
    }
    
    // Encontramos todas las combinaciones posibles de cada caracter de la lista
    // Asumiendo que el primer caracter sera eliminado de la lista
    public static List<Integer> encontrarCombinacion( List<String> secuencia, int n ) {
        
        List<Integer> listaIndices = new ArrayList<>();
        int counter = 0;
        for (int i = secuencia.size(); i > 0; i--) {
            listaIndices.add(encontrarIndice(i, n));
            counter ++;
        }
        
        return listaIndices; 
    }
    
    // Con esta funcion identificamos el primer Caracter de  la n-ésima combinacion
    // que cuenta con una longitud de size.
    public static int encontrarIndice(int size, int n ) {
        
        int number = n;
        int fact = IntMath.factorial(size);
        int block = fact/size;
        int count = -1;
        while( number > 0 ) {
            
            number = number - block;
            count ++;
            if (count == size ) {
                count = 0;
            }
            
        }
        
        return count;
    }
   
    
}
