package javaadvanced.polimorfismo;

public class TestVehiculo {
    public static void main(String[] args) {
        Vehiculo misVehiculos[] = new Vehiculo[4];

        misVehiculos[0] = new Vehiculo("P-65464", "Ford","2009");
        misVehiculos[1] = new VehiculoTurismo("C-65465", "Nissan","2011",8);
        misVehiculos[2] = new VehiculoDeportivo("P-65477", "Ferrari","2021", 8);
        misVehiculos[3] = new VehiculoFurgoneta("C-98798", "Toyota","2012", 800);

        //Este for recorre la cantidad de vehiculos en el arreglo
        for (Vehiculo vehiculos:misVehiculos){
            System.out.println(vehiculos.mostrarDatos());
            System.out.println("");
        }
    }
}
