package org.example;

public class Robot implements Attacker{

    // Instance variables (HAS A)
    public String name;
    public Weapon weapon;

    // Constructor
    public Robot(Weapon weapon, String name) {
        this.name = name;
        this.weapon = weapon;
    }

    //Method (CAN DO)
    public void Attack(){
        System.out.println(this.name + " attacks with their " + this.weapon.name + " for " + this.weapon.power + " damage!");
    }

}
