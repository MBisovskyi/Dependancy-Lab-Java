package org.example;

public class Dino implements Attacker{
    public String name;
    public int attackPower;

    public Dino(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    @Override
    public void Attack() {
        System.out.println(this.name + " attacks and deals " + this.attackPower + " damage");
    }
}
