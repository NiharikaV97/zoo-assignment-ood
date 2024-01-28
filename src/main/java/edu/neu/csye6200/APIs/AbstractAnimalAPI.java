package edu.neu.csye6200.APIs;

public abstract class AbstractAnimalAPI{
    private String name;

    public AbstractAnimalAPI(String name){
        this.name = name;
    }

    public abstract String animalSound();

    @Override
    public String toString() {
        return "AbstractAnimalAPI: " + name;
    }
}