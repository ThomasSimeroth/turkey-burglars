package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

import java.awt.Point;

public class FakeCharacterTest {

    @Test 
    public void FakeCharacterHasName() {
        FakeCharacter FakeCharacter = new FakeCharacter();
        assertNotNull(FakeCharacter.getName());
    }

    @Test 
    public void FakeCharacterHasDefaultName() {
        String defaultName = "Turkey Burglar";
        FakeCharacter FakeCharacter = new FakeCharacter();
        assertEquals(FakeCharacter.getName(),defaultName);
    }

    @Test
    public void FakeCharacterCanChangeName() {
        String changedName = "Steve";
        FakeCharacter FakeCharacter = new FakeCharacter();
        FakeCharacter.setName(changedName);
        assertEquals(FakeCharacter.getName(),changedName);
    }
 
    @Test
    public void FakeCharacterInitializeCustomName() {
        String customName = "Steve";
        FakeCharacter FakeCharacter = new FakeCharacter(customName);
        assertEquals(FakeCharacter.getName(),customName);
    }

    @Test 
    public void FakeCharacterHasPosition() {
        FakeCharacter FakeCharacter = new FakeCharacter();
        assertNotNull(FakeCharacter.getPosition());
    }

    @Test 
    public void FakeCharacterWithCustomNameHasPosition() {
        String customName = "Steve";
        FakeCharacter FakeCharacter = new FakeCharacter(customName);
        assertNotNull(FakeCharacter.getPosition());
    }

    @Test
    public void FakeCharacterCanSetPosition() {
        FakeCharacter FakeCharacter = new FakeCharacter();
        int xCoordinates = 1;
        int YCoordinates = 2;
        Position position = new Position(xCoordinates, YCoordinates);
        FakeCharacter.setPosition(position);
        assertEquals(FakeCharacter.getPosition(),position);
    }

    @Test 
    public void FakeCharacterCanEnterMap() {
        FakeCharacter FakeCharacter = new FakeCharacter();
        GameMap map = new GameMap();
        FakeCharacter.enterMap(map);
        assertEquals(FakeCharacter.getMap(),map);
    }

    @Test 
    public void FakeCharacterCanMove() {
        FakeCharacter FakeCharacter = new FakeCharacter();
        Position currentPosition = new Position(20,45);
        Position newPosition = new Position(10,45);
        DIRECTION direction = DIRECTION.NORTH;
        FakeGameMap map = new FakeGameMap(newPosition,35,56);
        FakeCharacter.setPosition(currentPosition);
        FakeCharacter.enterMap(map);
        FakeCharacter.move(direction);
        assertEquals(FakeCharacter.getPosition(),newPosition);
    }
}
