package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Instantiate Weapon
        Weapon blaster = new Blaster();
        Weapon railgun = new Railgun();
        Weapon lasersaw = new Lasersaw();

        // Instantiate Robots
        Attacker robot_one = new Robot(lasersaw, "Scrch");
        Attacker robot_two = new Robot(railgun, "W240");
        Attacker robot_three = new Robot(blaster, "Dibidibu");

        // Instantiate Dinos
        Attacker dino_one = new Dino("Arghh", 56);
        Attacker dino_two = new Dino("Urghh", 60);
        Attacker dino_three = new Dino("Orghh", 52);

        // Call robot's Attacks
        robot_one.Attack();
        robot_two.Attack();
        robot_three.Attack();

        // Call dino's Attacks
        dino_one.Attack();
        dino_two.Attack();
        dino_three.Attack();
    }

}