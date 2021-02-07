package edu.wctc;

public class Stairwell extends Room implements Exit {
    public Stairwell(String name) {
        super(name);
    }

    @Override
    public String exit(Player player) {
        return "You have escaped!";
    }

    @Override
    public String getDescription() {
        return "You are in a stairwell with a door at the top.";
    }
}
