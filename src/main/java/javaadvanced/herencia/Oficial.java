package javaadvanced.herencia;

public class Oficial extends Operario {

    public Oficial(String nombre) {
        super(nombre);
        System.out.println("Constructor del oficial");
    }

    @Override
    public String toString() {
        return super.toString() + " Oficial";
    }
}
