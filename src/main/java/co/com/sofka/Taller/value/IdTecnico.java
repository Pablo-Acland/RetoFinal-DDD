package co.com.sofka.Taller.value;

import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class IdTecnico extends Identity {
    public IdTecnico() {
        super();
    }

    private IdTecnico(String id) {
        super(id);
    }

    public static IdTecnico of(String id) {
        Objects.requireNonNull(id, "El ID Taller es necesario");
        return new IdTecnico(id);
    }
}
