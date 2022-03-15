package co.com.sofka.Clientes;

import co.com.sofka.Clientes.value.ClienteId;
import co.com.sofka.Clientes.value.Informacion;
import co.com.sofka.Clientes.value.OficinaId;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.value.TamañoRed;

public class Oficinas extends Entity<OficinaId>  {
    private final ClienteId IdCliente;
    private TamañoRed red;
    private Informacion info;

    public Oficinas(OficinaId entityId, ClienteId IdCliente, TamañoRed red, Informacion info) {
        super(entityId);
        this.IdCliente=IdCliente;
        this.red=red;
        this.info=info;
    }
}
