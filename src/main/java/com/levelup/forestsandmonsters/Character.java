package com.levelup.forestsandmonsters;

public class Character {
    
    private String DEFAULT_NAME = "Turkey Burglar";
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character() {
        this.name = DEFAULT_NAME;
    }

    public Character(String name) {
        this.name = name;
    }
}
