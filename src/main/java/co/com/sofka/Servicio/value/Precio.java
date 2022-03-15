package co.com.sofka.Servicio.value;

import co.com.sofka.domain.generic.ValueObject;

public class Precio implements ValueObject<Double> {
    private final Double precio;

    public Precio(Double precio) {
        this.precio = precio;
    }

    @Override
    public Double value() {
        return precio;
    }
}
