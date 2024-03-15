package br.inatel.cdg;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaPokemon {

    PokemonService pokemonService;

    public BuscaPokemon(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    public Pokemon busca(Integer id){
        String pokeJson = pokemonService.buscaPokemon(id);
        JsonObject pokemon = JsonParser.parseString(pokeJson).getAsJsonObject();

        return new Pokemon(pokemon.get("nome").getAsString(),
                pokemon.get("vida").getAsDouble(),
                pokemon.get("arma").getAsString());
    }
    
    

}
