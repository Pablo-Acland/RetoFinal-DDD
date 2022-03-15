package co.com.sofka.Taller.value;

import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class IdTaller extends Identity {
    public IdTaller() {
        super();
    }

    private IdTaller(String id) {
        super(id);
    }

    public static IdTaller of(String id) {
        Objects.requireNonNull(id, "El ID Taller es necesario");
        return new IdTaller(id);
    }
}
