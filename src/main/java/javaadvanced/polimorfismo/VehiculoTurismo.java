package javaadvanced.polimorfismo;

public class VehiculoTurismo extends Vehiculo{
    private int numeroPuertas;

    public VehiculoTurismo(String matricula, String marca, String modelo, int numeroPuertas) {
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    @Override
    public String mostrarDatos(){
        return super.mostrarDatos() + "\nNumero de puertas: " + numeroPuertas;
    }
}
