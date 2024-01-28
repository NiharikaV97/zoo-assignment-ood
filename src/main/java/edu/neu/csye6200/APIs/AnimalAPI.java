package edu.neu.csye6200.APIs;


public class AnimalAPI{
    private String name;
    // private String sound;
    
    public AnimalAPI(String name){
        this.name = name;
    }

    public String animalSound(){
        return "Animal Sound";
    }
    
    public String toString(){
        return "Animal API: " + name;
    }
}