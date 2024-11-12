package com.dev.frases.repository;

import com.dev.frases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FraseRepository extends JpaRepository<Frase, Long> {
    @Query(value = "SELECT COUNT(*) FROM frases", nativeQuery = true)
    Long idAletorio();
}
