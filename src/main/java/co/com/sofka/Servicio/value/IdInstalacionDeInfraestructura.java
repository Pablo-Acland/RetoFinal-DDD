package co.com.sofka.Servicio.value;

import co.com.sofka.Taller.value.IdAreas;
import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class IdInstalacionDeInfraestructura extends Identity {
    public IdInstalacionDeInfraestructura() {
        super();
    }

    private IdInstalacionDeInfraestructura(String id) {
        super(id);
    }

    public static IdInstalacionDeInfraestructura of(String id) {
        Objects.requireNonNull(id, "El ID de Instalacion de infraestructura es necesario");
        return new IdInstalacionDeInfraestructura(id);
    }
}
