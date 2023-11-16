package com.levelup.forestsandmonsters;

import java.awt.Point;

public class Position {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Position(int xCoordinates, int YCoordinates) {
        this.x = xCoordinates;
        this.y = YCoordinates;
    }
    
    @Override
    public boolean equals(Object other) {
        if(other == this) {
            return true;
        }

        if(!(other instanceof Position)) {
            return false;
        }

        Position otherPosition = (Position) other;

        if(this.x == otherPosition.getX() && this.y == otherPosition.getY()) {
            return true;
        } else {
            return false;
        }
    }
}
