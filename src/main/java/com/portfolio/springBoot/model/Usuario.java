
package com.portfolio.springBoot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    @Column(unique=true)
    private String username;
    private String password;
    private String nombre;
    private String apellido;
    private String descripcion;
    private String urlPerfil;
    private String urlBanner;
    private String fechaNac;

    public Usuario() {
    }

    public Usuario(int id, String nombre, String apellido, String descripcion, String urlPerfil, String urlBanner, String fechaNac) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.urlPerfil = urlPerfil;
        this.urlBanner = urlBanner;
        this.fechaNac = fechaNac;
    }

    
}
