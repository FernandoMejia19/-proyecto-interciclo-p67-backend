package com.prueba.proyectointerciclop67backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Tecnologias")
public class Tecnologia {
    @Id
    @Column (name="tec_id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column (name="tec_nombre")
    private String nombre;
    public Tecnologia (){

    }

    public Tecnologia(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
