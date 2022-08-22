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
        this.health = (int)Math.floor(Math.random()*(185-155+1)+155);
        this.skinThickness = (int)Math.floor(Math.random()*(30-10+1)+10);
        this.penetration = (int)Math.floor(Math.random()*(20-10+1)+10);
    }

    @Override
    public void Attack() {
        System.out.println(this.name + " attacks!");
    }


}
