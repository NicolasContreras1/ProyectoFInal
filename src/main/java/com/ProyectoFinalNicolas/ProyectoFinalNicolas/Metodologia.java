package com.ProyectoFinalNicolas.ProyectoFinalNicolas;

import jakarta.persistence.*;


@Entity
@Table(name = "Metodologia")
public class Metodologia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idMetodologia;
    private String Nombre;

    public Metodologia() {
    }

    public Metodologia(int idMetodologia, String nombre) {
        this.idMetodologia = idMetodologia;
        Nombre = nombre;

    }

    public int getIdMetodologia() {
        return idMetodologia;
    }

    public void setIdMetodologia(int idMetodologia) {
        this.idMetodologia = idMetodologia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) { this.Nombre = nombre; }

}
