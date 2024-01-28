package edu.neu.csye6200.Zoo;

import java.util.ArrayList;

import edu.neu.csye6200.APIs.AnimalisticAPI;
import edu.neu.csye6200.Derived.ElephantI;
import edu.neu.csye6200.Derived.LeopardI;
import edu.neu.csye6200.Derived.LionI;

public class ZooAnamalisticAnimals {
    
    public void showAnimals(){
        ArrayList<AnimalisticAPI> interfaceAnimals= new ArrayList<>();
        interfaceAnimals.add(new ElephantI());
        interfaceAnimals.add(new LeopardI());
        interfaceAnimals.add(new LionI());

        for (AnimalisticAPI animal: interfaceAnimals){
            System.out.println(animal);
            System.out.println(animal.animalSound());
        }
    }
}