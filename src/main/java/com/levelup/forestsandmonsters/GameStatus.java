package com.levelup.forestsandmonsters;

public class GameStatus {
    private String DEFAULT_CHARACTER_NAME;
    
    // TODO: Add other status data
    public String characterName = DEFAULT_CHARACTER_NAME;
    public Position currentPosition = null;
    // TODO: Write a failing unit test that will force you to set this to the right number
    public int moveCount = -100;
}