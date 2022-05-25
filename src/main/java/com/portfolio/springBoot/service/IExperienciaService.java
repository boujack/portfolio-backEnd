
package com.portfolio.springBoot.service;

import com.portfolio.springBoot.model.Experiencia;
import java.util.List;

public interface IExperienciaService {
    public List<Experiencia>getExps();
    public void setExp(Experiencia user);
    public void rmExp(int id);
    public Experiencia getExpById(int id);
}
