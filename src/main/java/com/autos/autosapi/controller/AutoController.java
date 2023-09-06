package com.autos.autosapi.controller;


import com.autos.autosapi.dto.*;
import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auto")
public class AutoController {
    @Autowired
    private AutoRepository autoRepository;

    @PostMapping
    public void registrarAuto(@RequestBody @Valid DTOautos data){
        autoRepository.save(new Autos(data));
    };

    @GetMapping
    public Page<ListarAutos> listarAuto(@PageableDefault(size = 5) Pageable paginacion){
            return autoRepository.findAll(paginacion).map(ListarAutos::new);
    }

    @PutMapping
    @Transactional
    public void modificarAuto(@RequestBody @Valid ModificarAutos modificarAutos){
        Autos auto = autoRepository.getReferenceById(modificarAutos.id());
        auto.actualizarDatos(modificarAutos);

    }

    @DeleteMapping("/{id}")
    @Transactional
    public void elimatAuto(@PathVariable Long id){
        Autos autos =autoRepository.getReferenceById(id);
        autoRepository.delete(autos);
    }
}
