package com.peliculas.service;

import com.peliculas.entity.Genero;
import com.peliculas.entity.Peliculas;
import com.peliculas.repository.GeneroRepository;
import com.peliculas.service.IGeneroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneroService implements IGeneroService {

    @Autowired
    private GeneroRepository paisRepository;
    
    @Override
    public List<Genero> listCountry() {
        return(List<Genero>)paisRepository.findAll();}  

    @Override
    public List<Genero> getAllPersona() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}