package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;

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
        Position testPoint =new Position();
        GameMap gamemap = new GameMap();
        assertEquals(point, gamemap.getPoisitions());
    }
}
