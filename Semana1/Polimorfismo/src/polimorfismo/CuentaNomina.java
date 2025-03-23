package polimorfismo;

public class CuentaNomina extends Cuenta {

    public CuentaNomina(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void operacionEspecial(Cuenta cuenta) {
        System.out.println("Operación especial de cuenta nómina para " + titular);
        System.out.println(titular + " recibe su nómina sin cargos ni intereses.");
    }
}
