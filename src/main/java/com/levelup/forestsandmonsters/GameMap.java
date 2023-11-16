package com.levelup.forestsandmonsters;

import java.util.ArrayList;
import java.util.List;

public class GameMap {
    private int numPositions;
    private List<List<Position>> positions;

    public GameMap(){
        this.numPositions=100;
        this.positions = new ArrayList<>();
    }

    public GameMap(int size){
        this.numPositions=size*size;
    }

    public int getNumPositions() {
        return this.numPositions;
    }

    public List<List<Position>> getPoisitions() {
        return positions;
    }
}
