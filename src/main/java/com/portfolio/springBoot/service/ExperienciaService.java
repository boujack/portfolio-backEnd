
package com.portfolio.springBoot.service;

import com.portfolio.springBoot.model.Experiencia;
import com.portfolio.springBoot.repository.ExperienciaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{
    
    @Autowired
    public ExperienciaRepo expRepo;

    @Override
    public List<Experiencia> getExps() {
        return expRepo.findAll();
    }

    @Override
    public void setExp(Experiencia xp) {
        expRepo.save(xp);
    }

    @Override
    public void rmExp(int id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experiencia getExpById(int id) {
        return expRepo.findById(id).orElse(null);
    }
    
}
