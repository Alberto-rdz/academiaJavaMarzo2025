package inyector;

public class Arquera implements Guerrero {

    private Posima posima;

    @Override
    public void setPosima(Posima posima) {
        this.posima = posima;
    }

    @Override
    public void pelear() {
        System.out.println("La Arquera se posiciona desde lejos...");
        posima.beber();
        System.out.println("¡Arquera dispara una lluvia de flechas!");
    }
}
