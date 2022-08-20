package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Fleet {

    // Initial variables
    public ArrayList<Weapon> weapon = new ArrayList<>();
    public ArrayList<Robot> robots = new ArrayList<>();

    // Constructor
    public Fleet() {

        // Instantiate Weapon
        this.weapon.add(new Blaster());
        this.weapon.add(new Railgun());
        this.weapon.add(new Lasersaw());

        // Instantiate Robots
        this.robots.add(new Robot(weapon.get(0), "W240"));
        this.robots.add(new Robot(this.weapon.get(1), "Dibidibu"));
        this.robots.add(new Robot(this.weapon.get(2), "Scrch"));


    }

    // Can DO
    public String getFleetName() {
        System.out.println("Enter Fleet name: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
