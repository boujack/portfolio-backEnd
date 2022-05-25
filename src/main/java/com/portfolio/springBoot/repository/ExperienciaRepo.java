
package com.portfolio.springBoot.repository;

import com.portfolio.springBoot.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepo extends JpaRepository <Experiencia, Integer>{
    
}
