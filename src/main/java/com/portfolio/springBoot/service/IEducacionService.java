
package com.portfolio.springBoot.service;

import com.portfolio.springBoot.model.Educacion;
import java.util.List;

public interface IEducacionService {
    public List<Educacion>getEdus();
    public void setEdu(Educacion user);
    public void rmEdu(int id);
    public Educacion getEduById(int id);
}
