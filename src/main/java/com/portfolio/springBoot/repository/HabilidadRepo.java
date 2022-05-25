
package com.portfolio.springBoot.repository;

import com.portfolio.springBoot.model.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadRepo  extends JpaRepository <Habilidad, Integer>{
    
}
