package edu.wctc;

public class Tunnel extends Room implements Lootable {

    public Tunnel(String name) {
        super(name);
    }

    @Override
    public String loot(Player player) {
        player.addToInventory("Sword");
        player.addToScore(20);
        return "You picked up a sword. It has been added to your inventory and you have received 20 points.";
    }

    @Override
    public String getDescription() {
        return "The tunnel is dark and musty. Something shiny is glistening in the corner";
    }
}
