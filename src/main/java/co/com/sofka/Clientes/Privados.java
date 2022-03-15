package co.com.sofka.Clientes;

import co.com.sofka.Clientes.value.ClienteId;
import co.com.sofka.Clientes.value.ParticularId;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.value.Datos;
import co.com.sofka.value.Direccion;

public class Privados extends Entity<ParticularId> {

    private final ClienteId IdCliente;
    private Direccion direccion;
    private Datos datos;
    public Privados(ParticularId entityId, ClienteId IdCliente, Direccion direccion, Datos datos) {
        super(entityId);
        this.IdCliente=IdCliente;
        this.datos=datos;
        this.direccion=direccion;

    }
}
