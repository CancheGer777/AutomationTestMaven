package javainter;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.println("Ingrese numero: ");
        int temp = valor.nextInt();
        int resultado = 0;

        while (temp <= 0) {
            System.out.println("El número es cero, ingrese nuevo número: ");
            temp = valor.nextInt();
        }

        for (int i = 1; i <= 10; i++) {
            resultado = i * temp;
            System.out.println(temp + " por " + i + " = " + resultado);
        }

    }
}
