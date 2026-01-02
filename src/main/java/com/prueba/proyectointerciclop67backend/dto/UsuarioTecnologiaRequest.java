package com.prueba.proyectointerciclop67backend.dto;

public class UsuarioTecnologiaRequest {
    private Integer idUsuario;
    private Integer idTecnologia;

    public UsuarioTecnologiaRequest(){}

    public UsuarioTecnologiaRequest(Integer idTecnologia, Integer idUsuario) {
        this.idTecnologia = idTecnologia;
        this.idUsuario = idUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdTecnologia() {
        return idTecnologia;
    }

    public void setIdTecnologia(Integer idTecnologia) {
        this.idTecnologia = idTecnologia;
    }
}
