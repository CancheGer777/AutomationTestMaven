package javaadvanced.herencia;

public class TestEmpleado {

    public static void main(String[] args) {

        Empleado E1 = new Empleado("Gerson");
        Directivo D1 = new Directivo("Carlos");
        Operario Op1 = new Operario("Julio");
        Oficial Of1 = new Oficial("Marta");
        Tecnico Tec1 = new Tecnico("Silvia");

        //Polimorfismo
        Empleado E2 = new Tecnico("Poly");

        System.out.println("");
        System.out.println(E1);
        System.out.println(D1);
        System.out.println(Op1);
        System.out.println(Of1);
        System.out.println(Tec1);

        System.out.println(E2);
    }
}
