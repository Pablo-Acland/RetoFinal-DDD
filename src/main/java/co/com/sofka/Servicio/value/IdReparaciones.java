package co.com.sofka.Servicio.value;

import co.com.sofka.Taller.value.IdAreas;
import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class IdReparaciones extends Identity {
    public IdReparaciones() {
        super();
    }

    private IdReparaciones(String id) {
        super(id);
    }

    public static IdReparaciones of(String id) {
        Objects.requireNonNull(id, "El ID Reparacion es necesario");
        return new IdReparaciones(id);
    }
}
