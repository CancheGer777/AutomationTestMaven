package javainter.poo;

public class CuentaRapida {
    private String nombre;
    private String numeroCuenta;
    private double tipoIngreso;
    private double saldo;

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

    public double getTipoIngreso() {
        return tipoIngreso;
    }

    public void setTipoIngreso(double tipoIngreso) {
        this.tipoIngreso = tipoIngreso;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
