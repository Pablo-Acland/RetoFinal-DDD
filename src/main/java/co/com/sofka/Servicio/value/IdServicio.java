package co.com.sofka.Servicio.value;

import co.com.sofka.Taller.value.IdAreas;
import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class IdServicio extends Identity {
    public IdServicio() {
        super();
    }

    private IdServicio(String id) {
        super(id);
    }

    public static IdServicio of(String id) {
        Objects.requireNonNull(id, "El ID Taller es necesario");
        return new IdServicio(id);
    }
}
