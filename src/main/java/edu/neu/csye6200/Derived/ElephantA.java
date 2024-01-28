package edu.neu.csye6200.Derived;

import edu.neu.csye6200.APIs.AbstractAnimalAPI;

public class ElephantA extends AbstractAnimalAPI {
    public ElephantA(String name){
        super(name);
    }

    @Override
    public String animalSound(){
        return "Elephant makes \"Trumpeting Sound\"\n";
    }

    @Override
    public String toString(){
        return "Abstract Elephant";
    }
}
