package com.ProyectoFinalNicolas.ProyectoFinalNicolas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipodeProyectoRepository extends JpaRepository<TipodeProyecto,Long> {
}
