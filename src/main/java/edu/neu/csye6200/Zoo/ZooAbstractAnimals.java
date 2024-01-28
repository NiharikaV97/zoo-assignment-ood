package edu.neu.csye6200.Zoo;

import java.util.ArrayList;

import edu.neu.csye6200.EnumAnimal;
import edu.neu.csye6200.APIs.AbstractAnimalAPI;
import edu.neu.csye6200.Derived.ElephantA;
import edu.neu.csye6200.Derived.LeopardA;
import edu.neu.csye6200.Derived.LionA;

public class ZooAbstractAnimals {
    
     public void showAnimals(){
        ArrayList<AbstractAnimalAPI> abstractAnimals= new ArrayList<>();
        abstractAnimals.add(new ElephantA(EnumAnimal.Elephant.getName()));
        abstractAnimals.add(new LeopardA(EnumAnimal.Leopard.getName()));
        abstractAnimals.add(new LionA(EnumAnimal.Lion.getName()));

        for (AbstractAnimalAPI animal: abstractAnimals){
            System.out.println(animal);
            System.out.println(animal.animalSound());
        }
    }

}
