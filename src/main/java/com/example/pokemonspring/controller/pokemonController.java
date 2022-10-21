package com.example.pokemonspring.controller;

import com.example.pokemonspring.model.PokemonCard;
import com.example.pokemonspring.service.pokemonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class pokemonController {

    pokemonService ps = new pokemonService();


    @GetMapping("/")
    public List<PokemonCard> getAllpokemonCards() {
        return ps.getAllpokemonCards();

    }
}
