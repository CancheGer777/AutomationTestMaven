package javainter.poo;

import java.util.Scanner;

public class TestCuenta {

    public static void main(String[] args) {
        Scanner valor= new Scanner(System.in);
        String nombre, numero;
        double tipo, importe;

        /*crear un objeto de la clase cuenta, usando el constructor sin parámetros*/
        Cuenta cuenta1= new Cuenta();

        System.out.println("Ingrese nombre: ");
        cuenta1.setNombre(valor.next());
        System.out.println("ingrese numero de cuenta");
        cuenta1.setNumeroCuenta(valor.next());
        System.out.println("Ingrese tipo de interes: ");
        cuenta1.setTipoInteres(valor.nextDouble());
        System.out.println("Ingrese importe: ");
        cuenta1.setSaldo(valor.nextDouble());
        valor.close();

        Cuenta cuenta2= new Cuenta("Gloria","987987", 12, 5000);
        System.out.println("Nombre cuenta tercero "+ cuenta2.getNombre());
        System.out.println("Monto cuenta tercero " + cuenta2.getSaldo());

        System.out.println("Nombre cuenta origen " + cuenta1.getNombre());
        System.out.println("Saldo cuenta origen " + cuenta1.getSaldo());
        System.out.println("///////////////////////////////////");
        Cuenta cuenta3 = new Cuenta(cuenta1);
        cuenta1.ingreso(cuenta1.getSaldo());
        System.out.println("Despues de importe, saldo cuenta 1 " + cuenta1.getSaldo());
        System.out.println("saldo historial, cuenta 3 " + cuenta3.getSaldo());

        System.out.println("///////////////////////////////////");
        cuenta1.trasferencia(cuenta2,200);
        System.out.println("Nuevo saldo origen " + cuenta1.getSaldo());
        System.out.println("Nuevo saldo cuenta tercero " + cuenta2.getSaldo());

        cuenta2.reintegro(200);
        System.out.println("Nuevo saldo cuenta 2 " + cuenta2.getSaldo());

    }
}
