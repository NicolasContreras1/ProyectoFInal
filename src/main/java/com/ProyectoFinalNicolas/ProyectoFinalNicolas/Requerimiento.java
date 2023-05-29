package com.ProyectoFinalNicolas.ProyectoFinalNicolas;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "requerimiento")
public class Requerimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idRequerimiento;
    private int idTipoRequerimiento;
    private String NombreRequerimiento;
    private String Estado;
}
