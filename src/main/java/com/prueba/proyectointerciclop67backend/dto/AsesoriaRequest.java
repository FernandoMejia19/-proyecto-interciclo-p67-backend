package com.prueba.proyectointerciclop67backend.dto;

import java.time.LocalDate;

public class AsesoriaRequest {
    private LocalDate fecha;
    private Integer programadorId;
    public AsesoriaRequest(){ }

    public AsesoriaRequest(LocalDate fecha, Integer programadorId) {
        this.fecha = fecha;
        this.programadorId = programadorId;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Integer getProgramadorId() {
        return programadorId;
    }

    public void setProgramadorId(Integer programadorId) {
        this.programadorId = programadorId;
    }
}
