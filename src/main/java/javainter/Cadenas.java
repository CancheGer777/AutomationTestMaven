package javainter;

public class Cadenas {
//Por medio de una cadena de caracteres, extraer la 4ta y 5ta letra, usando substring

    public static void main(String[] args) {
        String cadena = "Hola mundo";
        String cadenaSub= cadena.substring(2,4);
        System.out.println(cadenaSub);

        //comparar cadenas
        if (cadenaSub.equals("la")){
            System.out.println("Las cadenas son iguales");
        }else {
            System.out.println("Las cadenas NO son iguales");
        }

        if (cadena.equalsIgnoreCase("HOLA MUNDO")){
            System.out.println("Las cadenas son iguales");
        }else {
            System.out.println("Las cadenas NO son iguales");
        }

        if (cadena.contains("mundo")){
            System.out.println("Si está el elemento");
        }else {
            System.out.println("No está el elemento");
        }

        String salida =  cadena.contains("ié") ? "si está el elemento" : "NO está el elemento";
        System.out.println(salida);

    }
}
