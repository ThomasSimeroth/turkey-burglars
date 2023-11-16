package com.levelup.forestsandmonsters;

import java.awt.Point;

public class Position {

    private Point coordinates;

    public Point getCoordinates() {
        return coordinates;
    }

    public Position(int xCoordinates, int YCoordinates) {
        this.coordinates = new Point();
        this.coordinates.setLocation(xCoordinates, YCoordinates);
    }
    
}
