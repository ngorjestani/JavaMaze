package edu.wctc;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player newPlayer = new Player();
        Maze currentMaze = new Maze(newPlayer);

        while (!currentMaze.isFinished()) {
            Scanner keyboard = new Scanner(System.in);

            System.out.println(currentMaze.getCurrentRoomDescription());
            System.out.println("The exits are: " + currentMaze.getCurrentRoomExits());
            System.out.println("i - Interact\nl - Loot\nv - Check inventory\nn - North\ns - South\ne - East\nw - West\nu - Up\nd - Down");
            char resp = keyboard.next().charAt(0);
            switch (resp) {
                case 'i':
                    currentMaze.interactWithCurrentRoom();
                case 'l':
                    currentMaze.lootCurrentRoom();
                case 'v':
                    currentMaze.getPlayerInventory();
                case 'n':
                case 's':
                case 'e':
                case 'w':
                case 'u':
                case 'd':
                    currentMaze.move(resp);
                default:
                    System.out.println("That is not a valid option.");
            }
        }
    }
}
