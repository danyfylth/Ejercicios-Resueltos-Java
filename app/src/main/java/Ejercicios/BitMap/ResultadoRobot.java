/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.BitMap;

/**
 *
 * @author Daniel
 */
public class ResultadoRobot {

    private int[][] matrizLimpia;
    private int[][] bifurcaciones = new int[4][2];

    ResultadoRobot(int[][] matriz, int[][] bifurcaciones) {
        this.matrizLimpia = matriz;
        this.bifurcaciones = bifurcaciones;
    }

    public int[][] getMatrizLimpia() {
        return matrizLimpia;
    }

    public void setMatrizLimpia(int[][] matrizLimpia) {
        this.matrizLimpia = matrizLimpia;
    }

    public int[][] getBifurcaciones() {
        return bifurcaciones;
    }

    public void setBifurcaciones(int[][] bifurcaciones) {
        this.bifurcaciones = bifurcaciones;
    }

}
