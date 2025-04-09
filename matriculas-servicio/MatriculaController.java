package com.sistema.matriculas.controller;

import com.matriculas.servicio.servicios.MatriculaService;
import com.matriculas.servicio.modelos.MatriculaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

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

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MatriculaControllerIntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testRegistrarMatricula() {
        ResponseEntity<String> response = restTemplate.postForEntity(
                "/matriculas?usuarioId=1&asignaturaId=2", null, String.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).contains("Matrícula registrada exitosamente");
    }
}
