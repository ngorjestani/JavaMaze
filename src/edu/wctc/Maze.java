package edu.wctc;

public class Maze {
    private Room currentRoom;
    private Player player;
    private boolean isFinished = false;

    public Maze(Player player) {
        this.player = player;
        Tunnel firstTunnel = new Tunnel("Tunnel one");
        Tunnel secondTunnel = new Tunnel("Tunnel two");
        firstTunnel.setNorth(secondTunnel);
        secondTunnel.setSouth(firstTunnel);
        currentRoom = firstTunnel;
    }

    public String exitCurrentRoom() {
        if (currentRoom instanceof Exit exitRoom) {
            isFinished = true;
            return exitRoom.exit(player);
        } else {
            return "This room is not an exit.";
        }
    }

    public String interactWithCurrentRoom() {
        if (currentRoom instanceof Interactable interactWithRoom) {
            return interactWithRoom.interact(player);
        } else {
            return "There is nothing to interact with.";
        }

    }

    public String lootCurrentRoom() {
        if (currentRoom instanceof Lootable lootRoom) {
            return lootRoom.loot(player);
        } else {
            return "There is nothing to loot here.";
        }
    }

    public boolean move(char dir) {
        if (currentRoom.isValidDirection(dir)) {
            currentRoom = currentRoom.getAdjoiningRoom(dir);
            return true;
        } else {
            return false;
        }
    }

    public int getPlayerScore() {
        return player.getScore();
    }

    public String getPlayerInventory() {
        return player.getInventory();
    }

    public String getCurrentRoomDescription()
}
