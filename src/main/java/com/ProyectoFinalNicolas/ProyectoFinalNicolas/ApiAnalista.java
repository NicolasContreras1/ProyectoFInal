package com.ProyectoFinalNicolas.ProyectoFinalNicolas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/Analista/")
public class ApiAnalista {

    @Autowired
    private AnalistaRepository analistaRepository;

    @GetMapping("/get-Analista")
    public List<Analista> get(){
        return analistaRepository.findAll();
    }

    @GetMapping("/add-Analista")
    public ResponseEntity<HashMap<String,String>> add() {
        HashMap<String, String> resp = null;
        try {
            Analista analista = new Analista();
            analista.setNombre("Carlos");
            analista.setApellido_paterno("Milan");
            analista.setApellido_materno("Sailas");
            analista.setFecha_nacimiento("1987-11-25");
            analista.setCorreo("Carlos@gmail.com");
            analista.setCargo("Analista Sennior");

            analistaRepository.save(analista);

            resp = new HashMap<>();
            resp.put("codigo", "200");
            resp.put("mensaje", String.format("Analista %s fue creado correctamente", analista.getNombre()));
            return ResponseEntity.ok(resp);

        } catch (Exception e) {
            resp.put("codigo", "500");
            resp.put("mensaje", String.format("Error al registrar al Analista , mensaje : %s"+
                    "", e.getMessage()));
            return ResponseEntity.internalServerError().body(resp);
        }
    }
}
