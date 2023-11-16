package com.levelup.forestsandmonsters;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class PositionTest {

    @Test 
    public void positionHasCoordinates() {
        Position position = new Position(1, 9);
        assertNotNull(position.getCoordinates());
    }
    
}
