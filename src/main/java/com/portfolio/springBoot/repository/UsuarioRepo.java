
package com.portfolio.springBoot.repository;

import com.portfolio.springBoot.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepo extends JpaRepository <Usuario, Integer>{
    
}
