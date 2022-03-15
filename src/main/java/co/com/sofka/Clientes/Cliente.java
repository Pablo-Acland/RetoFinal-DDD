package co.com.sofka.Clientes;

import co.com.sofka.Clientes.value.ClienteId;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends AggregateEvent<ClienteId> {
    private List<Mutualistas> mutuales;
    private List<Oficinas> oficinas;
    private List<Privados> privados;

    public Cliente(ClienteId entityId) {
        super(entityId);
        this.mutuales= new ArrayList<>();
        this.privados= new ArrayList<>();
        this.oficinas= new ArrayList<>();
    }
}
