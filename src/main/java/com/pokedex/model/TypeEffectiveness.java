package com.pokedex.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TypeEffectiveness {
    SUPER_EFFECTIVE(2.0), // 2x
    EFFECTIVE(1.0),       // 1x
    NOT_VERY_EFFECTIVE(0.5), // 1/2x
    NO_EFFECT(0.0);       // 0x

    private final double multiplier;

    TypeEffectiveness(double multiplier) {
        this.multiplier = multiplier;
    }

    public double getMultiplier() {
        return multiplier;
    }

    @JsonValue
    @Override
    public String toString() {
        if (multiplier == 2.0) return "Super Efetivo (2x)";
        if (multiplier == 0.5) return "Pouco Efetivo (1/2x)";
        if (multiplier == 0.0) return "Sem Efeito (0x)";
        return "Efetivo (1x)";
    }
    
    public String getSimpleFormat() {
        if (multiplier == 2.0) return "2x";
        if (multiplier == 0.5) return "1/2x";
        if (multiplier == 0.0) return "0x";
        return "1x";
    }
    
    public String getDescription() {
        if (multiplier == 2.0) return "Super Efetivo";
        if (multiplier == 0.5) return "Pouco Efetivo";
        if (multiplier == 0.0) return "Sem Efeito";
        return "Efetivo";
    }
}
