package polimorfismo;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new CuentaAhorros("Ana", 1000);
        Cuenta cuenta2 = new CuentaCorriente("Luis", 500);
        Cuenta cuenta3 = new CuentaNomina("Carlos", 2000);

        cuenta1.operacionEspecial(cuenta1);
        cuenta1.mostrarSaldo();

        System.out.println();

        cuenta2.operacionEspecial(cuenta2);
        cuenta2.mostrarSaldo();

        System.out.println();

        cuenta3.operacionEspecial(cuenta3);
        cuenta3.mostrarSaldo();
    }
}
