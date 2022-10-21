package com.example.pokemonspring.controller;

import com.example.pokemonspring.service.pokemonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;


@Controller
public class homeController {

    private pokemonService ps = new pokemonService();

    @GetMapping("/create")
    public String index() {
        return "index";
    }


    /*
    // Sender ud til databasen?
    @PostMapping("/create")
    public String create(WebRequest req) {

        ps.create(req);

        System.out.println(req.getParameter("name"));
        System.out.println(req.getParameter("primary_type"));

        return "redirect:/";
    }
     */

    @GetMapping("/getsome")
    public String index2(Model model){

        model.addAttribute("pokemonCards", ps.getAllpokemonCards());
        //Svarer til List pokemonCards = ps.getAllpokemonCards()defence


        return "idex2";
    }


    @GetMapping("/req")
    public String oneCard( @RequestParamint req, Model model){

        req.addAttribute("index",)
        return "index3";
    }
}
