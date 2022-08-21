package org.example;

public class Railgun extends Weapon {
    public Railgun(){
        super("Railgun", (int)Math.floor(Math.random()*(75-40+1)+40), 20);
    }
}
