package edu.wctc;

public class Bedroom extends Room implements Lootable {

    public Bedroom(String name) {
        super(name);
    }

    @Override
    public String loot(Player player) {
        player.addToScore(40);
        player.addToInventory("Crown");
        return "You found a crown on top of the dresser. You gained 40 points.";
    }

    @Override
    public String getDescription() {
        return "You are in a bedroom. There is a dresser to your left.";
    }
}
