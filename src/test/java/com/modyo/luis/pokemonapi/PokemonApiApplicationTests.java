package com.modyo.luis.pokemonapi;

import com.modyo.luis.pokemonapi.data.Evolution;
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
	PokeAPIRestClient pokeAPIRestClient;

	@Test
	public void testGetPokemonList() {
		PokemonList pokemonList = pokeAPIRestClient.getPokemonList("20", "20");
		System.out.println("pokemonList: " + pokemonList.getNext());
		assertTrue(Integer.parseInt(String.valueOf(pokemonList.getResults().size())) > 0);
	}

	@Test
	public void testGetPokemonDetail() {
		String pokemonBulbasaur = "bulbasaur";
		PokemonDetail pokemonDetails = pokeAPIRestClient.getPokemonDetail(pokemonBulbasaur);
		System.out.println("pokemonDetails: " + pokemonDetails.getAbilities());
		assertTrue(Integer.parseInt(String.valueOf(pokemonDetails.getAbilities().size())) > 0);
	}

	@Test
	public void testGetPokemonEvolution() {
		String pokemonBulbasaurId = "1";
		Evolution evolutions = pokeAPIRestClient.getPokemonEvolutions(pokemonBulbasaurId);
		System.out.println("evolutions: " + evolutions.getChain().getEvolvesTo());
		assertTrue(Integer.parseInt(String.valueOf(evolutions.getChain().getEvolvesTo().size())) > 0);
	}

}
