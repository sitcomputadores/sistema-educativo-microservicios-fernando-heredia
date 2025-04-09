package com.sistema.matriculas.controller;

import com.matriculas.servicio.servicios.MatriculaService;
import com.matriculas.servicio.modelos.MatriculaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaService matriculaService;

    @PostMapping("/registrar")
    public MatriculaDTO registrar(@RequestParam Long usuarioId, @RequestParam Long asignaturaId) {
        return matriculaService.registrarMatricula(usuarioId, asignaturaId);
    }
}
