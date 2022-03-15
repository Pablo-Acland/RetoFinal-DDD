package co.com.sofka.Clientes.value;

import co.com.sofka.domain.generic.ValueObject;
import co.com.sofka.value.Direccion;

public class Informacion implements ValueObject<String> {

    private final String Rut;
    private final Direccion direccion;

    public Informacion(String Rut, Direccion direccion) {
        this.Rut=Rut;
        this.direccion=direccion;
    }


    @Override
    public String value() {
        return Rut+"  "+direccion.value();
    }
}
