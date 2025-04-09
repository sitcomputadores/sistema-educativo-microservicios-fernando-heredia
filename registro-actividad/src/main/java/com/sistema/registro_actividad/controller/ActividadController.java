import com.sistema.registro_actividad.model.Actividad;
import com.sistema.registro_actividad.repository.ActividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actividades")
public class ActividadController {

    @Autowired
    private ActividadRepository actividadRepository;

    @PostMapping
    public ResponseEntity<Actividad> registrarActividad(@RequestBody Actividad actividad) {
        Actividad nuevaActividad = actividadRepository.save(actividad);
        return ResponseEntity.ok(nuevaActividad);
    }

    @GetMapping
    public ResponseEntity<List<Actividad>> listarActividades() {
        List<Actividad> actividades = actividadRepository.findAll();
        return ResponseEntity.ok(actividades);
    }
}
