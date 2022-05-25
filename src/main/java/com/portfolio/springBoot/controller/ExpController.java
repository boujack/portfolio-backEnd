
package com.portfolio.springBoot.controller;

import com.portfolio.springBoot.model.Experiencia;
import com.portfolio.springBoot.service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpController {
    
    @Autowired
    private IExperienciaService xpSvc;
    
    @GetMapping("/experiencia")
    @ResponseBody
    public List<Experiencia> getXP(){
        return xpSvc.getExps();
    }
    
    @GetMapping("/experiencia/{id}")
    @ResponseBody
    public Experiencia getXpById(@PathVariable int id){
        return xpSvc.getExpById(id);
    }
    
    @PostMapping("/new/exp")
    public void newXp(@RequestBody Experiencia xp){
        xpSvc.setExp(xp);
    }
    
    @DeleteMapping("/rm/exp")
    public void removeXp(@RequestParam int id){
        xpSvc.rmExp(id);
    }
    
}
