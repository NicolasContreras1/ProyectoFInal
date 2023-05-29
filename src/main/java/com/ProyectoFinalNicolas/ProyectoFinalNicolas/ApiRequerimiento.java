package com.ProyectoFinalNicolas.ProyectoFinalNicolas;
import java.util.HashMap;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/v1/")
public class ApiRequerimiento{

    @Autowired
    private RequerimientoRepository requerimientoRepository;

    @GetMapping("getRequerimiento")
    public List<Requerimiento> get(){
        return requerimientoRepository.findAll();
    }
    @GetMapping("addRequerimiento")
    public ResponseEntity<HashMap<String, String>> add(){
        HashMap<String,String> resp = new HashMap<>();
        try {
            Requerimiento requerimiento = new Requerimiento();
            requerimiento.setIdHoras(3);
            requerimiento.setIdTipoProyecto(1);
            requerimiento.setNombreRequerimiento("Requerimiento Inicial");
            requerimiento.setEstado("En desarrollo");

            requerimientoRepository.save(requerimiento);

            resp.put("codigo", "200");
            resp.put("mensaje", String.format("Requerimiento ingresado correctamente", requerimiento.getRequerimiento()));
            return ResponseEntity.ok(resp);
        }catch (Exception e){
            resp.put("codigo","500");
            resp.put("mensaje", String.format("Error al crear el requerimiento, mensaje : %s   " +
                    "", e.getMessage()));
            return ResponseEntity.internalServerError().body(resp);
        }
    }
}
