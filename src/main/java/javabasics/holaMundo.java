package javabasics;

public class holaMundo {

    public String global = "hola";

    public static void main(String[] args) {
        //tipo de datos como clase, unión de caracteres
        String nombre = "Gerson";
        //tipo de datos primitivo o nativo
        int edad = 30;
        float estatura = (float) 173.50;
        double estarura2 = 173.5123478;
        char letra = 'G';
        boolean flag = true;

        System.out.println("hola mundo" + nombre);

        double numero1 = 500;
        double numero2 = 35.37;
        double suma = numero1 + numero2;
        System.out.println("resultado: " + suma);
    }
}


