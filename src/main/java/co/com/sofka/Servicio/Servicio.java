package co.com.sofka.Servicio;

import co.com.sofka.Clientes.value.ClienteId;
import co.com.sofka.Servicio.value.Detalles;
import co.com.sofka.Servicio.value.Fecha;
import co.com.sofka.Servicio.value.IdServicio;
import co.com.sofka.Servicio.value.IdMantenimiento;
import co.com.sofka.Taller.value.IdTaller;
import co.com.sofka.domain.generic.AggregateEvent;

public class Servicio extends AggregateEvent<IdServicio> {
    private IdMantenimiento mantenimiento;
    private Reparaciones reparaciones;
    private IntalacionInfraestructuras instalacion;
    private Fecha fecha;
    private Detalles detalles;
    private ClienteId IdCliente;
    private IdTaller idtaller;

    public Servicio(IdServicio entityId) {
        super(entityId);
    }
}
