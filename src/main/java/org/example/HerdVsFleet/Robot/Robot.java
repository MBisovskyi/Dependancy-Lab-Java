package org.example.HerdVsFleet.Robot;

import org.example.HerdVsFleet.Armor.Armor;
import org.example.HerdVsFleet.Interfaces.Attacker;
import org.example.HerdVsFleet.Weapon.Weapon;

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
