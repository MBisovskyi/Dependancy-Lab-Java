package org.example;

public class Dino implements Attacker{
    public String name;
    public int attackPower;
    public int health;
    public int skinThickness;
    public int penetration;

    public Dino(String name) {
        this.name = name;
        this.attackPower = (int)Math.floor(Math.random()*(50-25+1)+25);
        this.health = 200;
        this.skinThickness = 16;
        this.penetration = 12;
    }

    @Override
    public void Attack() {
        System.out.println(this.name + " attacks!");
    }
}
