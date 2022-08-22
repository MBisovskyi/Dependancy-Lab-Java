package org.HerdVsFleet_Game.Fleet;
import org.HerdVsFleet_Game.Armor.LightArmor;
import org.HerdVsFleet_Game.Armor.MediumArmor;
import org.HerdVsFleet_Game.Armor.Armor;
import org.HerdVsFleet_Game.Armor.HeavyArmor;
import org.HerdVsFleet_Game.Robot.Robot;
import org.HerdVsFleet_Game.Weapon.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Fleet {

    // Initial variables
    public ArrayList<Weapon> weapon = new ArrayList<>();
    public ArrayList<Armor> armor = new ArrayList<>();
    public ArrayList<Robot> robots = new ArrayList<>();

    // Constructor
    public Fleet() {

        // Instantiate Weapon
        this.weapon.add(new Lasersaw());
        this.weapon.add(new Blaster());
        this.weapon.add(new Railgun());
        this.weapon.add(new ThorHammer());
        this.weapon.add(new LightSabre());
        this.weapon.add(new SpikeGloves());

        // Instantiate Armor
        this.armor.add(new HeavyArmor());
        this.armor.add(new MediumArmor());
        this.armor.add(new LightArmor());

        // Instantiate Robots
        this.robots.add(new Robot("W240", getRandomWeapon(this.weapon), getRandomArmor(this.armor)));
        this.robots.add(new Robot("Dibidibu", getRandomWeapon(this.weapon), getRandomArmor(this.armor)));
        this.robots.add(new Robot("Scrch", getRandomWeapon(this.weapon), getRandomArmor(this.armor)));

    }

    // Can DO
    public String getFleetName() {
        System.out.println("Enter Fleet name: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public Weapon getRandomWeapon(ArrayList<Weapon> weapon){
        Random index = new Random();
        Weapon randomWeapon = weapon.get(index.nextInt(weapon.size()));
        weapon.remove(randomWeapon);
        return  randomWeapon;
    }

    public Armor getRandomArmor(ArrayList<Armor> armor){
        Random index = new Random();
        Armor randomArmor = armor.get(index.nextInt(armor.size()));
        armor.remove(randomArmor);
        return randomArmor;
    }
}
