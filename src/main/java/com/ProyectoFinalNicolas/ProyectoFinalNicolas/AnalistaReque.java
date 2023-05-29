package com.parcial.demo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "analista_requerimiento")
public class AnalistaReque {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idAnalistaReque;
    private int idAnalista;
    private int idRequerimiento;
    private String Estado;

}
