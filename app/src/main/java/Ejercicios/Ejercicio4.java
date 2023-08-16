/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

/**
 *
 * @author Daniel
 */
public class Ejercicio4 {
    /*
    
    */
    public static void main(String[] args) {
        
        String nombre = JOptionPane.showInputDialog(null, "Inserte el nombre del estudiante:", "Inserción de notas", JOptionPane.QUESTION_MESSAGE);
        boolean sw = false;
        boolean condicion = true;
        float nota1 = 0, nota2 = 0, nota3 = 0;
        try{
            do {
                if (sw) {
                    JOptionPane.showMessageDialog(null, "Error de datos de entrada.\n\nNúmero menor que cero o no se encuentra en el rango de 0 y 5.\nVuelva a introducir la nota.", "Error", JRootPane.INFORMATION_DIALOG);
                }
                nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Inserte la nota 1:", "Inserción de notas", JOptionPane.QUESTION_MESSAGE));
                sw = true;
                condicion = (nota1 >= 0) && (nota1 <= 5);
            } while (!condicion);

            sw = false;
            do {
                if (sw) {
                    JOptionPane.showMessageDialog(null, "Error de datos de entrada.\n\nNúmero menor que cero o no se encuentra en el rango de 0 y 5.\nVuelva a introducir la nota.", "Error", JRootPane.INFORMATION_DIALOG);
                }
                nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Inserte la nota 2:", "Inserción de notas", JOptionPane.QUESTION_MESSAGE));
                sw = true;
                condicion = (nota2 >= 0) && (nota2 <= 5);
            } while (!condicion);

            sw = false;
            do {
                if (sw) {
                    JOptionPane.showMessageDialog(null, "Error de datos de entrada.\n\nNúmero menor que cero o no se encuentra en el rango de 0 y 5.\nVuelva a introducir la nota.", "Error", JRootPane.INFORMATION_DIALOG);
                }
                nota3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Inserte la nota 3:", "Inserción de notas", JOptionPane.QUESTION_MESSAGE));
                sw = true;
                condicion = (nota3 >= 0) && (nota3 <= 5);
            } while (!condicion);
            
            float promedio = (nota1 + nota2 + nota3) / 3;

            if (promedio >= 3) {
                JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nPromedio: " + promedio + "\n\nGANO :)", "Resultado", JRootPane.INFORMATION_DIALOG);
            } else {
                JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nPromedio: " + promedio + "\n\nPERDIÓ :(", "Resultado", JRootPane.INFORMATION_DIALOG);
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error de datos de entrada.\n\n" + e.getMessage(), "Error", JRootPane.ERROR_DIALOG);
        }
    }
}
