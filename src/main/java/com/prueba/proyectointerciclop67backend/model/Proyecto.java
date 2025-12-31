package com.prueba.proyectointerciclop67backend.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table (name ="proyectos")
public class Proyecto {
    @Id
    @Column (name="proy_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column (name = "proy_titulo")
    private String titulo;
    @Lob
    @Column (name="proy_descripcion")
    private String descripcion;
    @Column (name= "proy_imagen")
    private String imagen;
    @Column (name="proy_link_repo")
    private String linkRepo;
    @ManyToOne
    @JoinColumn(name = "proy_id_programador")
    private Usuario programador;
    @Column (name = "proy_fecha_creacion")
    private LocalDate fecha;
    public Proyecto(){}
    public Proyecto(Integer id, String titulo, String descripcion, String imagen, String linkRepo, Usuario programador, LocalDate fecha) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.linkRepo = linkRepo;
        this.programador = programador;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Usuario getProgramador() {
        return programador;
    }

    public void setProgramador(Usuario programador) {
        this.programador = programador;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
