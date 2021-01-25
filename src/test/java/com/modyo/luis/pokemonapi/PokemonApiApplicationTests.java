package com.modyo.luis.pokemonapi;

import com.modyo.luis.pokemonapi.data.PokemonDetail;
import com.modyo.luis.pokemonapi.data.PokemonList;
import com.modyo.luis.pokemonapi.rest.client.PokeAPIRestClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class PokemonApiApplicationTests {

	@Autowired
	PokeAPIRestClient covidClient;

	@Test
	public void testGetPokemonList() {
		PokemonList pokemonList = covidClient.getPokemonList();
		System.out.println("Confirmed: " + pokemonList.getNext());
		assertTrue(Integer.parseInt(String.valueOf(pokemonList.getResults().size())) > 0);
	}

	@Test
	public void testGetPokemonDetail() {
		String pokemonBulbasaur = "bulbasaur";
		PokemonDetail totals = covidClient.getPokemonDetail(pokemonBulbasaur);
		System.out.println("Confirmed: " + totals.getAbilities());
		assertTrue(Integer.parseInt(String.valueOf(totals.getAbilities().size())) > 0);
	}

}
