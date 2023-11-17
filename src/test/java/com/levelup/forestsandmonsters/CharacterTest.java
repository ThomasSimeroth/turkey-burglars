package com.levelup.forestsandmonsters;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;

public class CharacterTest {

    private final String DEFAULT_CHARACTER_NAME = "Turkey Burglar";
    private Character DEFAULT_CHARACTER;
    private final String DEFAULT_CUSTOM_CHARACTER_NAME = "Thomas";
    private Character DEFAULT_CHARACTER_WITH_CUSTOM_NAME;
    private final String DEFAULT_CHANGED_CHARACTER_NAME = "Andrew";
    private final int DEFAULT_X_COORDINATE_START = 1;
    private final int DEFAULT_Y_COORDINATE_START = 2;
    private final Position DEFAULT_POSITION_START = new Position(DEFAULT_Y_COORDINATE_START, DEFAULT_X_COORDINATE_START);
    private final int DEFAULT_X_COORDINATE_END = 35;
    private final int DEFAULT_Y_COORDINATE_END = 47;
    private final Position DEFAULT_POSITION_END = new Position(DEFAULT_Y_COORDINATE_END, DEFAULT_X_COORDINATE_END);
    private FakeGameMap DEFAULT_GAME_MAP;
    private final int DEFAULT_MOVE_COUNT = 324;

    @Before
    public void setupTestCharacter() {
        DEFAULT_CHARACTER = new Character();
        DEFAULT_CHARACTER_WITH_CUSTOM_NAME = new Character(DEFAULT_CUSTOM_CHARACTER_NAME);
        GameMap DEFAULT_GAME_MAP = new FakeGameMap(DEFAULT_POSITION_END,35,56);;
    }

    @Test 
    public void defaultCharacterHasName() {
        assertNotNull(DEFAULT_CHARACTER.getName());
    }

    @Test 
    public void defaultCharacterWithCustomNameHasName() {
        assertNotNull(DEFAULT_CHARACTER_WITH_CUSTOM_NAME.getName());
    }

    @Test 
    public void defaultCharacterHasDefaultName() {
        assertEquals(DEFAULT_CHARACTER.getName(),DEFAULT_CHARACTER_NAME);
    }

    @Test
    public void characterCanChangeName() {
        DEFAULT_CHARACTER.setName(DEFAULT_CHANGED_CHARACTER_NAME);
        assertEquals(DEFAULT_CHARACTER.getName(),DEFAULT_CHANGED_CHARACTER_NAME);
    }
 
    @Test
    public void canCharacterInitializeCustomName() {
        assertEquals(DEFAULT_CHARACTER_WITH_CUSTOM_NAME.getName(),DEFAULT_CUSTOM_CHARACTER_NAME);
    }

    @Test 
    public void defaultCharacterHasPosition() {
        assertNotNull(DEFAULT_CHARACTER.getPosition());
    }

    @Test 
    public void defaultCharacterWithCustomNameHasPosition() {
        assertNotNull(DEFAULT_CHARACTER_WITH_CUSTOM_NAME.getPosition());
    }

    @Test
    public void characterCanSetPosition() {
        DEFAULT_CHARACTER.setPosition(DEFAULT_POSITION_START);
        assertEquals(DEFAULT_CHARACTER.getPosition(),DEFAULT_POSITION_START);
    }

    @Test 
    public void characterCanEnterMap() {
        DEFAULT_CHARACTER.enterMap(DEFAULT_GAME_MAP);
        assertEquals(DEFAULT_CHARACTER.getMap(),DEFAULT_GAME_MAP);
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
    public void canSetMoveCount() {
        DEFAULT_CHARACTER.setMoveCount(DEFAULT_MOVE_COUNT);
        assertEquals(DEFAULT_CHARACTER.getMoveCount(),DEFAULT_MOVE_COUNT);
    }

}
