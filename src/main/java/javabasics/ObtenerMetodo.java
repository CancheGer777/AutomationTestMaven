package javabasics;

public class ObtenerMetodo {
    public static void main(String[] args) {
        Metodos objeto = new Metodos(15,20);

        objeto.mensajeBienvenida();
        System.out.println(objeto.suma());
        objeto.nombre("soy yo");

    }
}
