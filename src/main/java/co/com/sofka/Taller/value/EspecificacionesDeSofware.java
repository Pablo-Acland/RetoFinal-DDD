package co.com.sofka.Taller.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.ArrayList;
import java.util.List;

public class EspecificacionesDeSofware implements ValueObject<String> {
    private final String SO;
    private final List<String> drivers;

    public EspecificacionesDeSofware(String so) {
        SO = so;
        this.drivers = new ArrayList<>();
    }

    @Override
    public String value() {
        return SO;
    }

    public List<String> getDrivers() {
        return drivers;
    }

}
