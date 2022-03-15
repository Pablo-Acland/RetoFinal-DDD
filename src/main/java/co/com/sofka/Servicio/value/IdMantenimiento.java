package co.com.sofka.Servicio.value;

import co.com.sofka.Taller.value.IdAreas;
import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class IdMantenimiento extends Identity {
    public IdMantenimiento() {
        super();
    }

    private IdMantenimiento(String id) {
        super(id);
    }

    public static IdMantenimiento of(String id) {
        Objects.requireNonNull(id, "El ID Mantenimiento es necesario");
        return new IdMantenimiento(id);
    }
}
