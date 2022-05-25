
package com.portfolio.springBoot.controller;

import com.portfolio.springBoot.model.Educacion;
import com.portfolio.springBoot.service.IEducacionService;
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
public class EdController {
    
    @Autowired
    private IEducacionService edSvc;
    
    @GetMapping("/educacion")
    @ResponseBody
    public List<Educacion> getEd(){
        return edSvc.getEdus();
    }
    
    @GetMapping("/educacion/{id}")
    @ResponseBody
    public Educacion getEdById(@PathVariable int id){
        return edSvc.getEduById(id);
    }
    
    @PostMapping("/new/edu")
    public void newEd(@RequestBody Educacion ed){
        edSvc.setEdu(ed);
    }
    
    @DeleteMapping("/rm/edu")
    public void removeEd(@RequestParam int id){
        edSvc.rmEdu(id);
    }
    
}
