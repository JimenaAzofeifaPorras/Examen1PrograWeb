package com.peliculas.controller;

import com.peliculas.entity.Genero;
import com.peliculas.entity.Peliculas;
import com.peliculas.service.IGeneroService;
import com.peliculas.service.IPeliculasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PeliculasController {

    @Autowired
    private IPeliculasService personaService;

    @Autowired
    private IGeneroService paisService;
    
    @GetMapping("/peliculas")
    public String index(Model model) {
        List<Peliculas> listaPersona = personaService.getAllPersona();
        model.addAttribute("titulo","Tabla Peliculas");
        model.addAttribute("peliculas", listaPersona);
        return "peliculas";
        
    }
    
    @GetMapping("/peliculasN")
    public String crearPeliculas(Model model) {
        List<Genero> listaGenero = generoService.listCountry();
      model.addAttribute("peliculas", new Peliculas());
      model.addAttribute("genero", listaGenero);
      return "crear";
    
}
    
    @PostMapping("/save")
    public String guardarPersona(@ModelAttribute Peliculas peliculas){
        personaService.savePeliculas(peliculas);
        return"redirect:/peliculas";
    }
    @GetMapping("/editPeliculas/{id}")
    public String editPersona(@PathVariable("id")Long idPeliculas, Model model){
        Peliculas peliculas = personaService.getPeliculasById(idPeliculas);
        List<Genero> listaPaises = paisService.listCountry();
        model.addAttribute("peliculas", peliculas);
        model.addAttribute("genero", listaPaises);
        return "crear";
    }

}
