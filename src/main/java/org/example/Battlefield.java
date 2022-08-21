package org.example;
import java.util.Scanner;
import java.awt.event.KeyEvent;
import java.util.EventListener;

public class Battlefield {
    Herd herd = new Herd();
    Fleet fleet = new Fleet();
    String herdName = herd.getHerdName();
    String fleetName = fleet.getFleetName();
    int roundNum = 1;
    boolean gameOver = false;


    // Can DO
    public void runBattle(){
        printTeamsNames();
        runRound();

    }

    public void runRound(){
        do {
            displayRoundNum(roundNum);
            roundNum += 1;
            herd.dinos.get(0).Attack();
            fleet.robots.get(0).health -= herd.dinos.get(0).attackPower + herd.dinos.get(0).penetration - (fleet.robots.get(0).armor.defence / 2);
            if(fleet.robots.get(0).health <= 0){fleet.robots.get(0).health = 0;};
            System.out.println(fleet.robots.get(0).name + " was attacked by " + herd.dinos.get(0).name + " and has " + fleet.robots.get(0).health + " health remaining!");
            checkIfKilled(fleet, herd);
            if(gameOver = checkWinner(herd, fleet) == true){
                System.out.println("\n" + herdName.toUpperCase() + " are the winners!\n" + "This battle is over, but a war is not!");
                break;
            }
            fleet.robots.get(0).Attack();
            herd.dinos.get(0).health -= fleet.robots.get(0).weapon.power + fleet.robots.get(0).weapon.penetration - herd.dinos.get(0).skinThickness;
            if(herd.dinos.get(0).health <= 0){herd.dinos.get(0).health = 0;};
            System.out.println(herd.dinos.get(0).name + " was attacked by " + fleet.robots.get(0).name + " and has " + herd.dinos.get(0).health + " health remaining!\n");
            checkIfKilled(fleet, herd);
            if(gameOver = checkWinner(herd, fleet) == true){
                System.out.println("\n" + fleetName.toUpperCase() + " are the winners!\n" + "This battle is over, but a war is not!");
                break;
            }
            if(startNextRound() == true){
                runRound();
            };
        } while (gameOver == false);

    }

    public void printTeamsNames(){
        System.out.println("\nHerd " + herdName.toUpperCase() + " vs " + fleetName.toUpperCase() + " Fleet\n");
    }

    public boolean startNextRound() {
        boolean nextRound = false;
        do {
            System.out.println("Hit Enter to continue this epic battle!");
            Scanner scanner = new Scanner(System.in);
            String keyEnter = scanner.nextLine();
            if(keyEnter.equals("")){
                nextRound = true;
            } else {
                nextRound = false;
            }
        } while (nextRound == false);
        return true;
    }

    public void checkIfKilled(Fleet fleet, Herd herd){
        if(fleet.robots.get(0).health <= 0){
            System.out.println(fleet.robots.get(0).name + " was killed by " + herd.dinos.get(0).name + "!");
            fleet.robots.remove(0);
            if(fleet.robots.isEmpty() == false){
                System.out.println(fleet.robots.get(0).name + " takes his place on the battlefield!");
            }
        } else if (herd.dinos.get(0).health <= 0){
            System.out.println(herd.dinos.get(0).name + " was smashed by " + fleet.robots.get(0).name + " with " + fleet.robots.get(0).weapon.name + "!");
            herd.dinos.remove(0);
            if(herd.dinos.isEmpty() == false){
                System.out.println(herd.dinos.get(0).name + " takes his place on the battlefield!\n");
            }
        }
    }

    public boolean checkWinner(Herd herd, Fleet fleet){
        boolean isWinner = false;
        if(fleet.robots.size() == 0 || herd.dinos.size() == 0){
            isWinner = true;
        }
        return isWinner;
    }

    public void displayRoundNum(int roundNum){
        System.out.println("    Round ".toUpperCase() + roundNum + "\n");
    }

}
