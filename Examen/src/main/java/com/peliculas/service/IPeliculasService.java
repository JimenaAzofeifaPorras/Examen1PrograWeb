package com.peliculas.service;

import com.peliculas.entity.Peliculas;
import java.util.List;

public interface IPeliculasService {
    public List<Peliculas> getAllPersona();
    public Peliculas getPeliculasById (long id);
    public void savePeliculas(Peliculas peliculas);
    public void delete (long id);
}
