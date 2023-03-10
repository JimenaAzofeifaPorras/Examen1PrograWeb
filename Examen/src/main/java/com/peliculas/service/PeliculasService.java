package com.peliculas.service;

import com.peliculas.entity.Peliculas;
import com.peliculas.repository.PeliculasRepository;
import com.peliculas.service.IPeliculasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeliculasService implements IPeliculasService{

    @Autowired
    private PeliculasRepository peliculasRepository;
    
    public List<Peliculas> getAllPeliculas() {
        return (List<Peliculas>)peliculasRepository.findAll();
    }

    @Override
    public Peliculas getPeliculasById(long codigo_p) {
        return peliculasRepository.findById(codigo_p).orElse(null);
    }

    @Override
    public void savePeliculas(Peliculas peliculas) {
        peliculasRepository.save(peliculas);
    }

    @Override
    public void delete(long id) {
        peliculasRepository.deleteById(id);
    }

    @Override
    public List<Peliculas> getAllPersona() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}