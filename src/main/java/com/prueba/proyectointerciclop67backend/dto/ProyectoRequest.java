package com.prueba.proyectointerciclop67backend.dto;

import java.time.LocalDate;

public class ProyectoRequest {
    private String titulo;
    private String descripcion;
    private String imagen;
    private String linkRepo;
    private Integer idProgramador;
    private LocalDate fecha;
    public ProyectoRequest(){}

    public ProyectoRequest(String titulo, String descripcion, String imagen, String linkRepo, Integer idProgramador, LocalDate fecha) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.linkRepo = linkRepo;
        this.idProgramador = idProgramador;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getLinkRepo() {
        return linkRepo;
    }

    public void setLinkRepo(String linkRepo) {
        this.linkRepo = linkRepo;
    }

    public Integer getIdProgramador() {
        return idProgramador;
    }

    public void setIdProgramador(Integer idProgramador) {
        this.idProgramador = idProgramador;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
