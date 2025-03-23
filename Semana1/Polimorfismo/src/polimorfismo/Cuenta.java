package polimorfismo;

public abstract class Cuenta {

    protected String titular;
    protected double saldo;

    public Cuenta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public abstract void operacionEspecial(Cuenta cuenta);

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo de " + titular + ": $" + saldo);
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println(titular + " depositó $" + cantidad);
    }

    public void retirar(double cantidad) {
        saldo -= cantidad;
        System.out.println(titular + " retiró $" + cantidad);
    }
}
