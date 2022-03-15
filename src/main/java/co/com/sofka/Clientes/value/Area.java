package co.com.sofka.Clientes.value;

import co.com.sofka.domain.generic.ValueObject;


public class Area implements ValueObject<String> {
    private final String nombre;

    public Area(String nombre) {
        this.nombre = nombre;

    }

    @Override
    public String value() {
        return nombre;
    }


}
