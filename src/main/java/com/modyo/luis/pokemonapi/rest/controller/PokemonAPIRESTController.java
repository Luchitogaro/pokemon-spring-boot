package com.modyo.luis.pokemonapi.rest.controller;

import com.modyo.luis.pokemonapi.data.PokemonDetail;
import com.modyo.luis.pokemonapi.data.PokemonList;
import com.modyo.luis.pokemonapi.rest.client.PokeAPIRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST})
public class PokemonAPIRESTController {

    @Autowired
    PokeAPIRestClient covidClient;

    @GetMapping(value = "/pokemon", produces = "application/json")
    public PokemonList getPokemonList() {
        return covidClient.getPokemonList();
    }

    @GetMapping(value = "/pokemon/{name}", produces = "application/json")
    public PokemonDetail getPokemonDetail(@PathVariable("name") String name) {
        return covidClient.getPokemonDetail(name);
    }
}
