package com.peliculas.repository;
import com.peliculas.entity.Peliculas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculasRepository extends CrudRepository<Peliculas,Long>{

    
}
