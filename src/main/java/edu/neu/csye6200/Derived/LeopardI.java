package edu.neu.csye6200.Derived;

import edu.neu.csye6200.APIs.AnimalisticAPI;

public class LeopardI implements AnimalisticAPI {
    @Override
    public String animalSound(){
        return "Leopard makes \"Sawing Sound\"\n";
    }

    @Override
    public String toString(){
        return "Interface Leopard";
    }
}
