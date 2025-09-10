package com.pokedex.service.impl;

import com.pokedex.data.PokemonDataInitializer;
import com.pokedex.model.Pokemon;
import com.pokedex.model.PokemonType;
import com.pokedex.model.Region;
import com.pokedex.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PokemonServiceImpl implements PokemonService {

    private final List<Pokemon> pokemonList;

    @Autowired
    public PokemonServiceImpl(PokemonDataInitializer dataInitializer) {
        this.pokemonList = dataInitializer.initializePokemonList();
    }

    @Override
    public List<Pokemon> getAllPokemon() {
        return pokemonList;
    }

    @Override
    public Pokemon getPokemonByNationalNumber(Integer nationalNumber) {
        return pokemonList.stream()
                .filter(pokemon -> pokemon.getNationalNumber().equals(nationalNumber))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Pokemon> getPokemonByType(PokemonType type) {
        return pokemonList.stream()
                .filter(pokemon -> pokemon.getTypes().contains(type))
                .collect(Collectors.toList());
    }

    @Override
    public List<Pokemon> getPokemonByOriginRegion(Region region) {
        return pokemonList.stream()
                .filter(pokemon -> pokemon.getOriginRegion().equals(region))
                .collect(Collectors.toList());
    }

    @Override
    public List<Pokemon> getPokemonByRegion(Region region) {
        return pokemonList.stream()
                .filter(pokemon -> pokemon.getRegionalEntries().stream()
                        .anyMatch(entry -> entry.getRegion().equals(region)))
                .collect(Collectors.toList());
    }

    @Override
    public Pokemon getPokemonByRegionalNumber(Region region, Integer regionalNumber) {
        return pokemonList.stream()
                .filter(pokemon -> pokemon.getRegionalEntries().stream()
                        .anyMatch(entry -> entry.getRegion().equals(region) && 
                                 entry.getRegionalNumber().equals(regionalNumber)))
                .findFirst()
                .orElse(null);
    }
}
