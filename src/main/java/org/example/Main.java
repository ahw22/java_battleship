package org.example;

public class Main {

    public static void main(String[] args) {
    final int boardSize = 10;
        Board board1 = new Board(boardSize, 1);
        Board board2 = new Board(boardSize, 2);
        board1.drawBoard();
    }
    /**
     * 1: There are 2 boards. Each board has a certain players ships. Each board as a square array of fields
     * 2: Each field has a state where it tracks whether it was shot at, and it tracks whether it has a ship associated with it
     *
     *
     */
}