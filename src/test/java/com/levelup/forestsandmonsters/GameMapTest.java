package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GameMapTest {
    @Test
    public void mapHasDefaultPositionsOf100(){
        GameMap gamemap = new GameMap();
        assertEquals(100,gamemap.getNumPositions());
    }

    @Test
    public void mapHasProvidedPositions() {
        GameMap gamemap = new GameMap(6);
        assertEquals(36, gamemap.getNumPositions());
    }

    @Test
    public void graphCoordinates(){
        GameMap gamemap = new GameMap();
        assertNotNull(gamemap.getPositions());
    }

    @Test
    public void defaultMapHasOneHundredPositions() {
        int numPositions = 100;
        GameMap gameMap = new GameMap();
        assertEquals(numPositions, gameMap.getPositions().size());
    }
}
