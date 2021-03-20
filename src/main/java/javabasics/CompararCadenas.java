package javabasics;

import javax.swing.*;
import java.util.Scanner;

public class CompararCadenas {
    public static void main(String[] args) {
//Buenísimo el scanner :) ... es para recibir el valor dentro de la consola
//        Scanner leer = new Scanner(System.in);
//        System.out.println("Escribe la primera palabra");
//        String palabra1 = leer.next();
//        System.out.println("Escribe la primera palabra");
//        String palabra2 = leer.next();
//        leer.close(); //es buena práctica cerrar el scanner al final de leer
//
//        if (palabra1.equalsIgnoreCase(palabra2)){
//            System.out.println("son iguales");
//        }else {
//            System.out.println("NO son iguales");
//        }

        String texto = "Los textos descriptivos son aquellos 12 que caracterizan el aspecto de un elemento, que puede ser un hecho, una persona, una situación, un objeto, un animal, etc. El texto descriptivo (que puede ser oral u escrito) caracteriza la apariencia o el aspecto de algo. Por ejemplo: Aquel era un hombre delgado y alto. Parecía triste.";
        String textoReplace = texto.replace(" ", "");
        String textoSinNumeros = texto.replaceAll(" \\d", "NUMERO");//pendiente ver la funcionalidad
        System.out.println(textoReplace);

        //saber el tamaño de un texto
        System.out.println("El tamaño del texto es " + texto.length());
    }
}
