package co.com.sofka.Servicio.value;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDateTime;

public class Fecha implements ValueObject<LocalDateTime> {
    private final LocalDateTime Fecha;

    public Fecha() {
        this.Fecha = LocalDateTime.now();
    }

    @Override
    public LocalDateTime value() {
        return Fecha;
    }
}
