package co.com.sofka.value;

import co.com.sofka.domain.generic.ValueObject;

public class Direccion implements ValueObject<String> {
    private final String calle;
    private final String numPuerta;
    private final String Tel;

    public Direccion(String calle, String num, String tel) {
        this.Tel=tel;
        this.calle=calle;
        this.numPuerta=num;
    }

    @Override
    public String value() {
        return calle+", "+numPuerta+", "+Tel;
    }
}
