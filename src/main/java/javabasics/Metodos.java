package javabasics;

public class Metodos {
    int numero1, numero2;

    public Metodos(int numero1, int numero2){
        this.numero1=numero1;
        this.numero2=numero2;
    }

    public void mensajeBienvenida(){
        System.out.println("Bienvenido al curso de selenium");
    }

    public int suma(){
        return numero1 + numero2;
    }

    public String nombre(String nombre){
        System.out.println(nombre);
        return nombre;
    }

}
