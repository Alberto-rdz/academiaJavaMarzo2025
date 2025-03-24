package inyector;

public class Barbaro implements Guerrero {

    private Posima posima;

    @Override
    public void setPosima(Posima posima) {
        this.posima = posima;
    }

    @Override
    public void pelear() {
        System.out.println("El Bárbaro se prepara para la batalla...");
        posima.beber();
        System.out.println("¡Bárbaro ataca con furia!");
    }
}
