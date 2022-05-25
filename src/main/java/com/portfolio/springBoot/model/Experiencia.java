package com.portfolio.springBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {

    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    private String empresa;
    private String puesto;
    private String ingreso;
    private String egreso;
    private String tipo;
    private String logo;
    
    public Experiencia() {
    }

    public Experiencia(int id, String empresa, String puesto, String ingreso, String egreso, String tipo, String logo) {
        this.id = id;
        this.empresa = empresa;
        this.puesto = puesto;
        this.ingreso = ingreso;
        this.egreso = egreso;
        this.tipo = tipo;
        this.logo = logo;
    }


    
}
