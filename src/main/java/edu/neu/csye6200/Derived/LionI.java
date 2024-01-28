package edu.neu.csye6200.Derived;

import edu.neu.csye6200.APIs.AnimalisticAPI;

public class LionI implements AnimalisticAPI{
    @Override
    public String animalSound(){
        return "Lion makes \"Roar Sound\"\n";
    }

    @Override
    public String toString(){
        return "Interface Lion";
    }
}
