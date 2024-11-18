package org.example;

public class Ship {
    private int HP;
    private final int size;
    private final int player;
    private final String[] positions; //e. g. "A3" "H4"

    public Ship(int size, int player, String[] positions) {
        this.size = size;
        this.HP = size;
        this.player = player;
        this.positions = positions;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getHP() {
        return HP;
    }

    public int getSize() {
        return size;
    }

    public int getPlayer() {
        return player;
    }

    public String[] getPositions() {
        return positions;
    }

    /**
     * Three types of ship depending on length.
     *
     * size 2: Submarine S
     * size 3: Destroyer D
     * size 4: Battleship B
     * Size 5: Carrier C
     */
}
