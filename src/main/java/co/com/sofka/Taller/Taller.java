package co.com.sofka.Taller;

import co.com.sofka.Clientes.value.ClienteId;
import co.com.sofka.Taller.value.IdTaller;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.value.Direccion;

import java.util.ArrayList;
import java.util.List;

public class Taller extends AggregateEvent<IdTaller> {
    private List<Areas> areas;
    private List<Equipo> equipo;
    private List<Tecnicos> tecnicos;
    private Direccion direccion;


    public Taller(IdTaller entityId) {
        super(entityId);
    }
}
