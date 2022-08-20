package org.example;
import java.util.Random;

public class Dino implements Attacker{
    public String name;
    public int attackPower;
    public int health;

    public Dino(String name) {
        this.name = name;
        this.attackPower = (int)Math.floor(Math.random()*(50-25+1)+25);
        this.health = 150;
    }

    @Override
    public void Attack() {
        System.out.println(this.name + " attacks and deals " + this.attackPower + " damage");
    }
}
