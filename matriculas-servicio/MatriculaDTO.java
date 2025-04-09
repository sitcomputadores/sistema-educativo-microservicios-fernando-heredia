package com.matriculas.servicio.modelos;

import java.time.LocalDate;

public class MatriculaDTO {
    private String nombreUsuario;
    private String nombreAsignatura;
    private LocalDate fecha;

    // Getters y Setters
    public String getNombreUsuario() { return nombreUsuario; }
    public void setNombreUsuario(String nombreUsuario) { this.nombreUsuario = nombreUsuario; }

    public String getNombreAsignatura() { return nombreAsignatura; }
    public void setNombreAsignatura(String nombreAsignatura) { this.nombreAsignatura = nombreAsignatura; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
}
