package edu.neu.csye6200.Derived;

import edu.neu.csye6200.APIs.AnimalAPI;

public class Lion extends AnimalAPI {
    
    public Lion(String name){
        super(name);
    }

    @Override
    public String animalSound(){
        return "Lion makes \"Roar Sound\"\n";
    }

    @Override
    public String toString(){
        return "Concrete Lion";
    }
}
