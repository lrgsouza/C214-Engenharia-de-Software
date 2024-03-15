package br.inatel.cdg;

import org.junit.Before;
import org.junit.Test;

public class BuscaPokemonTeste {

    PokemonService service;
    BuscaPokemon buscaPokemon;

    @Before
    public void setup(){
        this.service = new MockPokemonService();
        this.buscaPokemon = new BuscaPokemon(service);
    }

    @Test
    public void testeBuscarPikachu(){
        Pokemon pikachu = buscaPokemon.busca(1);
        assert pikachu.getNome().equals("Pikachu");
        assert pikachu.getVida() == 100.0;
        assert pikachu.getArma().equals("rabo");
    }

    @Test
    public void testeBuscarDragonite(){
        Pokemon dragonite = buscaPokemon.busca(2);
        assert dragonite.getNome().equals("Dragonite");
        assert dragonite.getVida() == 50.0;
        assert dragonite.getArma().equals("Escudo");
    }
    @Test
    public void testeBuscarCharizard(){
        Pokemon charizard = buscaPokemon.busca(3);
        assert charizard.getNome().equals("Charizard");
        assert charizard.getVida() == 150.0;
        assert charizard.getArma().equals("Fogo");
    }
    
}
