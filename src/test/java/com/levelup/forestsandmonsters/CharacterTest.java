package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

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
}
