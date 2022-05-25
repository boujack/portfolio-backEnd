
package com.portfolio.springBoot.service;

import com.portfolio.springBoot.model.Proyecto;
import java.util.List;

public interface IProyectoService {
    public List<Proyecto>getProyects();
    public void setProyect(Proyecto user);
    public void rmProyect(int id);
    public Proyecto getProyectById(int id);
}
