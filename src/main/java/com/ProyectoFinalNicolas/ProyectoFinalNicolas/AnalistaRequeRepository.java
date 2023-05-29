package com.parcial.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnalistaRequeRepository extends JpaRepository<AnalistaReque,Integer> {
}
