package com.peliculas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="genero")
public class Genero implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long codigo_g;
    private String nombre;
    private String descripcion;

    
    @ManyToOne
    @JoinColumn(name="paises_id")

    public long getCodigo_g() {
        return codigo_g;
    }

    public void setCodigo_g(long codigo_g) {
        this.codigo_g = codigo_g;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
