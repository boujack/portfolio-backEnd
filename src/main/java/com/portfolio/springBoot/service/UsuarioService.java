
package com.portfolio.springBoot.service;

import com.portfolio.springBoot.model.Usuario;
import com.portfolio.springBoot.repository.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {
    
    @Autowired
    public UsuarioRepo userRepo;

    @Override
    public Usuario getUserById(int id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public void updateUser(Usuario usr) {
        userRepo.save(usr);
    }
    
    
}
