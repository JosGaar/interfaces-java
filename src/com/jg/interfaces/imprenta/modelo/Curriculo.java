package com.jg.interfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja implements Imprimible {

    private Persona persona;
    private String carrera;
    private List<String> experiencias;

    public Curriculo(String contenido, Persona persona, String carrera) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public Curriculo addExperiencia(String experiencia) {
        this.experiencias.add(experiencia);

        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(this.persona)
                .append("\n")
                .append("Resumen: ").append(this.contenido)
                .append("\n")
                .append("Profesion: ").append(this.carrera)
                .append("\n")
                .append("Experiencias: ");
        for(String exp : this.experiencias) {
            sb.append("- ").append(exp).append("\n");
        }
        return sb.toString();
    }
}
