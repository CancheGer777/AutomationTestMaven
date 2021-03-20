package javaadvanced.herencia;

public class Tecnico extends Operario {

    public Tecnico(String nombre) {
        super(nombre);
        System.out.println("Constructor de oficial");
    }

    @Override
    public String toString() {
        return super.toString() + " Tecnico";
    }
}
