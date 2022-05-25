
package com.portfolio.springBoot.service;

import com.portfolio.springBoot.model.Habilidad;
import java.util.List;

public interface IHabilidadService {
    public List<Habilidad>getSkills();
    public void setSkill(Habilidad sk);
    public void rmSkill(int id);
    public Habilidad getSkillById(int id);
    public void setSkills(List<Habilidad> sk);
}
