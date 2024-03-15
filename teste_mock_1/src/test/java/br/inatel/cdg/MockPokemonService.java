package br.inatel.cdg;

public class MockPokemonService implements PokemonService {
    @Override
    public String buscaPokemon(Integer id) {
        if (id == 1) {
            return PokemonConst.PIKACHU;
        }
        else if (id == 2) {
            return PokemonConst.DRAGONITE;
        }
        else if (id == 3) {
            return PokemonConst.CHARIZARD;
        }
        else {
            return null;
        }
        
    }
}
