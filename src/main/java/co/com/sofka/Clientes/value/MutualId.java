package co.com.sofka.Clientes.value;

import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class MutualId extends Identity {
    public MutualId() {
        super();
    }

    private MutualId(String id) {
        super(id);
    }

    public static MutualId of(String id) {
        Objects.requireNonNull(id, "El ID Mutual es necesario");
        return new MutualId(id);
    }
}
