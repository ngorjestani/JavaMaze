package edu.wctc;

public class Tunnel extends Room implements Lootable {

    public Tunnel(String name) {
        super(name);
    }

    @Override
    public String loot(Player player) {
        player.addToInventory("Sword");
        return "You picked up a sword";
    }

    @Override
    public String getDescription() {
        return "The tunnel is dark and musty. Something shiny is glistening in the corner";
    }
}
