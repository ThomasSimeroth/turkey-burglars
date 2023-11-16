package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
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

}
