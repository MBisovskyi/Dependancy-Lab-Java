package org.example.HerdVsFleet.Herd;

import org.example.HerdVsFleet.Dino.Dino;

import java.util.ArrayList;
import java.util.Scanner;

public class Herd {
    // Initial variables
    public ArrayList<Dino> dinos = new ArrayList<>();

    // Constructor
    public Herd() {

        //Instantiate Dinos
        this.dinos.add(new Dino("Arghh"));
        this.dinos.add(new Dino("Urghh"));
        this.dinos.add(new Dino("Orghh"));
    }

    // Can DO
    public String getHerdName(){
        System.out.println("Enter Herd name: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
