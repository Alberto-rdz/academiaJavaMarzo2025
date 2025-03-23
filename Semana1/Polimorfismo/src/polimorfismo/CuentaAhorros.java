package polimorfismo;

public class CuentaAhorros extends Cuenta {

    public CuentaAhorros(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void operacionEspecial(Cuenta cuenta) {
        System.out.println(titular + " aplica intereses sobre su cuenta.");
        double interes = saldo * 0.02;
        saldo += interes;
        System.out.println(titular + " recibió $" + interes + " de interés.");
    }
}
