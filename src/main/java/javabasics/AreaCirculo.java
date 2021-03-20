package javabasics;

import javax.swing.*;

public class AreaCirculo {

    public static void main(String[] args) {
        double radio = Double.parseDouble(JOptionPane.showInputDialog("ingrese el radio del circulo"));

        double area = Math.PI * Math.pow(radio, 2);
        JOptionPane.showMessageDialog(null,"El area del circulo es " + area);
    }
}
