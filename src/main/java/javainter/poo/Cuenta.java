package javainter.poo;

public class Cuenta {
    //protected - es visible dentro de todas las clases del paquete
    //private - es visible solo para la clase
    private String nombre;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String nombre, String numeroCuenta, double tipoInteres, double saldo) {
        //this - hace referencia a que se van a utilizar las variables de la clase,
        //Si tienen nombre distintos no es necesario utilizar this, pero por norma y estética utilizar el mismo
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    public Cuenta(Cuenta c) {
        nombre = c.nombre;
        numeroCuenta = c.numeroCuenta;
        tipoInteres = c.tipoInteres;
        saldo = c.saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean ingreso(double n) {
        boolean ingresoCorrecto = true;
        if (n < 0)
            ingresoCorrecto = false;
        else
            saldo = saldo + n;
        return ingresoCorrecto;
    }

    public boolean reintegro(double n) {
        boolean reintegroCorrecto = true;
        if (n < 0)
            reintegroCorrecto = false;
        else if (saldo >= n)
            saldo -= n;
        else
            reintegroCorrecto = false;
        return reintegroCorrecto;
    }

    public boolean trasferencia(Cuenta c, double n) {
        boolean correcto = true;
        if (n < 0) {
            correcto = false;
        } else if (saldo >= n) {
            reintegro(n);
            c.ingreso(n);
        } else {
            correcto = false;
        }
        return correcto;
    }

}//endClass
