package com.sistema.matriculas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.matriculas.servicio.feign.UsuariosClient;
import com.matriculas.servicio.feign.AsignaturasClient;
import com.matriculas.servicio.modelos.Usuario;
import com.matriculas.servicio.modelos.Asignatura;
import com.matriculas.servicio.modelos.MatriculaDTO;

import java.time.LocalDate;

@Service
public class MatriculaService {

    @Autowired
    private UsuariosClient usuariosClient;

    @Autowired
    private AsignaturasClient asignaturasClient;

    public MatriculaDTO registrarMatricula(Long usuarioId, Long asignaturaId) {
        // Obtener los datos del usuario y de la asignatura
        Usuario usuario = usuariosClient.obtenerUsuarioPorId(usuarioId);
        Asignatura asignatura = asignaturasClient.obtenerAsignaturaPorId(asignaturaId);

        // Crear una matrícula de prueba
        MatriculaDTO dto = new MatriculaDTO();
        dto.setNombreUsuario(usuario.getNombre());
        dto.setNombreAsignatura(asignatura.getNombre());
        dto.setFecha(LocalDate.now());

        return dto;
    }
}
