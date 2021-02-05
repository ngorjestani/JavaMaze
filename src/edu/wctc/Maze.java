package edu.wctc;

public class Maze {
    private Room currentRoom;
    private Player player;
    private boolean isFinished = false;

    public Maze(Player player) {
        this.player = player;
        Tunnel firstTunnel = new Tunnel("Tunnel one");
        Tunnel secondTunnel = new Tunnel("Tunnel two");
        firstTunnel.setNorth(secondtunnel);
        secondTunnel.setSouth(firstTunnel);
        currentRoom = firstTunnel;
    }

    public String exitCurrentRoom() {
        if (currentRoom instanceof Exit exitRoom) {
            isFinished = true;
            return exitRoom.exit(player);
        } else {
            return "This room is not an exit";
        }
    }

    public String interactWithCurrentRoom() {

    }

    public String lootCurrentRoom() {

    }

    public boolean move(char dir) {
        if (currentRoom.isValidDirection(dir)) {
            currentRoom = currentRoom.getAdjoiningRoom(dir);
        }
    }

    public int getPlayerScore() {
        return player.getScore();
    }

    public String getPlayerInventory() {
        return player.getInventory();
    }
}
