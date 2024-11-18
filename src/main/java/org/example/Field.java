package org.example;

public class Field {
    private String state; // hit, miss or none
    private Ship ship; //ship that has a part of it inside this field

    public Field() {
        this.state = "~";
        this.ship = null;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public String toString(int player) {
        switch (state) {
            case "miss": {
                return "o";
            }
            case "hit": {
                return "X";
            }
            default: {
                return "~";
            }
        }
    }
}

