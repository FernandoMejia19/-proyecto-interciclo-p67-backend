package com.prueba.proyectointerciclop67backend.controller;

import com.prueba.proyectointerciclop67backend.dto.AsesoriaRequest;
import com.prueba.proyectointerciclop67backend.exception.ResourceNotFoundException;
import com.prueba.proyectointerciclop67backend.model.Asesoria;
import com.prueba.proyectointerciclop67backend.model.Usuario;
import com.prueba.proyectointerciclop67backend.repository.AsesoriaRepository;
import com.prueba.proyectointerciclop67backend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/asesorias")
public class AsesoriaController {
    @Autowired
    private AsesoriaRepository asesoriaRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @GetMapping
    public List<Asesoria> getAll(){
        return asesoriaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Asesoria> getById(@PathVariable Integer id){
        Asesoria a=asesoriaRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("No existe la asesoria con id: " + id));
        return ResponseEntity.ok(a);
    }
    @PostMapping
    public ResponseEntity<Asesoria> crearAsesoria(@RequestBody AsesoriaRequest request){
        Usuario programador=usuarioRepository.findById(request.getProgramadorId()).orElseThrow(()->new ResourceNotFoundException("No existe el usuario "));
        Asesoria a = new Asesoria();
        a.setFecha(request.getFecha());
        a.setProgramador(programador);
        Asesoria guardarAsesoria= asesoriaRepository.save(a);
        return ResponseEntity.ok(guardarAsesoria);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Asesoria> eliminar(@PathVariable Integer id){
        if(!asesoriaRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        asesoriaRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Asesoria> actualizarAsesoria(@PathVariable Integer id,@RequestBody AsesoriaRequest request){
        Asesoria datosAsesoria=asesoriaRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("No existe la asesoria "));
        if(request.getProgramadorId()!=null){
            Usuario programador=usuarioRepository.findById(request.getProgramadorId()).orElseThrow(()->new ResourceNotFoundException("no existe el usuario"));
            datosAsesoria.setProgramador(programador);
        }
        if(request.getFecha() !=null){
            datosAsesoria.setFecha(request.getFecha());
        }
        Asesoria asesoriaActualizada=asesoriaRepository.save(datosAsesoria);
        return ResponseEntity.ok(asesoriaActualizada);
    }
}
