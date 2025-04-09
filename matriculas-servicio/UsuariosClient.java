@FeignClient(name = "usuarios-servicio")
public interface UsuariosClient {

    @GetMapping("/usuarios/{id}")
    Usuario obtenerUsuarioPorId(@PathVariable("id") Long id);
}
