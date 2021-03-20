package javaadvanced.polimorfismo;

public class VehiculoDeportivo extends Vehiculo{
    private int cilindros;

    public VehiculoDeportivo(String matricula, String marca, String modelo, int cilindros) {
        super(matricula, marca, modelo);
        this.cilindros = cilindros;
    }

    public int getCilindros() {
        return cilindros;
    }

    @Override
    public String mostrarDatos(){
        return super.mostrarDatos() + "\nCilindrada: " + cilindros;
    }
}
