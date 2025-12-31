package com.prueba.proyectointerciclop67backend.model;

import jakarta.persistence.*;

@Entity
@Table (name="proyecto_tecnologia")
public class TecnologiaProyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="proytec_id")
    private Integer id;
    @ManyToOne
    @JoinColumn (name = "proytec_proyecto_id")
    private Proyecto proyecto;
    @ManyToOne
    @JoinColumn (name="proytec_tecnologia_id")
    private Tecnologia tecnologia;


    public TecnologiaProyecto(){

    }

    public TecnologiaProyecto(Integer id, Proyecto proyecto, Tecnologia tecnologia) {
        this.id = id;
        this.proyecto = proyecto;
        this.tecnologia = tecnologia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public Tecnologia getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(Tecnologia tecnologia) {
        this.tecnologia = tecnologia;
    }
}
