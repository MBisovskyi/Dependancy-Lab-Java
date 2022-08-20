package org.example;
import java.util.Random;

public class Lasersaw extends Weapon {


    public Lasersaw(){
        super("Laser Saw", (int)Math.floor(Math.random()*(65-35+1)+35));
    }
}
