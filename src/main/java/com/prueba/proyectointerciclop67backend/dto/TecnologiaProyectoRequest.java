package com.prueba.proyectointerciclop67backend.dto;

public class TecnologiaProyectoRequest {
    private Integer idProyecto;
    private Integer idTecnologia;

    public TecnologiaProyectoRequest(){}

    public TecnologiaProyectoRequest(Integer idTecnologia, Integer idProyecto) {
        this.idTecnologia = idTecnologia;
        this.idProyecto = idProyecto;
    }

    public Integer getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public Integer getIdTecnologia() {
        return idTecnologia;
    }

    public void setIdTecnologia(Integer idTecnologia) {
        this.idTecnologia = idTecnologia;
    }
}
