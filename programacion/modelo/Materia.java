package org.javeriana.programacion.modelo;

public class Materia extends Asignatura {
    private String noClase;
    private Integer horaInicio;
    private Integer horaFinal;

    public Materia(String nombre, String id, String noClase, Integer horaInicio, Integer horaFinal) {
        super(nombre, id);
        this.noClase = noClase;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
    }

    public String getNoClase() {
        return noClase;
    }

    public void setNoClase(String noClase) {
        this.noClase = noClase;
    }

    public Integer getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Integer horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Integer getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Integer horaFinal) {
        this.horaFinal = horaFinal;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "noClase='" + noClase + '\'' +
                ", horaInicio=" + horaInicio +
                ", horaFinal=" + horaFinal +
                ", nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
