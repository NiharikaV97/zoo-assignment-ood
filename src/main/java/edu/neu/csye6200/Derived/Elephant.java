package edu.neu.csye6200.Derived;

import edu.neu.csye6200.APIs.AnimalAPI;

public class Elephant extends AnimalAPI {
    public Elephant(String name){
        super(name);
    }

    @Override
    public String animalSound(){
        return "Elephant makes \"Trumpeting Sound\"\n";
    }

    @Override
    public String toString(){
        return "Concrete Elephant";
    }
}
