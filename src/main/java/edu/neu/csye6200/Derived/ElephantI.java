package edu.neu.csye6200.Derived;

import edu.neu.csye6200.APIs.AnimalisticAPI;

public class ElephantI implements AnimalisticAPI{
    
    @Override
    public String animalSound(){
        return "Elephant makes \"Trumpeting Sound\"\n";
    }

    @Override
    public String toString(){
        return "Interface Elephant";
    }
}
