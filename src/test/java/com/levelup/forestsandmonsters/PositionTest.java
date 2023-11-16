package com.levelup.forestsandmonsters;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class PositionTest {

    @Test 
    public void positionHasCoordinates() {
        Position position = new Position(1, 9);
        assertNotNull(position.getX());
        assertNotNull(position.getY());
    }

    @Test 
    public void positionMatchesSetCoordinates() {
        int xCoordinates = 6;
        int YCoordinates = 4;
        Position position = new Position(xCoordinates,YCoordinates);
        assertEquals(xCoordinates, position.getX());
        assertEquals(YCoordinates, position.getY());
    }
    
}
