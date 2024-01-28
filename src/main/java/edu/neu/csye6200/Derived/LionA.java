package edu.neu.csye6200.Derived;

import edu.neu.csye6200.APIs.AbstractAnimalAPI;

public class LionA extends AbstractAnimalAPI {
    
    public LionA(String name){
        super(name);
    }
    
    @Override
    public String animalSound(){
        return "Lion makes \"Roar Sound\"\n";
    }

    @Override
    public String toString(){
        return "Abstract Lion";
    }
}
