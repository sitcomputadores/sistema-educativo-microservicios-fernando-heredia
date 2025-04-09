package com.sistema.matriculas.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "usuarios-servicio", url = "http://localhost:8080")
public interface UsuarioFeignClient {

    @GetMapping("/usuarios/{id}")
    Object obtenerUsuarioPorId(@PathVariable("id") Long id);
}
