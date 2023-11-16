package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;

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
        List<List<Position>> positionList = new ArrayList<>();
        Position testPoint =new Position(0, 9);
        GameMap gamemap = new GameMap();
        assertEquals(positionList, gamemap.getPoisitions());
    }
}
