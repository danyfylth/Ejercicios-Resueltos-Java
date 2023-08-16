/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;

/**
 *
 * @author Daniel
 */
public class Ejercicio1 {
//    Cree un algoritmo que solicite 2 numeros e 
//    indique cual es el mayor, cual es el menor o si son iguales.
    public static void main(String[] args) {
        try {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el primer n�mero: ", "Mayor, Menor o Igual", QUESTION_MESSAGE));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el segundo n�mero: ", "Mayor, Menor o Igual", QUESTION_MESSAGE));

            if (num1 == num2) {
                JOptionPane.showConfirmDialog(null, "Los n�meros son iguales", "Resultado", -1);
            } else {
                if (num1 > num2) {
                    JOptionPane.showConfirmDialog(null, "El n�mero " + num1 + " es mayor.\nEl n�mero " + num2 + " es menor.", "Resultado", -1);
                }else{
                    JOptionPane.showConfirmDialog(null, "El n�mero " + num2 + " es mayor.\nEl n�mero " + num1 + " es menor.", "Resultado", -1);
                }
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showConfirmDialog(null, "Error de datos introducidos.\n\n" + e.getMessage(), "Resultado", -1);
        }
    }
}
