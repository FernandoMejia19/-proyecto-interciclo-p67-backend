package com.prueba.proyectointerciclop67backend.dto;

public class HoraAsesoriaRequest {
    private String hora;
    private char reservado='N';
    private Integer idAsesoria;

    public HoraAsesoriaRequest(){}

    public HoraAsesoriaRequest(String hora, char reservado, Integer idAsesoria) {
        this.hora = hora;
        this.reservado = reservado;
        this.idAsesoria = idAsesoria;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public char getReservado() {
        return reservado;
    }

    public void setReservado(char reservado) {
        this.reservado = reservado;
    }

    public Integer getIdAsesoria() {
        return idAsesoria;
    }

    public void setIdAsesoria(Integer idAsesoria) {
        this.idAsesoria = idAsesoria;
    }
}
