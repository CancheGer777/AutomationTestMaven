package javaadvanced.herencia;

public class Operario extends Empleado {

    public Operario(String nombre) {
        super(nombre);
        System.out.println("Constructor del operario");
    }

    @Override
    public String toString() {
        return super.toString() + " Operario";
    }
}
