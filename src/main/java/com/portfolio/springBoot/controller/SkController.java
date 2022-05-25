
package com.portfolio.springBoot.controller;

import com.portfolio.springBoot.model.Habilidad;
import com.portfolio.springBoot.service.IHabilidadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkController {
    @Autowired
    private IHabilidadService skSvc;
    
    @GetMapping("/skill")
    @ResponseBody
    public List<Habilidad> getSk(){
        return skSvc.getSkills();
    }
    
    @GetMapping("/skill/{id}")
    @ResponseBody
    public Habilidad getSkById(@PathVariable int id){
        return skSvc.getSkillById(id);
    }
    
    @PostMapping("/new/sk")
    public void newSk(@RequestBody Habilidad sk){
        skSvc.setSkill(sk);
    }
    
    @PostMapping("/new/skAll")
    public void newSkills(@RequestBody List<Habilidad> sk){
        skSvc.setSkills(sk);
    }    
    
    @DeleteMapping("/rm/sk")
    public void removeSk(@RequestParam int id){
        skSvc.rmSkill(id);
    }
}
