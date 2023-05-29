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
public class ApiTipodeProyecto {

    @Autowired
    private TipodeProyectoRepository tipodeProyectoRepository;

    @GetMapping("get-tipoproyecto")
    public List<TipodeProyecto> get() {
        return tipodeProyectoRepository.findAll();
    }

    @GetMapping("add-tipoproyecto")
    public ResponseEntity<HashMap<String,String>> add() {
        HashMap<String,String> resp = new HashMap<>();
        try {
            TipodeProyecto tipodeProyecto = new TipodeProyecto();
            tipodeProyecto.setIdTipoProyecto(2);
            tipodeProyecto.setIdMetodologia(2);
            tipodeProyecto.setNombreTipoProyecto("Incidencia");

            tipodeProyectoRepository.save(tipodeProyecto);

            resp.put("codigo","200");
            resp.put("mensaje",String.format("Tipo de proyecto ha sido creado correctamente",tipodeProyecto.getNombreTipoProyecto()));
            return ResponseEntity.ok(resp);

        } catch (Exception e) {
            resp.put("codigo","500");
            resp.put("mensaje",String.format("Error al registrar tipo de proyecto, mensaje : %s " +
                    "", e.getMessage()));
            return ResponseEntity.internalServerError().body(resp);
        }
    }
}
