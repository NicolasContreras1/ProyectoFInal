package com.ProyectoFinalNicolas.ProyectoFinalNicolas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoraRepository extends JpaRepository<Hora, Integer> {

}
