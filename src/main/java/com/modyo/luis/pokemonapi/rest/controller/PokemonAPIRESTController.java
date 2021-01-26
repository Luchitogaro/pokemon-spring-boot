package com.modyo.luis.pokemonapi.rest.controller;

import com.modyo.luis.pokemonapi.data.Evolution;
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
    public PokemonList getPokemonList(@RequestParam(name = "limit", required = false, defaultValue = "20") String limit, @RequestParam(name = "offset", required = false, defaultValue = "20") String offset) {
        return covidClient.getPokemonList(limit, offset);
    }

    @GetMapping(value = "/pokemon/{name}", produces = "application/json")
    public PokemonDetail getPokemonDetail(@PathVariable("name") String name) {
        return covidClient.getPokemonDetail(name);
    }

    @GetMapping(value = "/evolution-chain/{id}", produces = "application/json")
    public Evolution getPokemonEvolutions(@PathVariable("id") String id) {
        return covidClient.getPokemonEvolutions(id);
    }

    @GetMapping(value = "/pokemon-species/{id}", produces = "application/json")
    public Integer getPokemonSpecieId(@PathVariable("id") String id) {
        return covidClient.getPokemonSpecieId(id);
    }
}
