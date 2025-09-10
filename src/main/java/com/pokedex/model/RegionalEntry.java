package com.pokedex.model;

public class RegionalEntry {
    private Region region;
    private Integer regionalNumber;

    public RegionalEntry() {
    }

    public RegionalEntry(Region region, Integer regionalNumber) {
        this.region = region;
        this.regionalNumber = regionalNumber;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Integer getRegionalNumber() {
        return regionalNumber;
    }

    public void setRegionalNumber(Integer regionalNumber) {
        this.regionalNumber = regionalNumber;
    }

    @Override
    public String toString() {
        return "RegionalEntry{" +
                "region=" + region +
                ", regionalNumber=" + regionalNumber +
                '}';
    }
}
