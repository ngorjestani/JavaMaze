package edu.wctc;

public class BasementRoom extends Room implements Interactable {

    public BasementRoom(String name) {
        super(name);
    }

    @Override
    public String interact(Player player) {
        player.addToScore(-30);
        return "You were swarmed by a beehive. You lost 30 points.";
    }

    @Override
    public String getDescription() {
        return "You found a small room. There is a buzzing noise.";
    }
}
