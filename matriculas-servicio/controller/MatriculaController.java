package com.sistema.matriculas.controller;

import com.sistema.matriculas.feign.UsuarioFeignClient;
import com.sistema.matriculas.feign.AsignaturaFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private UsuarioFeignClient usuarioFeignClient;

    @Autowired
    private AsignaturaFeignClient asignaturaFeignClient;

    @PostMapping
    public ResponseEntity<Map<String, Object>> registrarMatricula(@RequestParam Long usuarioId, @RequestParam Long asignaturaId) {
        // Obtener datos del usuario
        Object usuario = usuarioFeignClient.obtenerUsuarioPorId(usuarioId);

        // Obtener datos de la asignatura
        Object asignatura = asignaturaFeignClient.obtenerAsignaturaPorId(asignaturaId);

        // Simular el registro de matrícula
        Map<String, Object> matricula = new HashMap<>();
        matricula.put("usuario", usuario);
        matricula.put("asignatura", asignatura);
        matricula.put("mensaje", "Matrícula registrada exitosamente");

        return ResponseEntity.ok(matricula);
    }
}
