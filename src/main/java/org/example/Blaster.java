package org.example;
import java.util.Random;

public class Blaster extends Weapon {

    public Blaster(){

        super("Blaster", (int)Math.floor(Math.random()*(40-25+1)+25));
    }

}
