package javabasics;

import javax.swing.*;
import java.awt.*;

public class MayorMenor {
/*
Declarar 2 variables numéricas e indicar cual es mayor
* */
    public static void main(String[] args) {
        int numero1=Integer.parseInt((JOptionPane.showInputDialog("ingrese primer numero ")));
        int numero2=Integer.parseInt((JOptionPane.showInputDialog("ingrese segundo numero ")));

        if (numero1==numero2){
            JOptionPane.showMessageDialog(null, numero1 +" es igual que " + numero2);
        }
        else if (numero1>=numero2){
            JOptionPane.showMessageDialog(null, numero1 +" es mayor que " + numero2);
        }
        else{
            JOptionPane.showMessageDialog(null, numero2 +" es mayor que " + numero1);
        }

    }
}
