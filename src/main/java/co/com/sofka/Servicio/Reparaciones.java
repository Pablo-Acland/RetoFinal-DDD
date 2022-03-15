package co.com.sofka.Servicio;

import co.com.sofka.Clientes.value.OficinaId;
import co.com.sofka.Servicio.value.IdReparaciones;
import co.com.sofka.Servicio.value.Precio;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.value.Especfiaciones;

public class Reparaciones extends Entity<IdReparaciones> {
    private Especfiaciones especfiaciones;
    private boolean realizo= false;
    private Precio precio;

    public Reparaciones(IdReparaciones entityId, Especfiaciones especfiaciones, Precio precio) {
        super(entityId);
        this.especfiaciones=especfiaciones;
        this.precio=precio;
    }

    public void setRealizo(boolean realizo) {
        this.realizo = realizo;
    }
}
