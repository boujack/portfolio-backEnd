
package com.portfolio.springBoot.service;

import com.portfolio.springBoot.model.Educacion;
import com.portfolio.springBoot.repository.EducacionRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {
    
    @Autowired
    public EducacionRepo eduRepo;

    @Override
    public List<Educacion> getEdus() {
        return eduRepo.findAll();
    }

    @Override
    public void setEdu(Educacion ed) {
        eduRepo.save(ed);
    }

    @Override
    public void rmEdu(int id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Educacion getEduById(int id) {
        return eduRepo.findById(id).orElse(null);
    }
    
}
