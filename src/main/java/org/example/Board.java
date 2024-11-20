package org.example;

import java.util.LinkedList;
import java.util.Random;

public class Board {
    private final int boardSize;
    private Field[][] fields;
    private final int player; //who it belongs to
    private LinkedList<Ship> ships; //ships on the board

    public Board(int boardSize, int player) {
        this.boardSize = boardSize;
        this.player = player;
        this.fields = new Field[boardSize][boardSize];
        initFields();
    }

    private void initFields() {
        for (int i = 0; i < fields.length; i++) {
            for (int j = 0; j < fields[i].length; j++) {
                fields[i][j] = new Field();
            }
        }
    }

    private void setShipsRandom() {
        // 1 carrier, 2 battleships , 3 destroyers, 4 subs = 30 fields
        // ships can be placed vertically or horizontally.
        // ships cannot be adjacent to each other in the vertical and horizontal. Diagonal is allowed.
        Random rand = new Random();


    }

    public void drawBoard() {
        int i = 0;
        System.out.println("   A B C D E F G H I J");
        for (Field[] row : fields) {
            System.out.print(i + " |");
            for (Field field : row) {
                System.out.print(field.toString(player) + "|");
            }
            System.out.println();
            i++;
        }
    }

    //returns null if not able to parse coordinates
    private int[] coordinatesToIndices(String coordinates) {
        String columns = "ABCDEFGHIJ";




        return null;
    }

}
