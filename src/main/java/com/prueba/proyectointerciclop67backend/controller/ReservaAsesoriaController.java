package com.prueba.proyectointerciclop67backend.controller;

import com.prueba.proyectointerciclop67backend.exception.ResourceNotFoundException;
import com.prueba.proyectointerciclop67backend.model.ReservaAsesoria;
import com.prueba.proyectointerciclop67backend.repository.AsesoriaRepository;
import com.prueba.proyectointerciclop67backend.repository.HoraAsesoriaRepository;
import com.prueba.proyectointerciclop67backend.repository.ReservaAsesoriaRepository;
import com.prueba.proyectointerciclop67backend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reservas")
public class ReservaAsesoriaController {
    @Autowired
    private ReservaAsesoriaRepository reservaAsesoriaRepository;
    @Autowired
    private AsesoriaRepository asesoriaRepository;
    @Autowired
    private HoraAsesoriaRepository horaAsesoriaRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<ReservaAsesoria> getAll (){
        return reservaAsesoriaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReservaAsesoria> crearReserva(@PathVariable Integer id){
        ReservaAsesoria reserva=reservaAsesoriaRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("No se encontro la asesoria con id: "+id));
        return ResponseEntity.ok(reserva);
    }
}
