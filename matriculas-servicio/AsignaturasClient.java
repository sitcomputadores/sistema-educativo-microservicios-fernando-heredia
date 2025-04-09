@FeignClient(name = "asignaturas-servicio")
public interface AsignaturasClient {

    @GetMapping("/asignaturas/{id}")
    Asignatura obtenerAsignaturaPorId(@PathVariable("id") Long id);
}
