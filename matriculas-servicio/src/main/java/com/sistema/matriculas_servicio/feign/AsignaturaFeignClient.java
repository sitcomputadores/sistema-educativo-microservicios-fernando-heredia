package com.sistema.matriculas_servicio.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "asignaturas-servicio", url = "http://localhost:8082")
public interface AsignaturaFeignClient {

    @GetMapping("/asignaturas/{id}")
    Object obtenerAsignaturaPorId(@PathVariable("id") Long id);
}
