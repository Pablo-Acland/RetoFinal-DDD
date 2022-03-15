package co.com.sofka.Taller;

import co.com.sofka.Clientes.value.MutualId;
import co.com.sofka.Taller.value.Equipamiento;
import co.com.sofka.Taller.value.IdAreas;
import co.com.sofka.domain.generic.Entity;

public class Areas extends Entity<IdAreas> {
    private Equipamiento equipamiento;
    private String especialisacion;

    public Areas(IdAreas entityId, Equipamiento equipamiento, String especialisacion) {
        super(entityId);
        this.equipamiento=equipamiento;
        this.especialisacion=especialisacion;
    }
}
