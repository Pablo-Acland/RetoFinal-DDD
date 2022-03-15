package co.com.sofka.Servicio;

import co.com.sofka.Servicio.value.Detalles;
import co.com.sofka.Servicio.value.IdInstalacionDeInfraestructura;
import co.com.sofka.Servicio.value.Precio;
import co.com.sofka.domain.generic.Entity;

public class IntalacionInfraestructuras extends Entity<IdInstalacionDeInfraestructura> {
    private boolean realiza=false;
    private Detalles detalles;
    private Precio precio;

    public IntalacionInfraestructuras(IdInstalacionDeInfraestructura entityId, Detalles detalles, Precio precio) {
        super(entityId);
        this.detalles=detalles;
        this.precio=precio;
    }

    public void setRealiza(boolean realiza) {
        this.realiza = realiza;
    }
}
