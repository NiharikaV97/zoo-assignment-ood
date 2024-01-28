package edu.neu.csye6200;

import edu.neu.csye6200.Zoo.ZooAbstractAnimals;
import edu.neu.csye6200.Zoo.ZooAnamalisticAnimals;
import edu.neu.csye6200.Zoo.ZooAnimals;
import edu.neu.csye6200.Zoo.ZooObjectAnimals;

/**
 * 
 * @author Ruchika Sharma
 * 
 */

public class Driver {
	public static void main(String[] args) {
		System.out.println("============Main Execution Start===================\n\n");

         //Add your code in between these two print statements
		System.out.println("------- Implemented Concrete Class -------");
    	ZooAnimals zooAnimal = new ZooAnimals();
    	zooAnimal.showAnimals();
		System.out.println();

		System.out.println("------- Implemented  Abstract Class -------");
    	ZooAbstractAnimals zooAbstractAnimal = new ZooAbstractAnimals();
    	zooAbstractAnimal.showAnimals();
		System.out.println();

		System.out.println("------- Implemented Interface Class -------");
		ZooAnamalisticAnimals zooAnamalisticAnimal = new ZooAnamalisticAnimals();
		zooAnamalisticAnimal.showAnimals();
		System.out.println();

		System.out.println("------- Implemented Object Class -------");
		ZooObjectAnimals zooObjectAnimal = new ZooObjectAnimals();
		zooObjectAnimal.showAnimals();
		 
		System.out.println("\n\n============Main Execution End===================");
	}

}
