package com.example.pokemonspring.service;

import com.example.pokemonspring.model.PokemonCard;
import com.example.pokemonspring.repository.pokemoncardRepository;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

public class pokemonService {

    pokemoncardRepository pr = new pokemoncardRepository();

    public List<PokemonCard> getAllpokemonCards() {
        return pr.getAllpokemonCards();
    }

    public void create(WebRequest req) {

        PokemonCard pc = new PokemonCard(Integer.parseInt(req.getParameter("id")),
                req.getParameter("name"),
                req.getParameter("primary_type"));

        pr.create(pc);
    }

}

