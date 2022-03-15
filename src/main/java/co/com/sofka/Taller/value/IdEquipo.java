package co.com.sofka.Taller.value;

import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class IdEquipo extends Identity {
    public IdEquipo() {
        super();
    }

    private IdEquipo(String id) {
        super(id);
    }

    public static IdEquipo of(String id) {
        Objects.requireNonNull(id, "El ID Equipo es necesario");
        return new IdEquipo(id);
    }
}
