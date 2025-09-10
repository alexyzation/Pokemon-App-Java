package com.pokedex.model;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Pokemon {
    private UUID id;
    private Integer nationalNumber;
    private String name;
    private String description;
    private List<PokemonType> types;
    private Region originRegion;
    private List<RegionalEntry> regionalEntries;
    private Map<PokemonType, TypeEffectiveness> weaknesses;
    private Map<PokemonType, TypeEffectiveness> resistances;

    public Pokemon() {
        this.id = UUID.randomUUID();
    }

    public Pokemon(Integer nationalNumber, String name, String description, List<PokemonType> types, Region originRegion, List<RegionalEntry> regionalEntries, Map<PokemonType, TypeEffectiveness> weaknesses, Map<PokemonType, TypeEffectiveness> resistances) {
        this.id = UUID.randomUUID();
        this.nationalNumber = nationalNumber;
        this.name = name;
        this.description = description;
        this.types = types;
        this.originRegion = originRegion;
        this.regionalEntries = regionalEntries;
        this.weaknesses = weaknesses;
        this.resistances = resistances;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getNationalNumber() {
        return nationalNumber;
    }

    public void setNationalNumber(Integer nationalNumber) {
        this.nationalNumber = nationalNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<PokemonType> getTypes() {
        return types;
    }

    public void setTypes(List<PokemonType> types) {
        this.types = types;
    }

    public Region getOriginRegion() {
        return originRegion;
    }

    public void setOriginRegion(Region originRegion) {
        this.originRegion = originRegion;
    }

    public List<RegionalEntry> getRegionalEntries() {
        return regionalEntries;
    }

    public void setRegionalEntries(List<RegionalEntry> regionalEntries) {
        this.regionalEntries = regionalEntries;
    }

    public Map<PokemonType, TypeEffectiveness> getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(Map<PokemonType, TypeEffectiveness> weaknesses) {
        this.weaknesses = weaknesses;
    }

    public Map<PokemonType, TypeEffectiveness> getResistances() {
        return resistances;
    }

    public void setResistances(Map<PokemonType, TypeEffectiveness> resistances) {
        this.resistances = resistances;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", nationalNumber=" + nationalNumber +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", types=" + types +
                ", originRegion=" + originRegion +
                ", regionalEntries=" + regionalEntries +
                ", weaknesses=" + weaknesses +
                ", resistances=" + resistances +
                '}';
    }
}
