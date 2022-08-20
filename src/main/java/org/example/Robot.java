package org.example;

public class Robot implements Attacker{

    // Instance variables (HAS A)
    public String name;
    public Weapon weapon;
    public int health;

    // Constructor
    public Robot(Weapon weapon, String name) {
        this.name = name;
        this.weapon = weapon;
        this.health = 100;
    }
    //Method (CAN DO)
    public void Attack(){
        System.out.println(this.name + " attacks with their " + this.weapon.name + " for " + this.weapon.power + " damage!");
    }

}
