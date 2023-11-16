package com.levelup.forestsandmonsters;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.awt.Point;

import org.junit.Test;

public class PositionTest {

    @Test 
    public void positionHasCoordinates() {
        Position position = new Position(1, 9);
        assertNotNull(position.getCoordinates());
    }

    @Test 
    public void positionMatchesSetCoordinates() {
        int xCoordinates = 6;
        int YCoordinates = 4;
        Point point = new Point(xCoordinates,YCoordinates);
        Position position = new Position(xCoordinates,YCoordinates);
        assertEquals(position.getCoordinates(),point);
    }
    
}
