package org.javeriana.programacion.modelo;

import java.util.ArrayList;
import java.util.List;

public class Horario {
    public List<Asignatura> asignaturas;

    public Horario() {
        this.asignaturas = new ArrayList<>();
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
}
