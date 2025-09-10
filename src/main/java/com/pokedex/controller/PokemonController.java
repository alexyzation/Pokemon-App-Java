package com.pokedex.controller;

import com.pokedex.model.Pokemon;
import com.pokedex.model.PokemonType;
import com.pokedex.model.Region;
import com.pokedex.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pokemon")
@CrossOrigin(origins = "*")
public class PokemonController {

    private final PokemonService pokemonService;

    @Autowired
    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping
    public ResponseEntity<List<Pokemon>> getAllPokemon() {
        List<Pokemon> pokemon = pokemonService.getAllPokemon();
        return ResponseEntity.ok(pokemon);
    }

    @GetMapping("/national/{nationalNumber}")
    public ResponseEntity<Pokemon> getPokemonByNationalNumber(@PathVariable Integer nationalNumber) {
        Pokemon pokemon = pokemonService.getPokemonByNationalNumber(nationalNumber);
        if (pokemon != null) {
            return ResponseEntity.ok(pokemon);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/type/{type}")
    public ResponseEntity<List<Pokemon>> getPokemonByType(@PathVariable PokemonType type) {
        List<Pokemon> pokemon = pokemonService.getPokemonByType(type);
        return ResponseEntity.ok(pokemon);
    }

    @GetMapping("/origin-region/{region}")
    public ResponseEntity<List<Pokemon>> getPokemonByOriginRegion(@PathVariable Region region) {
        List<Pokemon> pokemon = pokemonService.getPokemonByOriginRegion(region);
        return ResponseEntity.ok(pokemon);
    }

    @GetMapping("/region/{region}")
    public ResponseEntity<List<Pokemon>> getPokemonByRegion(@PathVariable Region region) {
        List<Pokemon> pokemon = pokemonService.getPokemonByRegion(region);
        return ResponseEntity.ok(pokemon);
    }

    @GetMapping("/region/{region}/{regionalNumber}")
    public ResponseEntity<Pokemon> getPokemonByRegionalNumber(@PathVariable Region region, @PathVariable Integer regionalNumber) {
        Pokemon pokemon = pokemonService.getPokemonByRegionalNumber(region, regionalNumber);
        if (pokemon != null) {
            return ResponseEntity.ok(pokemon);
        }
        return ResponseEntity.notFound().build();
    }

    // Manter compatibilidade com endpoint antigo
    @GetMapping("/{nationalNumber}")
    public ResponseEntity<Pokemon> getPokemonByNumber(@PathVariable Integer nationalNumber) {
        return getPokemonByNationalNumber(nationalNumber);
    }
}
