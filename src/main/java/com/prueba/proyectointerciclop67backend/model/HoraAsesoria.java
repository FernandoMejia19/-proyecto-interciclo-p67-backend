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
    @ManyToOne
    @JoinColumn  (name= "hora_id_asesoria_fk")
    private Asesoria asesoria;

    public HoraAsesoria(){

    }

    public HoraAsesoria(Integer id, String hora, char reservado, Asesoria asesoria) {
        this.id = id;
        this.hora = hora;
        this.reservado = reservado;
        this.asesoria = asesoria;
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

    public Asesoria getAsesoria() {
        return asesoria;
    }

    public void setAsesoria(Asesoria asesoria) {
        this.asesoria = asesoria;
    }
}
