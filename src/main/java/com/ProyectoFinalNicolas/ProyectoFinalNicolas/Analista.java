package com.ProyectoFinalNicolas.ProyectoFinalNicolas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "analista")
public class Analista {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idAnalista;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String fecha_nacimiento;
    private String correo;
    private String cargo;

}
