package com.modyo.luis.pokemonapi.rest.client;

import com.modyo.luis.pokemonapi.data.PokemonDetail;
import com.modyo.luis.pokemonapi.data.PokemonList;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;

@Component
public class PokeAPIRestClient {

    @Value("${pokeapi.pokemon.base}")
    String pokemonURL;

    RestTemplate restTemplate;

    public PokeAPIRestClient(RestTemplateBuilder restTemplateBuilder) {
        restTemplate = restTemplateBuilder.build();
    }

    public PokemonList getPokemonList() {
        PokemonList pokemonList = null;
        try {
            URI uri;
            uri = new URI(pokemonURL);
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
            HttpEntity<String> request = new HttpEntity<String>(headers);
            ResponseEntity<PokemonList> pokemonListEntity = restTemplate.exchange(uri, HttpMethod.GET, request,
                    PokemonList.class);
            pokemonList = pokemonListEntity.getBody();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return pokemonList;
    }

    public PokemonDetail getPokemonDetail(String pokemonName) {
        PokemonDetail pokemonDetail = null;
        try {
            URI uri;
            uri = new URI(pokemonURL+"/"+pokemonName);
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
            HttpEntity<String> request = new HttpEntity<String>(headers);
            ResponseEntity<PokemonDetail> pokemonListEntity = restTemplate.exchange(uri, HttpMethod.GET, request,
                    PokemonDetail.class);
            pokemonDetail = pokemonListEntity.getBody();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return pokemonDetail;
    }
}

