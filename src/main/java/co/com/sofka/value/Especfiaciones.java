package co.com.sofka.value;

import co.com.sofka.domain.generic.ValueObject;

public class Especfiaciones implements ValueObject<String> {
    private final String grafica;
    private final String cables;
    private final String ram;
    private final String puertos;
    private final String procesador;
    private final String memoria;

    public Especfiaciones(String grafica, String cables, String ram, String puertos, String procesador, String memoria) {
        this.grafica = grafica;
        this.cables = cables;
        this.ram = ram;
        this.puertos = puertos;
        this.procesador = procesador;
        this.memoria = memoria;
    }


    @Override
    public String value() {
        return "Especificaciones "+grafica+", "+cables+", "+ram+", "+puertos+", "+procesador+", "+memoria;
    }
}
