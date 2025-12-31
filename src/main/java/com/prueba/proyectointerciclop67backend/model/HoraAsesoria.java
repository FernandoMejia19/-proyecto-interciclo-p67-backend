package com.prueba.proyectointerciclop67backend.model;

import jakarta.persistence.*;

@Entity
@Table (name="horas_asesorias")
public class HoraAsesoria {
    @Id
    @Column (name = "hora_id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column (name = "hora_hora")
    private String hora;
    @Column (name="hora_reservado")
    private char reservado;
    @Column (name= "hora_id_asesoria_fk")
    private Integer idAsesoria;

    public HoraAsesoria(){

    }

    public HoraAsesoria( String hora, char reservado, Integer idAsesoria) {
        this.hora = hora;
        this.reservado = reservado;
        this.idAsesoria = idAsesoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
