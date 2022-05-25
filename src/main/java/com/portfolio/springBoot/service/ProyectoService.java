
package com.portfolio.springBoot.service;

import com.portfolio.springBoot.model.Proyecto;
import com.portfolio.springBoot.repository.ProyectoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{
    
    @Autowired
    public ProyectoRepo proyectRepo;

    @Override
    public List<Proyecto> getProyects() {
        return proyectRepo.findAll();
    }

    @Override
    public void setProyect(Proyecto py) {
        proyectRepo.save(py);
    }

    @Override
    public void rmProyect(int id) {
        proyectRepo.deleteById(id);
    }

    @Override
    public Proyecto getProyectById(int id) {
        return proyectRepo.findById(id).orElse(null);
    }
    
}
