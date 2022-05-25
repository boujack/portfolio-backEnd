
package com.portfolio.springBoot.controller;

import com.portfolio.springBoot.model.Proyecto;
import com.portfolio.springBoot.service.IProyectoService;
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
public class PyController {
    @Autowired
    private IProyectoService pySvc;
    
    @GetMapping("/proyecto")
    @ResponseBody
    public List<Proyecto> getPy(){
        return pySvc.getProyects();
    }
    
    @GetMapping("/proyecto/{id}")
    @ResponseBody
    public Proyecto getXpById(@PathVariable int id){
        return pySvc.getProyectById(id);
    }
    
    @PostMapping("/new/py")
    public void newXp(@RequestBody Proyecto py){
        pySvc.setProyect(py);
    }
    
    @DeleteMapping("/rm/py")
    public void removeXp(@RequestParam int id){
        pySvc.rmProyect(id);
    }
}
