package co.com.sofka.Servicio.value;

import co.com.sofka.domain.generic.ValueObject;
import co.com.sofka.value.Especfiaciones;
import co.com.sofka.value.TamañoRed;

public class Detalles implements ValueObject<String> {
    private final Especfiaciones especificaciones;
    private final TamañoRed red;
    private final String problema;

    public Detalles(Especfiaciones especificaciones, TamañoRed red, String problema) {
        this.especificaciones = especificaciones;
        this.red = red;
        this.problema = problema;
    }

    @Override
    public String value() {
        return "Los detalles son "+especificaciones.value()+", "+red+", "+problema;
    }
}
