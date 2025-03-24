package inyector;

public class Main {
    public static void main(String[] args) {
        InyectorDePosima inyector = new InyectorDePosima();

        Guerrero barbaro = inyector.inyectarPosima(new Barbaro());
        Guerrero arquera = inyector.inyectarPosima(new Arquera());

        System.out.println("--- COMIENZA LA BATALLA ---\n");

        barbaro.pelear();

        System.out.println();

        arquera.pelear();

        System.out.println("\n--- FIN DE LA BATALLA ---");
    }
}
