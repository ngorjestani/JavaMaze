package edu.wctc;

public class Maze {
    private Room currentRoom;
    private Player player;
    private boolean isFinished = false;

    public Maze(Player player) {
        this.player = player;
        Tunnel firstTunnel = new Tunnel("Entrance tunnel");
        Basement basement = new Basement("Basement");
        Closet closet = new Closet("Closet");
        BasementRoom basementSecondRoom = new BasementRoom("Second room in basement");
        Bedroom bedroom = new Bedroom("West bedroom");
        Hallway hallway = new Hallway("Long hallway");
        Stairwell stairwell = new Stairwell("Stairwell to exit");
        firstTunnel.setDown(basement);
        basement.setUp(firstTunnel);
        basement.setWest(basementSecondRoom);
        basementSecondRoom.setEast(basement);
        firstTunnel.setEast(closet);
        closet.setWest(firstTunnel);
        firstTunnel.setWest(bedroom);
        bedroom.setEast(firstTunnel);
        bedroom.setDown(basementSecondRoom);
        basementSecondRoom.setUp(bedroom);
        currentRoom = firstTunnel;
        firstTunnel.setNorth(hallway);
        hallway.setSouth(firstTunnel);
        hallway.setNorth(stairwell);
        stairwell.setSouth(hallway);
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

    public String getCurrentRoomDescription() {
        return currentRoom.getDescription();
    }

    public String getCurrentRoomExits() {
        return currentRoom.getExits();
    }

    public boolean isFinished() {
        return isFinished;
    }
}
