package edu.neu.csye6200.Zoo;

import java.util.ArrayList;

import edu.neu.csye6200.EnumAnimal;
import edu.neu.csye6200.APIs.AnimalAPI;
import edu.neu.csye6200.Derived.Elephant;
import edu.neu.csye6200.Derived.Leopard;
import edu.neu.csye6200.Derived.Lion;

public class ZooAnimals {

    public void showAnimals(){
        ArrayList<AnimalAPI> concreteAnimals= new ArrayList<>();
        concreteAnimals.add(new Elephant(EnumAnimal.Elephant.getName()));
        concreteAnimals.add(new Leopard(EnumAnimal.Leopard.getName()));
        concreteAnimals.add(new Lion(EnumAnimal.Lion.getName()));

        for (AnimalAPI animal: concreteAnimals){
            System.out.println(animal);
            System.out.println(animal.animalSound());
        }
    }
    
}
