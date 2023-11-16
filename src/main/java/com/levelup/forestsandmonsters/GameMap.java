package com.levelup.forestsandmonsters;

import java.util.ArrayList;
import java.util.List;

public class GameMap {
    private int numPositions;
    private List<List<Position>> positions;

    public GameMap(){
        this.numPositions=100;
        this.positions = makePositions(10, 10);
    }

    public GameMap(int numRows, int numColumns){
        this.numPositions=numRows*numColumns;
        this.positions = makePositions(numRows, numColumns);
    }

    public List<List<Position>> makePositions(int numRows, int numColumns) {
        List<List<Position>> positions = new ArrayList<>();

        for(int i = 0; i < numRows * numColumns; i++) {
            Position newPosition = new Position(3, 8);
            List<Position> row = new ArrayList<>();
            row.add(newPosition);
            positions.add(row);
        }
        return positions;
    }

    public int getNumPositions() {
        return this.numPositions;
    }

    public List<List<Position>> getPositions() {
        return positions;
    }
}
