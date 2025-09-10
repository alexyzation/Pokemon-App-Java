package com.pokedex.controller;

import com.pokedex.model.*;
import com.pokedex.service.PokemonService;
import com.pokedex.util.TypeEffectivenessCalculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(PokemonController.class)
class PokemonControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PokemonService pokemonService;

    private Pokemon createTestPokemon(Integer nationalNumber, String name, List<PokemonType> types, Region region, List<RegionalEntry> regionalEntries) {
        String description = "Test description for " + name;
        Map<PokemonType, TypeEffectiveness> weaknesses = TypeEffectivenessCalculator.calculateWeaknesses(types);
        Map<PokemonType, TypeEffectiveness> resistances = TypeEffectivenessCalculator.calculateResistances(types);
        return new Pokemon(nationalNumber, name, description, types, region, regionalEntries, weaknesses, resistances);
    }

    @Test
    void getAllPokemon_ShouldReturnListOfPokemon() throws Exception {
        // Given
        List<Pokemon> mockPokemon = Arrays.asList(
                createTestPokemon(1, "Bulbasaur", Arrays.asList(PokemonType.GRASS, PokemonType.POISON), Region.KANTO, 
                    Arrays.asList(new RegionalEntry(Region.KANTO, 1))),
                createTestPokemon(2, "Ivysaur", Arrays.asList(PokemonType.GRASS, PokemonType.POISON), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 2)))
        );
        when(pokemonService.getAllPokemon()).thenReturn(mockPokemon);

        // When & Then
        mockMvc.perform(get("/api/pokemon"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$.length()").value(2))
                .andExpect(jsonPath("$[0].name").value("Bulbasaur"))
                .andExpect(jsonPath("$[0].nationalNumber").value(1));
    }

    @Test
    void getPokemonByNationalNumber_WhenPokemonExists_ShouldReturnPokemon() throws Exception {
        // Given
        Pokemon mockPokemon = createTestPokemon(1, "Bulbasaur", Arrays.asList(PokemonType.GRASS, PokemonType.POISON), Region.KANTO,
            Arrays.asList(new RegionalEntry(Region.KANTO, 1)));
        when(pokemonService.getPokemonByNationalNumber(1)).thenReturn(mockPokemon);

        // When & Then
        mockMvc.perform(get("/api/pokemon/national/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.name").value("Bulbasaur"))
                .andExpect(jsonPath("$.nationalNumber").value(1));
    }

    @Test
    void getPokemonByType_ShouldReturnPokemonOfSpecificType() throws Exception {
        // Given
        List<Pokemon> mockPokemon = Arrays.asList(
                createTestPokemon(4, "Charmander", Arrays.asList(PokemonType.FIRE), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 4))),
                createTestPokemon(5, "Charmeleon", Arrays.asList(PokemonType.FIRE), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 5)))
        );
        when(pokemonService.getPokemonByType(PokemonType.FIRE)).thenReturn(mockPokemon);

        // When & Then
        mockMvc.perform(get("/api/pokemon/type/FIRE"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$.length()").value(2))
                .andExpect(jsonPath("$[0].name").value("Charmander"))
                .andExpect(jsonPath("$[1].name").value("Charmeleon"));
    }
}
