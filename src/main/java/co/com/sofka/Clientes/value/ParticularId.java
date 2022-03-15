package co.com.sofka.Clientes.value;

import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class ParticularId extends Identity {
    public ParticularId() {
        super();
    }

    private ParticularId(String id) {
        super(id);
    }

    public static ParticularId of(String id) {
        Objects.requireNonNull(id, "El ID Particular es necesario");
        return new ParticularId(id);
    }
}
