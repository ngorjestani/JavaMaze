package edu.wctc;

public class Basement extends Room implements Interactable{

     public Basement(String name) {
        super(name);
    }

    @Override
    public String interact(Player player) {
        player.addToScore(-10);
        return "You were bit by by a snake. You lost 10 points.";
    }

    @Override
    public String getDescription() {
        return "You are in a dimly lit basement. There is a rug on the floor. You see something move underneath it.";
    }
}

