
package com.portfolio.springBoot.repository;

import com.portfolio.springBoot.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepo extends JpaRepository <Proyecto, Integer>{
    
}
