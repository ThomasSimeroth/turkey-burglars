package com.levelup.forestsandmonsters;

public class GameMap {
    private int numPositions;

    public GameMap(){
        this.numPositions=100;
    }

    public GameMap(int size){
        this.numPositions=size*size;
    }

    public int getNumPositions() {
        return this.numPositions;
    }
}
