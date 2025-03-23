package polimorfismo;

public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void operacionEspecial(Cuenta cuenta) {
        System.out.println(titular + " está usando su línea de sobregiro.");
        double comision = 50;
        saldo -= comision;
        System.out.println(titular + " pagó una comisión de sobregiro de $" + comision);
    }
}
