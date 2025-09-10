package com.pokedex.util;

import com.pokedex.model.PokemonType;
import com.pokedex.model.TypeEffectiveness;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TypeEffectivenessCalculator {

    // Tabela de efetividade baseada na imagem fornecida
    private static final Map<PokemonType, Map<PokemonType, TypeEffectiveness>> EFFECTIVENESS_CHART = new HashMap<>();

    static {
        initializeEffectivenessChart();
    }

    private static void initializeEffectivenessChart() {
        // Inicializar todas as combinações como efetivo (1x) por padrão
        for (PokemonType attackingType : PokemonType.values()) {
            EFFECTIVENESS_CHART.put(attackingType, new HashMap<>());
            for (PokemonType defendingType : PokemonType.values()) {
                EFFECTIVENESS_CHART.get(attackingType).put(defendingType, TypeEffectiveness.EFFECTIVE);
            }
        }

        // Configurar efetividades específicas baseadas na tabela
        // NORMAL
        setEffectiveness(PokemonType.NORMAL, PokemonType.ROCK, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.NORMAL, PokemonType.GHOST, TypeEffectiveness.NO_EFFECT);
        setEffectiveness(PokemonType.NORMAL, PokemonType.STEEL, TypeEffectiveness.NOT_VERY_EFFECTIVE);

        // FIGHTING
        setEffectiveness(PokemonType.FIGHTING, PokemonType.NORMAL, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.FIGHTING, PokemonType.FIGHTING, TypeEffectiveness.EFFECTIVE);
        setEffectiveness(PokemonType.FIGHTING, PokemonType.FLYING, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.FIGHTING, PokemonType.POISON, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.FIGHTING, PokemonType.GROUND, TypeEffectiveness.EFFECTIVE);
        setEffectiveness(PokemonType.FIGHTING, PokemonType.ROCK, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.FIGHTING, PokemonType.BUG, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.FIGHTING, PokemonType.GHOST, TypeEffectiveness.NO_EFFECT);
        setEffectiveness(PokemonType.FIGHTING, PokemonType.STEEL, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.FIGHTING, PokemonType.FIRE, TypeEffectiveness.EFFECTIVE);
        setEffectiveness(PokemonType.FIGHTING, PokemonType.WATER, TypeEffectiveness.EFFECTIVE);
        setEffectiveness(PokemonType.FIGHTING, PokemonType.GRASS, TypeEffectiveness.EFFECTIVE);
        setEffectiveness(PokemonType.FIGHTING, PokemonType.ELECTRIC, TypeEffectiveness.EFFECTIVE);
        setEffectiveness(PokemonType.FIGHTING, PokemonType.PSYCHIC, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.FIGHTING, PokemonType.ICE, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.FIGHTING, PokemonType.DRAGON, TypeEffectiveness.EFFECTIVE);
        setEffectiveness(PokemonType.FIGHTING, PokemonType.DARK, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.FIGHTING, PokemonType.FAIRY, TypeEffectiveness.NOT_VERY_EFFECTIVE);

        // FLYING
        setEffectiveness(PokemonType.FLYING, PokemonType.FIGHTING, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.FLYING, PokemonType.ROCK, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.FLYING, PokemonType.BUG, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.FLYING, PokemonType.STEEL, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.FLYING, PokemonType.GRASS, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.FLYING, PokemonType.ELECTRIC, TypeEffectiveness.NOT_VERY_EFFECTIVE);

        // POISON
        setEffectiveness(PokemonType.POISON, PokemonType.POISON, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.POISON, PokemonType.GROUND, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.POISON, PokemonType.ROCK, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.POISON, PokemonType.GHOST, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.POISON, PokemonType.STEEL, TypeEffectiveness.NO_EFFECT);
        setEffectiveness(PokemonType.POISON, PokemonType.GRASS, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.POISON, PokemonType.FAIRY, TypeEffectiveness.SUPER_EFFECTIVE);

        // GROUND
        setEffectiveness(PokemonType.GROUND, PokemonType.FLYING, TypeEffectiveness.NO_EFFECT);
        setEffectiveness(PokemonType.GROUND, PokemonType.POISON, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.GROUND, PokemonType.BUG, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.GROUND, PokemonType.STEEL, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.GROUND, PokemonType.FIRE, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.GROUND, PokemonType.GRASS, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.GROUND, PokemonType.ELECTRIC, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.GROUND, PokemonType.ROCK, TypeEffectiveness.SUPER_EFFECTIVE);

        // ROCK
        setEffectiveness(PokemonType.ROCK, PokemonType.FIGHTING, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.ROCK, PokemonType.FLYING, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.ROCK, PokemonType.GROUND, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.ROCK, PokemonType.BUG, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.ROCK, PokemonType.STEEL, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.ROCK, PokemonType.FIRE, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.ROCK, PokemonType.ICE, TypeEffectiveness.SUPER_EFFECTIVE);

        // BUG
        setEffectiveness(PokemonType.BUG, PokemonType.FIGHTING, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.BUG, PokemonType.FLYING, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.BUG, PokemonType.POISON, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.BUG, PokemonType.GHOST, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.BUG, PokemonType.STEEL, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.BUG, PokemonType.FIRE, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.BUG, PokemonType.GRASS, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.BUG, PokemonType.PSYCHIC, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.BUG, PokemonType.DARK, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.BUG, PokemonType.FAIRY, TypeEffectiveness.NOT_VERY_EFFECTIVE);

        // GHOST
        setEffectiveness(PokemonType.GHOST, PokemonType.NORMAL, TypeEffectiveness.NO_EFFECT);
        setEffectiveness(PokemonType.GHOST, PokemonType.GHOST, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.GHOST, PokemonType.PSYCHIC, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.GHOST, PokemonType.DARK, TypeEffectiveness.NOT_VERY_EFFECTIVE);

        // STEEL
        setEffectiveness(PokemonType.STEEL, PokemonType.ROCK, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.STEEL, PokemonType.STEEL, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.STEEL, PokemonType.FIRE, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.STEEL, PokemonType.WATER, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.STEEL, PokemonType.ELECTRIC, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.STEEL, PokemonType.ICE, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.STEEL, PokemonType.FAIRY, TypeEffectiveness.SUPER_EFFECTIVE);

        // FIRE
        setEffectiveness(PokemonType.FIRE, PokemonType.ROCK, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.FIRE, PokemonType.BUG, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.FIRE, PokemonType.STEEL, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.FIRE, PokemonType.FIRE, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.FIRE, PokemonType.WATER, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.FIRE, PokemonType.GRASS, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.FIRE, PokemonType.ICE, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.FIRE, PokemonType.DRAGON, TypeEffectiveness.NOT_VERY_EFFECTIVE);

        // WATER
        setEffectiveness(PokemonType.WATER, PokemonType.GROUND, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.WATER, PokemonType.ROCK, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.WATER, PokemonType.FIRE, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.WATER, PokemonType.WATER, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.WATER, PokemonType.GRASS, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.WATER, PokemonType.DRAGON, TypeEffectiveness.NOT_VERY_EFFECTIVE);

        // GRASS
        setEffectiveness(PokemonType.GRASS, PokemonType.FLYING, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.GRASS, PokemonType.POISON, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.GRASS, PokemonType.GROUND, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.GRASS, PokemonType.ROCK, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.GRASS, PokemonType.BUG, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.GRASS, PokemonType.STEEL, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.GRASS, PokemonType.FIRE, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.GRASS, PokemonType.WATER, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.GRASS, PokemonType.GRASS, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.GRASS, PokemonType.DRAGON, TypeEffectiveness.NOT_VERY_EFFECTIVE);

        // ELECTRIC
        setEffectiveness(PokemonType.ELECTRIC, PokemonType.FLYING, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.ELECTRIC, PokemonType.GROUND, TypeEffectiveness.NO_EFFECT);
        setEffectiveness(PokemonType.ELECTRIC, PokemonType.WATER, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.ELECTRIC, PokemonType.GRASS, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.ELECTRIC, PokemonType.ELECTRIC, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.ELECTRIC, PokemonType.DRAGON, TypeEffectiveness.NOT_VERY_EFFECTIVE);

        // PSYCHIC
        setEffectiveness(PokemonType.PSYCHIC, PokemonType.FIGHTING, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.PSYCHIC, PokemonType.POISON, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.PSYCHIC, PokemonType.STEEL, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.PSYCHIC, PokemonType.PSYCHIC, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.PSYCHIC, PokemonType.DARK, TypeEffectiveness.NO_EFFECT);

        // ICE
        setEffectiveness(PokemonType.ICE, PokemonType.FLYING, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.ICE, PokemonType.GROUND, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.ICE, PokemonType.STEEL, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.ICE, PokemonType.FIRE, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.ICE, PokemonType.WATER, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.ICE, PokemonType.GRASS, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.ICE, PokemonType.ICE, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.ICE, PokemonType.DRAGON, TypeEffectiveness.SUPER_EFFECTIVE);

        // DRAGON
        setEffectiveness(PokemonType.DRAGON, PokemonType.STEEL, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.DRAGON, PokemonType.DRAGON, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.DRAGON, PokemonType.FAIRY, TypeEffectiveness.NO_EFFECT);

        // DARK
        setEffectiveness(PokemonType.DARK, PokemonType.FIGHTING, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.DARK, PokemonType.GHOST, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.DARK, PokemonType.PSYCHIC, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.DARK, PokemonType.DARK, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.DARK, PokemonType.FAIRY, TypeEffectiveness.NOT_VERY_EFFECTIVE);

        // FAIRY
        setEffectiveness(PokemonType.FAIRY, PokemonType.FIGHTING, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.FAIRY, PokemonType.POISON, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.FAIRY, PokemonType.STEEL, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.FAIRY, PokemonType.FIRE, TypeEffectiveness.NOT_VERY_EFFECTIVE);
        setEffectiveness(PokemonType.FAIRY, PokemonType.DRAGON, TypeEffectiveness.SUPER_EFFECTIVE);
        setEffectiveness(PokemonType.FAIRY, PokemonType.DARK, TypeEffectiveness.SUPER_EFFECTIVE);
    }

    private static void setEffectiveness(PokemonType attackingType, PokemonType defendingType, TypeEffectiveness effectiveness) {
        EFFECTIVENESS_CHART.get(attackingType).put(defendingType, effectiveness);
    }

    public static Map<PokemonType, TypeEffectiveness> calculateWeaknesses(List<PokemonType> pokemonTypes) {
        Map<PokemonType, TypeEffectiveness> weaknesses = new HashMap<>();
        
        for (PokemonType attackingType : PokemonType.values()) {
            double totalMultiplier = 1.0;
            
            for (PokemonType defendingType : pokemonTypes) {
                TypeEffectiveness effectiveness = EFFECTIVENESS_CHART.get(attackingType).get(defendingType);
                totalMultiplier *= effectiveness.getMultiplier();
            }
            
            if (totalMultiplier > 1.0) {
                if (totalMultiplier >= 4.0) {
                    weaknesses.put(attackingType, TypeEffectiveness.SUPER_EFFECTIVE); // Representando 4x como 2x para simplificação
                } else {
                    weaknesses.put(attackingType, TypeEffectiveness.SUPER_EFFECTIVE);
                }
            }
        }
        
        return weaknesses;
    }

    public static Map<PokemonType, TypeEffectiveness> calculateResistances(List<PokemonType> pokemonTypes) {
        Map<PokemonType, TypeEffectiveness> resistances = new HashMap<>();
        
        for (PokemonType attackingType : PokemonType.values()) {
            double totalMultiplier = 1.0;
            
            for (PokemonType defendingType : pokemonTypes) {
                TypeEffectiveness effectiveness = EFFECTIVENESS_CHART.get(attackingType).get(defendingType);
                totalMultiplier *= effectiveness.getMultiplier();
            }
            
            if (totalMultiplier < 1.0) {
                if (totalMultiplier == 0.0) {
                    resistances.put(attackingType, TypeEffectiveness.NO_EFFECT);
                } else {
                    resistances.put(attackingType, TypeEffectiveness.NOT_VERY_EFFECTIVE);
                }
            }
        }
        
        return resistances;
    }
}
