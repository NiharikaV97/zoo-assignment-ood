package edu.neu.csye6200.Zoo;

import java.util.ArrayList;

import edu.neu.csye6200.APIs.AbstractAnimalAPI;
import edu.neu.csye6200.APIs.AnimalAPI;
import edu.neu.csye6200.APIs.AnimalisticAPI;
import edu.neu.csye6200.Derived.Elephant;
import edu.neu.csye6200.Derived.ElephantA;
import edu.neu.csye6200.Derived.ElephantI;
import edu.neu.csye6200.Derived.Leopard;
import edu.neu.csye6200.Derived.LeopardA;
import edu.neu.csye6200.Derived.LeopardI;
import edu.neu.csye6200.Derived.Lion;
import edu.neu.csye6200.Derived.LionA;
import edu.neu.csye6200.Derived.LionI;

public class ZooObjectAnimals{

    public void showAnimals(){
        
        ArrayList<Object> concreteAnimals = new ArrayList<>();
        concreteAnimals.add(new Elephant("Elephant"));
        concreteAnimals.add(new Leopard("Leopard"));
        concreteAnimals.add(new Lion("Lion"));

        for (Object animal: concreteAnimals){
            System.out.println(animal);
            System.out.println(((AnimalAPI) animal).animalSound());
        }

        ArrayList<Object> abstractAnimals = new ArrayList<>();
        abstractAnimals.add(new ElephantA("Elephant"));
        abstractAnimals.add(new LeopardA("Leopard"));
        abstractAnimals.add(new LionA("Lion"));

        for (Object animal: abstractAnimals){
            System.out.println(animal);
            System.out.println(((AbstractAnimalAPI) animal).animalSound());
        }


        ArrayList<Object> interfaceAnimals = new ArrayList<>();
        interfaceAnimals.add(new ElephantI());
        interfaceAnimals.add(new LeopardI());
        interfaceAnimals.add(new LionI());

        for (Object animal: interfaceAnimals){
            System.out.println(animal);
            System.out.println(((AnimalisticAPI) animal).animalSound());
        }
        
    }   

}