package com.ProyectoFinalNicolas.ProyectoFinalNicolas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class ApiMetodologia {

    @Autowired
    private MetodologiaRepository metodologiaRepository;


    @GetMapping("getMethodological")
    public List<Metodologia> get(){
        return metodologiaRepository.findAll();
    }
    @GetMapping("setMethodological")
    public ResponseEntity<HashMap<String, String>> add(){
        HashMap<String,String> resp = new HashMap<>();
        try {
            Metodologia metodologia = new Metodologia();
            metodologia.setNombre("Tradicional");

            metodologiaRepository.save(metodologia);

            resp.put("codigo", "200");
            resp.put("mensaje", String.format("Horas estimadas han sido creado correctamente", metodologia.getNombre()));
            return ResponseEntity.ok(resp);
        }catch (Exception e){
            resp.put("codigo","500");
            resp.put("mensaje", String.format("Error al crear horas estimadas, mensaje : %s   " +
                    "", e.getMessage()));
            return ResponseEntity.internalServerError().body(resp);
        }
    }
}
