package Ejercicios.BitMap;

import java.util.TreeMap;

/**
 *
 * @author Daniel Ejercicio: Buscar grupos de 1 y contarlos dentro de la matriz
 * esta puede estar de diversas maneras pero se tendra que contar los grupos
 * contando las diagonales como conexión tambien.
 */
public class EjercicioMatrizBitmap {

    static private int[][] bitMap = {
        {0, 1, 0, 1, 1, 1},
        {1, 1, 0, 1, 1, 1},
        {1, 1, 0, 1, 0, 0},
        {0, 0, 0, 0, 1, 1},
        {1, 1, 0, 0, 1, 0},
        {0, 1, 0, 0, 0, 0},};

    public static void main(String args[]) {
        for (int i = 0; i < bitMap.length; i++) {
            for (int j = 0; j < bitMap.length; j++) {
                System.out.print(bitMap[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static ResultadoRobot robot(int[][] matriz, int direccionX, int direccionY) {
        // Asumiremos que siempre se tratara de una matriz cuadrada
        // LIMITES
        int ancho = matriz[0].length;
        int alto = matriz.length;
        // RESULTADOS
        int[][] matrizOperada = matriz;
        int[][] bifurcaciones = new int[4][2];
        // OPERACIONES

        return null;
    }

}
