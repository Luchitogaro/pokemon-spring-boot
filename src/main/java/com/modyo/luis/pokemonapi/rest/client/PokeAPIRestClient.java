package com.modyo.luis.pokemonapi.rest.client;

import com.modyo.luis.pokemonapi.data.Evolution;
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

    /**
     * Get Pokemon list by default 20 Pokemon at list
     * @param limit Limit of resources
     * @param offset Quantity of elements
     * @return @type{PokemonList} Of resources
     */
    public PokemonList getPokemonList(String limit, String offset) {
        PokemonList pokemonList = null;
        try {
            URI uri;
            uri = new URI(pokemonURL+"/pokemon?"+"limit"+limit+"&offset"+offset);
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

    /**
     * Get pokemon details from PokeAPI
     * @param pokemonName Name of Pokemon
     * @return Details of @type{PokemonDetail}
     */
    public PokemonDetail getPokemonDetail(String pokemonName) {
        PokemonDetail pokemonDetail = null;
        try {
            URI uri;
            uri = new URI(pokemonURL+"/pokemon/"+pokemonName);
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

    /**
     * Get Pokemon evolutions from Pokemon id
     * @param id Id refer a Pokemon
     * @return @type{Evolution} object
     */
    public Evolution getPokemonEvolutions(String id) {
        Evolution pokemonEvolutions = null;
        try {
            URI uri;
            uri = new URI(pokemonURL+"/evolution-chain/"+id);
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
            HttpEntity<String> request = new HttpEntity<String>(headers);
            ResponseEntity<Evolution> pokemonEvolutionsEntity = restTemplate.exchange(uri, HttpMethod.GET, request,
                    Evolution.class);
            pokemonEvolutions = pokemonEvolutionsEntity.getBody();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return pokemonEvolutions;
    }
}

