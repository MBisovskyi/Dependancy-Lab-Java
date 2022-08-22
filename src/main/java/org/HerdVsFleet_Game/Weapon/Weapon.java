package org.HerdVsFleet_Game.Weapon;

public abstract class Weapon {
    // Instance variables (HAS A)
    public String name;
    public int power;
    public int penetration;

    //Constructor
    public Weapon(String name, int power, int penetration) {
        this.name = name;
        this.power = power;
        this.penetration = penetration;
    }
}
