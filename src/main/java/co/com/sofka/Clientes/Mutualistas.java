package co.com.sofka.Clientes;

import co.com.sofka.Clientes.value.Area;
import co.com.sofka.Clientes.value.ClienteId;
import co.com.sofka.Clientes.value.Informacion;
import co.com.sofka.Clientes.value.MutualId;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.value.TamañoRed;

import java.util.ArrayList;
import java.util.List;

public class Mutualistas extends Entity<MutualId> {
    private ClienteId IdCliente;
    private List<Area> areas;
    private TamañoRed red;
    private Informacion Info;

    public Mutualistas(MutualId entityId, ClienteId IdCliente,TamañoRed red, Informacion Info) {
        super(entityId);
        this.IdCliente=IdCliente;
        this.areas= new ArrayList<>();
        this.red=red;
        this.Info=Info;
    }
}
