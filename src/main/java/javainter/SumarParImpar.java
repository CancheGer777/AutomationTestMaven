package javainter;

import java.util.Scanner;

public class SumarParImpar {

    public static void main(String[] args) {
        Scanner datoIngreso = new Scanner(System.in);
        double par = 0;
        double impar = 0;
        double residuo;
        double numeroTemp;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingrese el número [" + i + "]");
            numeroTemp = datoIngreso.nextDouble();

            while (numeroTemp<0){
                System.out.println("Numero menor que cero, ingrese nuevamente: ");
                numeroTemp = datoIngreso.nextDouble();
            }

            residuo = numeroTemp % 2;
            if (residuo == 0) {
                par += numeroTemp;
                System.out.println("Numero par");
            }
            if (residuo != 0 && residuo > 0) {
                impar += numeroTemp;
                System.out.println("Numero impar");
            }
        }

        datoIngreso.close();
        System.out.println("La sumatoria de los pares es: " + par);
        System.out.println("La soumatoria de ls impares es " + impar);

    }
}
