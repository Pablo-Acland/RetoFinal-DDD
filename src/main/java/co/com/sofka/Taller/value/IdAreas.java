package co.com.sofka.Taller.value;

import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class IdAreas extends Identity {
    public IdAreas() {
        super();
    }

    private IdAreas(String id) {
        super(id);
    }

    public static IdAreas of(String id) {
        Objects.requireNonNull(id, "El ID Taller es necesario");
        return new IdAreas(id);
    }
}
