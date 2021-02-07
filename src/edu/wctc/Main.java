package edu.wctc;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Player newPlayer = new Player();
        Maze currentMaze = new Maze(newPlayer);

        while (!currentMaze.isFinished()) {
            System.out.println(currentMaze.getCurrentRoomDescription());
            System.out.println("The exits are: " + currentMaze.getCurrentRoomExits());
            System.out.println("i - Interact\nl - Loot\nv - Check inventory\nn - North\ns - South\ne - East\nw - West\nu - Up\nd - Down\nx - Exit");
            char resp = keyboard.next().charAt(0);
            switch (resp) {
                case 'i' -> System.out.println(currentMaze.interactWithCurrentRoom());
                case 'l' -> System.out.println(currentMaze.lootCurrentRoom());
                case 'v' -> System.out.println(currentMaze.getPlayerInventory());
                case 'x' -> System.out.println(currentMaze.exitCurrentRoom());
                case 'n', 's', 'e', 'w', 'u', 'd' -> {
                    if (!currentMaze.move(resp)) {
                        System.out.println("You can't move that direction");
                    }
                }
                default -> System.out.println("That is not a valid option.");
            }
        }
    }
}
