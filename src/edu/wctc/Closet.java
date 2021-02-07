package edu.wctc;

public class Closet extends Room implements Lootable {

    public Closet(String name) {
        super(name);
    }

    @Override
    public String loot(Player player) {
        player.addToInventory("Gold coins");
        player.addToScore(50);
        return "You picked up a sack of gold coins. You have gained 50 points.";
    }

    @Override
    public String getDescription() {
        return "You are in a dirty closet. There is a shelf with a bag on it.";
    }
}
