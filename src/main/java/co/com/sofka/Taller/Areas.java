package co.com.sofka.Taller;

import co.com.sofka.Taller.value.IdAreas;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.ValueObject;

import java.util.ArrayList;
import java.util.List;

public class Areas extends Entity<IdAreas> {
    private String especialisacion;
    private List<String> Heramientas;
    private List<String> Inmuebles;

    public Areas(IdAreas entityId, String especialisacion) {
        super(entityId);
        this.especialisacion=especialisacion;
        this.Heramientas= new ArrayList<>();
        this.Inmuebles= new ArrayList<>();
    }
}
