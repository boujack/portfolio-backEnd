
package com.portfolio.springBoot.controller;

import com.portfolio.springBoot.model.Usuario;
import com.portfolio.springBoot.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @Autowired
    private IUsuarioService usrSvc;
    
    @GetMapping("/user")
    @ResponseBody
    public Usuario getUser(){
        return usrSvc.getUserById(1);
    }
    
    @PostMapping("/user")
    public void setUser(@RequestBody Usuario usr){
        usrSvc.updateUser(usr);
    }
}
