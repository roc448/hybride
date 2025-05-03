package com.exemple.bibliotheque.controller;

import com.exemple.bibliotheque.model.Livre;
import com.exemple.bibliotheque.repository.LivreRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  
@RequestMapping("/livres") 
public class LivreController {

    private final LivreRepository livreRepository;

   
    public LivreController(LivreRepository livreRepository) {
        this.livreRepository = livreRepository;
    }

   
    @GetMapping
    public List<Livre> getAllLivres() {
        return livreRepository.findAll(); 
    }

    
    @GetMapping("/{id}")
    public Livre getLivreById(@PathVariable Long id) {
        return livreRepository.findById(id).orElse(null);  
    }

    
    @GetMapping("/disponibles")
    public List<Livre> getLivresDisponibles() {
        return livreRepository.findByDisponibleTrue();  
    }
}
