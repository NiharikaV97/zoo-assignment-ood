package edu.neu.csye6200.Derived;

import edu.neu.csye6200.APIs.AnimalAPI;

public class Leopard extends AnimalAPI {
    
    public Leopard(String name){
        super(name);
    }

    @Override
    public String animalSound(){
        return "Leopard makes \"Sawing Sound\"\n";
    }

    @Override
    public String toString(){
        return "Concrete Leopard";
    }
}
