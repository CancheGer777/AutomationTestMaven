package javaadvanced.herencia;

public class Directivo extends Empleado {
    public Directivo() {
        super();
    }

    public Directivo(String nombre) {
        super(nombre);
        System.out.println("Constructor de directivo");
    }

    @Override
    public String toString() {
        return super.toString() + " Directivo";
    }
}
