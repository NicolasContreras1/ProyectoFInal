package com.ProyectoFinalNicolas.ProyectoFinalNicolas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tipo_proyecto")

public class TipodeProyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idTipoProyecto;
    private int idMetodologia;
    private String NombreTipoProyecto;
}