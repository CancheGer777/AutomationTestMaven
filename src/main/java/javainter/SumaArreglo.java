package javainter;

public class SumaArreglo {
    //crear arreglo de 100 índices

    public static void main(String[] args) {
        int[] numeros = new int[100];
        int suma = 0;

        //recorrer el arreglo, asignar número y sumar
        for (int i = 0; i <= numeros.length; i++) {
            numeros[i] = i + 1;
            suma += numeros[i]; //suma= suma+numeros[i];
        }

        System.out.println("resultado suma " + suma);
    }
}
