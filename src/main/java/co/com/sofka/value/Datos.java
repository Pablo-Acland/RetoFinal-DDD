package co.com.sofka.value;

import co.com.sofka.domain.generic.ValueObject;

public class Datos implements ValueObject<String> {
    private final String nombre;
    private final String apellido;
    private final Direccion direccion;
    private final String edad;

    public Datos(String nombre, String apellido, Direccion direccion, String edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
    }

    @Override
    public String value() {
        return nombre+" "+apellido+" "+direccion.value()+" "+edad;
    }
}
