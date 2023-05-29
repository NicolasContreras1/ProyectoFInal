package com.parcial.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class ApiAnalistaReque {
    @Autowired AnalistaRequeRepository analistaRequeRepository;

    @GetMapping("getanalistarequerimiento")
    public List<AnalistaReque> get(){
        return analistaRequeRepository.findAll();
    }
    @GetMapping("addanalistarequerimiento")
    public ResponseEntity<HashMap<String,String>> add(){
        HashMap<String,String> resp = new HashMap<>();
        try {
            AnalistaReque analistaReque = new AnalistaReque();
            analistaReque.setIdAnalistaReque(3);
            analistaReque.setIdAnalista(2);
            analistaReque.setIdRequerimiento(1);
            analistaReque.setEstado("In Progress");

            analistaRequeRepository.save(analistaReque);

            resp.put("codigo", "200");
            resp.put("mensaje", String.format("Analista requerimiento ha sido ingresado correctamente", analistaReque.getIdAnalistaReque()));
            return ResponseEntity.ok(resp);
        } catch (Exception e){
            resp.put("codigo", "500");
            resp.put("mensaje", String.format("Error al ingresar el analista requerimiento, mensaje : %s " + "",e.getMessage()));
            return ResponseEntity.internalServerError().body(resp);
        }
    }
}
