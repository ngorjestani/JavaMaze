package edu.wctc;

public abstract class Room {
    private String name;
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private Room up;
    private Room down;

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public void setUp(Room up) {
        this.up = up;
    }

    public void setDown(Room down) {
        this.down = down;
    }

    public Room(String name) {
        this.name = name;
    }

    public abstract String getDescription();

    public Room getAdjoiningRoom(char dir) {
        if (isValidDirection(dir)) {
            switch (dir) {
                case 'n':
                    return north;
                break;
                case 's':
                    return south;
                break;
                case 'e':
                    return east;
                break;
                case 'w':
                    return west;
                break;
                case 'u':
                    return up;
                break;
                case 'd':
                    return down;
                break;
            }
        } else {
            return null;
        }
    }

    public String getExits() {

    }

    public String getName() {
        return name;
    }

    public boolean isValidDirection(char dir) {
        switch (dir) {
            case 'n':
                return north != null;
                break;
            case 's':
                return south != null;
                break;
            case 'e':
                return east != null;
                break;
            case 'w':
                return west != null;
                break;
            case 'u':
                return up != null;
                break;
            case 'd':
                return down != null;
                break;
        }
    }
}
