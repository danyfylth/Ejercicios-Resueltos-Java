package Ejercicios.BitMap;

import java.util.TreeMap;

/**
 *
 * @author Daniel Ejercicio: Buscar grupos de 1 y contarlos dentro de la matriz
 * esta puede estar de diversas maneras pero se tendra que contar los grupos
 * contando las diagonales como conexión tambien. 
 *
 * Resultado hasta el momento: Problema con diagonales o cuellos, solucionarlo
 */
public class EjercicioMatrizBitmap {

    static private int[][] bitMap = {
        {0, 1, 0, 1, 1, 1},
        {1, 1, 0, 1, 1, 1},
        {1, 1, 0, 0, 1, 0},
        {1, 1, 1, 0, 1, 1},
        {1, 1, 1, 0, 1, 0},
        {1, 1, 1, 0, 0, 0},};

    public static void main(String args[]) {
        System.out.println("Matriz: ");
        mostrarMatriz(bitMap);
        System.out.println("\nContando manchas: \n");
        System.out.println("Numero de manchas: " +robot(bitMap));
    }

    public static int robot(int[][] matriz) {
        int columnas = matriz[0].length;
        int filas = matriz.length;
        int numeroManchas = 0;
        // Copiar la matriz
        int[][] matrizCopia = matriz;

        while(!estaLimpio(matrizCopia)) {
            int[] robotAdress = {0, 0};
            bucleFila: for(int f = 0; f < filas; f++) {
                for(int c = 0; c < columnas; c++) {
                    if(matrizCopia[f][c] == 1) {
                        robotAdress[0] = f; // Hace referencia a la posicion en x
                        robotAdress[1] = c; // Hace referencia a la posicion en y
                        break bucleFila;
                    }
                }
            }
            matrizCopia = robotLimpiador(matrizCopia, robotAdress[0], robotAdress[1]);
            numeroManchas++;
            mostrarMatriz(matrizCopia);
            System.out.println("\n***************\n");
        }
        return numeroManchas;
    }

    public static int[][] robotLimpiador(int[][] matriz, int x, int y) {
        int fila = x, columna = y;
        int[][] matrizCopia = matriz;
        int numeroFilas = matrizCopia.length;
        int numeroColumnas = matrizCopia[0].length;

        // Limpiar:
        // Paso 1: right,
        // Paso 2: right-bottom,
        // Paso 3: bottom,
        // Paso 4: left-bottom,
        // Paso 5: left,
        // Paso 6: left-top,
        // Paso 7: top,
        // Paso 8: top-right
        while (matrizCopia[fila][columna] == 1) {
            boolean limpiar = true;
            if (columna + 1 <= numeroColumnas - 1) {
                 if ((matrizCopia[fila][columna + 1] == 1) && limpiar) {
                    matrizCopia[fila][columna] = 0;
                    columna = columna + 1;
                    limpiar = false;
                 }
            }
                 
            if((columna + 1 <= numeroColumnas - 1) && (fila + 1 <= numeroFilas - 1)){
                 if ((matrizCopia[fila + 1][columna + 1] == 1) && limpiar) {
                     matrizCopia[fila][columna] = 0;
                     fila = fila + 1;
                     columna = columna + 1;
                     limpiar = false;
                 }
            }
                     
            if ((fila + 1 <= numeroFilas - 1)) {
                 if ((matrizCopia[fila + 1][columna] == 1) && limpiar) {
                     matrizCopia[fila][columna] = 0;
                     fila = fila + 1;
                     limpiar = false;
                 }
            }

            if((columna - 1 >= 0) && (fila + 1 <= numeroFilas - 1)){
                 if ((matrizCopia[fila + 1][columna - 1] == 1) && limpiar) {
                     matrizCopia[fila][columna] = 0;
                     fila = fila + 1;
                     columna = columna - 1;
                     limpiar = false;
                 }
            }

            if((columna - 1 >= 0)){
                 if ((matrizCopia[fila][columna - 1] == 1) && limpiar) {
                     matrizCopia[fila][columna] = 0;
                     columna = columna - 1;
                     limpiar = false;
                 }
            }

            if((columna - 1 >= 0) && (fila - 1 >= 0)){
                 if ((matrizCopia[fila - 1][columna - 1] == 1) && limpiar) {
                     matrizCopia[fila][columna] = 0;
                     fila = fila - 1;
                     columna = columna - 1;
                     limpiar = false;
                 }
            }
            if((fila - 1 >= 0)){
                 if ((matrizCopia[fila - 1][columna] == 1) && limpiar) {
                     matrizCopia[fila][columna] = 0;
                     fila = fila - 1;
                     limpiar = false;
                 }
            }

            if((columna + 1 <= numeroColumnas - 1) && (fila - 1 >= 0) && limpiar) {
                 if (matrizCopia[fila - 1][columna + 1] == 1) {
                     matrizCopia[fila][columna] = 0;
                     fila = fila - 1;
                     columna = columna + 1;
                 } else {
                     matrizCopia[fila][columna] = 0;
                 }
            }
        }
        
        return matrizCopia;
    }

    public static boolean recordarCamino(int[][] matriz, int x, int y) {
        int contadorCeros = 0;
        int numeroFilas = matriz.length;
        int numeroColumnas = matriz[0].length;

        if (x - 1 >= 0 && y - 1 >= 0) {
            if (matriz[x - 1][y - 1] == 0) {
                contadorCeros++;
            }
        }

        if (x - 1 >= 0) {
            if (matriz[x - 1][y] == 0) {
                contadorCeros++;
            }
        }

        if (x - 1 >= 0 && y + 1 <= numeroColumnas - 1) {
            if (matriz[x - 1][y + 1] == 0) {
                contadorCeros++;
            }
        }

        if (y + 1 <= numeroColumnas - 1) {
            if (matriz[x][y + 1] == 0) {
                contadorCeros++;
            }
        }

        if (x + 1 <= numeroFilas - 1 && y + 1 <= numeroColumnas - 1) {
            if (matriz[x + 1][y + 1] == 0) {
                contadorCeros++;
            }
        }

        if (x + 1 <= numeroFilas - 1) {
            if (matriz[x + 1][y] == 0) {
                contadorCeros++;
            }
        }

        if (x + 1 <= numeroFilas - 1 && y - 1 >= 0) {
            if (matriz[x + 1][y - 1] == 0) {
                contadorCeros++;
            }
        }
        
        if (y - 1 >= 0) {
            if (matriz[x][y - 1] == 0) {
                contadorCeros++;
            }
        }

        if (contadorCeros > 2) {
            return false;
        }

        return true;
    }

    public static boolean estaLimpio(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(matriz[i][j] == 1) {
                   return false;
                }
            }
        }
        return true;
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
