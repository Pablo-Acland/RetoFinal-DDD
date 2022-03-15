package co.com.sofka.Clientes.value;

import co.com.sofka.Clientes.Cliente;
import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class ClienteId extends Identity {
    public ClienteId() {
        super();
    }

    private ClienteId(String id) {
        super(id);
    }

    public static ClienteId of(String id) {
        Objects.requireNonNull(id, "El Cliente es necesario");
        return new ClienteId(id);
    }
}
