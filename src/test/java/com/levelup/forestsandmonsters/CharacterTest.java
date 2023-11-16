package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

import java.awt.Point;

public class CharacterTest {

    @Test 
    public void characterHasName() {
        Character character = new Character();
        assertNotNull(character.getName());
    }

    @Test 
    public void characterHasDefaultName() {
        String defaultName = "Turkey Burglar";
        Character character = new Character();
        assertEquals(character.getName(),defaultName);
    }

    @Test
    public void characterCanChangeName() {
        String changedName = "Steve";
        Character character = new Character();
        character.setName(changedName);
        assertEquals(character.getName(),changedName);
    }
 
    @Test
    public void characterInitializeCustomName() {
        String customName = "Steve";
        Character character = new Character(customName);
        assertEquals(character.getName(),customName);
    }

    @Test 
    public void characterHasPosition() {
        Character character = new Character();
        assertNotNull(character.getPosition());
    }

    @Test 
    public void characterWithCustomNameHasPosition() {
        String customName = "Steve";
        Character character = new Character(customName);
        assertNotNull(character.getPosition());
    }

    @Test
    public void characterCanSetPosition() {
        Character character = new Character();
        int xCoordinates = 1;
        int YCoordinates = 2;
        Position position = new Position(xCoordinates, YCoordinates);
        character.setPosition(position);
        assertEquals(character.getPosition(),position);
    }

    @Test 
    public void characterCanEnterMap() {
        Character character = new Character();
        GameMap map = new GameMap();
        character.enterMap(map);
        assertEquals(character.getMap(),map);
    }

    @Test 
    public void characterCanMove() {
        Character character = new Character();
        Position currentPosition = new Position(20,45);
        Position newPosition = new Position(10,45);
        DIRECTION direction = DIRECTION.NORTH;
        FakeGameMap map = new FakeGameMap(newPosition,35,56);
        character.setPosition(currentPosition);
        character.enterMap(map);
        character.move(direction);
        assertEquals(character.getPosition(),newPosition);
    }

    @Test 
    public void characterHasMoveCount() {
        Character character = new Character();
        assertNotNull(character.getMoveCount());
    }

    @Test
    public void characterHasInitialMoveCountOfZero() {
        Character character = new Character();
        assertEquals(character.getMoveCount(),0);   
    }

    @Test
    public void characterWithCustomInitialNameHasMoveCountOfZero() {
        Character character = new Character("Brad");
        assertEquals(character.getMoveCount(),0);   
    }

    @Test 
    public void characterMoveCountIncreasesByOneWithMove() {
        Character character = new Character();
        Position currentPosition = new Position(20,45);
        Position newPosition = new Position(10,45);
        DIRECTION direction = DIRECTION.NORTH;
        FakeGameMap map = new FakeGameMap(newPosition,35,56);
        character.setPosition(currentPosition);
        character.enterMap(map);
        int currentMoveCount = character.getMoveCount();
        character.move(direction);
        assertEquals(character.getMoveCount(),currentMoveCount+1);
    }

    @Test
    public void characterHasStatus() {
        Character character = new Character();
        assertNotNull(character.getGameStatus());        
    }


}
