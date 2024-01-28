package edu.neu.csye6200.Derived;

import edu.neu.csye6200.APIs.AbstractAnimalAPI;

public class LeopardA extends AbstractAnimalAPI {
    
    public LeopardA(String name){
        super(name);
    }

    @Override
    public String animalSound(){
        return "Leopard makes \"Sawing Sound\"\n";
    }

    @Override
    public String toString(){
        return "Abstract Leopard";
    }
}
