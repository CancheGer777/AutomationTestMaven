package javainter;

import javax.swing.*;

public class Arreglos {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        System.out.println("tamaño del arreglo " + numeros.length);
        rellenarListaNumeros(numeros);
        mostrarArreglo(numeros);
    }

    public static void rellenarListaNumeros(int[] arreglo){
        for (int i=0; i<arreglo.length; i++){
            String texto= JOptionPane.showInputDialog("Ingresa un número");
            arreglo[i] = Integer.parseInt(texto);
        }
    }

    public static void mostrarArreglo(int[] arreglo){
        for (int i=0; i<arreglo.length; i++){
            System.out.println("El indice " + i + " tiene el valor de: " + arreglo[i]);
        }
    }

}
