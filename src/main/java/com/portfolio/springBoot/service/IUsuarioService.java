
package com.portfolio.springBoot.service;

import com.portfolio.springBoot.model.Usuario;

public interface IUsuarioService {
    public Usuario getUserById(int id);
    public void updateUser(Usuario usr);
}
