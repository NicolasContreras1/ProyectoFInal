package com.ProyectoFinalNicolas.ProyectoFinalNicolas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "horas")
public class Hora {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idHoras;
    private int idRequerimiento;
    private int HorasEstimadas;
    private String FechaInicio;
    private String FechaFin;
}
