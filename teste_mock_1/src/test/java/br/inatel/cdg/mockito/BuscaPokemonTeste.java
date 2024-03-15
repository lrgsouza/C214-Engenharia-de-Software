package br.inatel.cdg.mockito;
import br.inatel.cdg.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BuscaPokemonTeste {

    @Mock
    PokemonService service;
    BuscaPokemon buscaPokemon;

    @Before
    public void setup(){
        this.buscaPokemon = new BuscaPokemon(service);
    }

    @Test
    public void testeBuscarPikachu(){
        Mockito.when(service.buscaPokemon(1)).thenReturn(PokemonConst.PIKACHU);
        Pokemon pikachu = buscaPokemon.busca(1);
        assertEquals("Pikachu", pikachu.getNome());
        assertEquals(100.0, pikachu.getVida(), 0.0);
        assertEquals("rabo", pikachu.getArma());

    }

    @Test
    public void testeBuscarDragonite(){
        Mockito.when(service.buscaPokemon(2)).thenReturn(PokemonConst.DRAGONITE);
        Pokemon dragonite = buscaPokemon.busca(2);
        assertEquals("Dragonite", dragonite.getNome());
        assertEquals(50.0, dragonite.getVida(), 0.0);
        assertEquals("Escudo", dragonite.getArma());
    }
    @Test
    public void testeBuscarCharizard(){
        Mockito.when(service.buscaPokemon(3)).thenReturn(PokemonConst.CHARIZARD);
        Pokemon charizard = buscaPokemon.busca(3);
        assertEquals("Charizard", charizard.getNome());
        assertEquals(150.0, charizard.getVida(), 0.0);
        assertEquals("Fogo", charizard.getArma());
    }


}
