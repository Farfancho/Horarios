package org.javeriana.programacion.modelo;

public class Asignatura {
    protected String nombre;
    protected String id;

    public Asignatura(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                '}';
    }


}
