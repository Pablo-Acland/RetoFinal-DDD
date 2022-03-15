package co.com.sofka.Servicio;

import co.com.sofka.Servicio.value.IdMantenimiento;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.value.Especfiaciones;

public class Mantenimiento extends Entity<IdMantenimiento> {
    private boolean realiza=false;
    private boolean limpieza=false;
    private Especfiaciones especificaciones;

    public Mantenimiento(IdMantenimiento entityId,Especfiaciones especfiaciones) {
        super(entityId);
        this.especificaciones=especfiaciones;
    }

    public void setRealiza(boolean realiza) {
        this.realiza = realiza;
    }

    public void setLimpieza(boolean limpieza) {
        this.limpieza = limpieza;
    }
}
