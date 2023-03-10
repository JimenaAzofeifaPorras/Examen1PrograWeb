package com.peliculas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "peliculas")
public class Peliculas implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo_p; 
    private String titulo;
    private int ear_estreno;
    private int codigo_g;

    public int getCodigo_p() {
        return codigo_p;
    }

    public void setCodigo_p(int codigo_p) {
        this.codigo_p = codigo_p;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEar_estreno() {
        return ear_estreno;
    }

    public void setEar_estreno(int ear_estreno) {
        this.ear_estreno = ear_estreno;
    }

    public int getCodigo_g() {
        return codigo_g;
    }

    public void setCodigo_g(int codigo_g) {
        this.codigo_g = codigo_g;
    }

}
