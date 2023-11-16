package com.levelup.forestsandmonsters;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class FakeGameMap extends GameMap {

    Position weightedPosition;

    public FakeGameMap(Position weightedPosition, int numRows, int numColumns) {
        super(numRows, numColumns);
        this.weightedPosition = weightedPosition;
    }

    //@Override
    public Position calculatePosition(Position startingPosition, DIRECTION direction) {
        return weightedPosition;
    }
    
}
