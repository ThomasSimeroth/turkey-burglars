package com.levelup.forestsandmonsters;

public class FakeValidationGameMap extends GameMap {
    @Override
    public boolean isPositionValid(Position position) {
        return false;
    }
}
