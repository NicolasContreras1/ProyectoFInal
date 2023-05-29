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
public class ApiHora {

    @Autowired
    private HoraRepository horaRepository;

    @GetMapping("getHora")
    public List<Hora> get(){
        return horaRepository.findAll();
    }
    @GetMapping("addHora")
    public ResponseEntity<HashMap<String, String>> add(){
        HashMap<String,String> resp = new HashMap<>();
        try {
            Hora hora = new Hora();
            hora.setIdHoras(2);
            hora.setIdRequerimiento(5);
            hora.setHorasEstimadas(90);
            hora.setFechaInicio("2022-01-01");
            hora.setFechaFin("2022-01-02");

            horaRepository.save(hora);

            resp.put("codigo", "200");
            resp.put("mensaje", String.format("Horas estimadas han sido creado correctamente", hora.getHorasEstimadas()));
            return ResponseEntity.ok(resp);
        }catch (Exception e){
            resp.put("codigo","500");
            resp.put("mensaje", String.format("Error al crear horas estimadas, mensaje : %s   " +
                    "", e.getMessage()));
            return ResponseEntity.internalServerError().body(resp);
        }
    }
}
