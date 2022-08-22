package org.example.HerdVsFleet.Armor;

public abstract class Armor {

    //Initial variables (HAS A)
    public String name;
    public int defence;

    // Constructor

    public Armor(String name, int defence) {
        this.name = name;
        this.defence = defence;
    }
}
