package javabasics;

import javax.swing.*;

public class Divisble {
    /*
    lee un número por teclado e indica si es divisibe entre 2
     */

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero"));

        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El número ingresado es divisible entre 2");
        } else {
            JOptionPane.showMessageDialog(null, "No es divisible entre 2");
        }
    }
}
