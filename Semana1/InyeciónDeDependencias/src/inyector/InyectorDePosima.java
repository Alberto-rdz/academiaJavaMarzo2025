package inyector;

public class InyectorDePosima {

    public Guerrero inyectarPosima(Guerrero guerrero) {
        if (guerrero instanceof Barbaro) {
            guerrero.setPosima(new PosimaFuerza());
        } else {
            guerrero.setPosima(new PosimaVelocidad());
        }
        return guerrero;
    }
}
