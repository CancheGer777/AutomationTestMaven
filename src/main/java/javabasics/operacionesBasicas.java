package javabasics;

import javax.swing.*;

public class operacionesBasicas {
    /*
    declarar dos variables numercias ingresndo el valor por tecaldo,
    muestra por consuola la suma, resta, mult, div
     */
    public static void main(String[] args) {
        //String numero1= JOptionPane.showInputDialog("ingrese primer numero");
        //String numero2= JOptionPane.showInputDialog("ingrese segundo numero");

        double numeroDouble1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese primer numero"));
        double numeroDouble2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese segundo numero"));
        System.out.println(numeroDouble1 + numeroDouble2);

        double suma = numeroDouble1 + numeroDouble2;
        double resta = numeroDouble1 - numeroDouble2;
        double multiplicacion = numeroDouble1 * numeroDouble2;
        double division = numeroDouble1 / numeroDouble2;

        JOptionPane.showMessageDialog(null, "Resultado suma: " + suma);
        JOptionPane.showMessageDialog(null, "Resultado resta: " + resta);
        JOptionPane.showMessageDialog(null, "Resultado multplicacion: " + multiplicacion);
        JOptionPane.showMessageDialog(null, "Resultado division: " + division);

    }
}
