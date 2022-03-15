package co.com.sofka.Clientes.value;

import co.com.sofka.Clientes.Oficinas;
import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class OficinaId extends Identity {
    public OficinaId() {
        super();
    }

    private OficinaId(String id) {
        super(id);
    }

    public static OficinaId of(String id) {
        Objects.requireNonNull(id, "El ID Oficina es necesario");
        return new OficinaId(id);
    }
}
