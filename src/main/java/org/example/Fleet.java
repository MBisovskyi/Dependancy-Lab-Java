package org.example;
import java.util.ArrayList;
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

        // Instantiate Armor
        this.armor.add(new HeavyArmor());
        this.armor.add(new MediumArmor());
        this.armor.add(new LightArmor());

        // Instantiate Robots
        this.robots.add(new Robot("W240", this.weapon.get(0), this.armor.get(0)));
        this.robots.add(new Robot("Dibidibu", this.weapon.get(1), this.armor.get(1)));
        this.robots.add(new Robot("Scrch", this.weapon.get(2), this.armor.get(2)));


    }

    // Can DO
    public String getFleetName() {
        System.out.println("Enter Fleet name: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
