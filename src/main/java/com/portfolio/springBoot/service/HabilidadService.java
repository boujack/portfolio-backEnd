
package com.portfolio.springBoot.service;

import com.portfolio.springBoot.model.Habilidad;
import com.portfolio.springBoot.repository.HabilidadRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements IHabilidadService {
    
    @Autowired
    public HabilidadRepo skillRepo;

    @Override
    public List<Habilidad> getSkills() {
        return skillRepo.findAll();
    }

    @Override
    public void setSkill(Habilidad sk) {
        skillRepo.save(sk);
    }

    @Override
    public void rmSkill(int id) {
        skillRepo.deleteById(id);
    }

    @Override
    public Habilidad getSkillById(int id) {
        return skillRepo.findById(id).orElse(null);
    }

    @Override
    public void setSkills(List<Habilidad> sk) {
       skillRepo.saveAll(sk);
     }
    
}
