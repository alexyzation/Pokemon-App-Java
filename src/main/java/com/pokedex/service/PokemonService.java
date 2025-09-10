package com.pokedex.service;

import com.pokedex.model.Pokemon;
import com.pokedex.model.PokemonType;
import com.pokedex.model.Region;
import java.util.List;

public interface PokemonService {
    List<Pokemon> getAllPokemon();
    Pokemon getPokemonByNationalNumber(Integer nationalNumber);
    List<Pokemon> getPokemonByType(PokemonType type);
    List<Pokemon> getPokemonByOriginRegion(Region region);
    List<Pokemon> getPokemonByRegion(Region region);
    Pokemon getPokemonByRegionalNumber(Region region, Integer regionalNumber);
}
