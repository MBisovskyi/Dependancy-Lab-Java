package org.HerdVsFleet_Game.Robot;

import org.HerdVsFleet_Game.Armor.Armor;
import org.HerdVsFleet_Game.Interfaces.Attacker;
import org.HerdVsFleet_Game.Weapon.Weapon;

public class Robot implements Attacker {

    // Instance variables (HAS A)
    public String name;
    public Weapon weapon;
    public Armor armor;
    public int health;


    // Constructor
    public Robot( String name, Weapon weapon, Armor armor) {
        this.name = name;
        this.weapon = weapon;
        this.health = 150;
        this.armor = armor;
    }
    //Method (CAN DO)
    public void Attack(){
        System.out.println("\n" + this.name + " attacks with " + this.weapon.name + "!");}

}
