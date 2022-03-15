package co.com.sofka.Taller;

import co.com.sofka.Taller.value.IdEquipo;
import co.com.sofka.Taller.value.IdTecnico;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.value.Datos;

public class Tecnicos extends Entity<IdTecnico> {
    private Datos datos;
    private String especialisacion;

    public Tecnicos(IdTecnico entityId, Datos datos, String especialisacion) {
        super(entityId);
        this.datos=datos;
        this.especialisacion=especialisacion;
    }
}
