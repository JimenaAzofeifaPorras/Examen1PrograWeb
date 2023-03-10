package com.peliculas.repository;
import com.peliculas.entity.Genero;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends CrudRepository<Genero,Long>{
    
}
