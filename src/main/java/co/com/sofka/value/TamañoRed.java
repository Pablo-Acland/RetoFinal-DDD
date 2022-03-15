package co.com.sofka.value;

import co.com.sofka.domain.generic.ValueObject;

public class TamañoRed implements ValueObject<String> {
    private final String CantidadEquipos;
    private final String routersDisponibles;
    private final String metrosCables;
    private final String cantidadSwiches;

    public TamañoRed(String cantidadEquipos, String routersDisponibles, String metrosCables, String cantidadSwiches) {
        CantidadEquipos = cantidadEquipos;
        this.routersDisponibles = routersDisponibles;
        this.metrosCables = metrosCables;
        this.cantidadSwiches = cantidadSwiches;
    }


    @Override
    public String value() {
        return "Tamaño de Red "+CantidadEquipos+", "+routersDisponibles+", "+metrosCables+", "+cantidadSwiches;
    }
}
