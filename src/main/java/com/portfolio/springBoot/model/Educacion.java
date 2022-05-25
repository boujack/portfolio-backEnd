
package com.portfolio.springBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    private String instituto;
    private String titulo;
    private String ingreso;
    private String egreso;
    private String nivel;
    private String logo;

    public Educacion() {
    }

    public Educacion(int id, String instituto, String titulo, String ingreso, String egreso, String nivel, String logo) {
        this.id = id;
        this.instituto = instituto;
        this.titulo = titulo;
        this.ingreso = ingreso;
        this.egreso = egreso;
        this.nivel = nivel;
        this.logo = logo;
    }

    
    
}
