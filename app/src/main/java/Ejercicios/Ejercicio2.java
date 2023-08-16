/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
/**
 *
 * @author Daniel
 */
public class Ejercicio2 {
    /*
    Halle el �rea de un trinagulo rectangulo
    si su base u altura son de un valor desconocido
    (area = (base * altura) / 2)
    este proceso de realizarlo n veces  
    */
    public static void main(String[] args) {
//        try {
//            int nVeces = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca cuantas consultas har�", "N�mero de procesos", INFORMATION_MESSAGE));
//            for (int i = 1; i <= nVeces; i++) {
//                float base = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduzca la base del trinagulo:", "Area del tri�ngulo " + i, QUESTION_MESSAGE));
//                float altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduzca la altura del trinagulo:", "Area del tri�ngulo " + i, QUESTION_MESSAGE));
//                JOptionPane.showConfirmDialog(null, "El �rea del triangulo " + i + " es: " + base * altura, "Resultado " + i, -1, INFORMATION_MESSAGE);
//            }
//        } catch (HeadlessException | NumberFormatException e) {
//            JOptionPane.showConfirmDialog(null, "Error de entrada de datos.\n\n" + e.getMessage(), "Error ", -1, ERROR_MESSAGE);
//        }

        // Otra forma:
//        int question = 0;
//        do {            
//            try {
//                float base = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduzca la base del trinagulo:", "Area del tri�ngulo", QUESTION_MESSAGE));
//                float altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduzca la altura del trinagulo:", "Area del tri�ngulo", QUESTION_MESSAGE));
//                JOptionPane.showConfirmDialog(null, "El �rea del triangulo es: " + base * altura, "Resultado", -1, INFORMATION_MESSAGE);
//                question = JOptionPane.showConfirmDialog(null, "�Desea continuar usando el programa?", "Pregunta",YES_NO_OPTION, INFORMATION_MESSAGE);
//            } catch (HeadlessException | NumberFormatException e) {
//                JOptionPane.showConfirmDialog(null, "Error de entrada de datos.\n\n" + e.getMessage(), "Error ", -1, ERROR_MESSAGE);
//                break;
//            }
//        } while (question == JOptionPane.YES_OPTION);
        
        // Otra forma:
        String question = "0";
        do {            
            try {
                float base = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduzca la base del trinagulo:", "Area del tri�ngulo", QUESTION_MESSAGE));
                float altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduzca la altura del trinagulo:", "Area del tri�ngulo", QUESTION_MESSAGE));
                JOptionPane.showConfirmDialog(null, "El �rea del triangulo es: " + base * altura, "Resultado", -1, INFORMATION_MESSAGE);
                question = String.valueOf(JOptionPane.showConfirmDialog(null, "�Desea continuar usando el programa?", "Pregunta",YES_NO_OPTION, INFORMATION_MESSAGE));
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showConfirmDialog(null, "Error de entrada de datos.\n\n" + e.getMessage(), "Error ", -1, ERROR_MESSAGE);
                break;
            }
        } while (question.equalsIgnoreCase(String.valueOf(JOptionPane.YES_OPTION)));
    }
    
}
