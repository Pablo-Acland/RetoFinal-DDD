package co.com.sofka.Taller;

import co.com.sofka.Taller.value.EspecificacionesDeSofware;
import co.com.sofka.Taller.value.IdEquipo;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.value.Especfiaciones;

public class Equipo extends Entity<IdEquipo> {
    private EspecificacionesDeSofware sofware;
    private Especfiaciones especificaciones;

    public Equipo(IdEquipo entityId, Especfiaciones especfiaciones, EspecificacionesDeSofware sofware) {
        super(entityId);
        this.especificaciones=especfiaciones;
        this.sofware=sofware;
    }
}
