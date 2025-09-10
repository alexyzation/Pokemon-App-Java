package com.pokedex.model;

public enum Region {
    KANTO("Kanto"),
    JOHTO("Johto"),
    HOENN("Hoenn"),
    SINNOH("Sinnoh"),
    UNOVA("Unova"),
    KALOS("Kalos"),
    ALOLA("Alola"),
    GALAR("Galar"),
    PALDEA("Paldea");

    private final String displayName;

    Region(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
