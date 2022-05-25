package com.portfolio.springBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    private String nombre;
    private String descripcion;
    private String inicio;
    private String fin;
    private String logo;

    public Proyecto() {
    }

    public Proyecto(int id, String nombre, String descripcion, String inicio, String fin, String logo) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.inicio = inicio;
        this.fin = fin;
        this.logo = logo;
    }
    
    
}
