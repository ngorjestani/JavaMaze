package edu.wctc;

import java.util.ArrayList;

public class Player {
    private int score;
    private ArrayList<String> inventory= new ArrayList<String>();

    public int getScore() {
        return score;
    }

    public String getInventory() {
        if (inventory.isEmpty()) {
            return "Inventory is empty";
        } else{
            return inventory.toString();
        }
    }

    public void addToInventory(String item) {
        inventory.add(item);
    }

    public void addToScore(int points) {
        score += points;
    }


}
