package org.example;

public class Battlefield {
    Herd herd = new Herd();
    Fleet fleet = new Fleet();
    String herdName = herd.getHerdName();
    String fleetName = fleet.getFleetName();


    // Can DO
    public void runBattle(){
        printTeamsNames();
        runBattleRound();
    }

    public void runBattleRound(){
        herd.dinos.get(0).Attack();
        fleet.robots.get(0).health -= herd.dinos.get(0).attackPower;
        System.out.println(fleet.robots.get(0).name + " was attacked by " + herd.dinos.get(0).name + " and has " + fleet.robots.get(0).health + " health remaining!");
        fleet.robots.get(0).Attack();
        herd.dinos.get(0).health -= fleet.robots.get(0).weapon.power;
        System.out.println(herd.dinos.get(0).name + " was attacked by " + fleet.robots.get(0).name + " and has " + herd.dinos.get(0).health + " health remaining!");

    }

    public void printTeamsNames(){
        System.out.println("Herd " + herdName.toUpperCase() + " vs " + fleetName.toUpperCase() + " Fleet");
    }
}
