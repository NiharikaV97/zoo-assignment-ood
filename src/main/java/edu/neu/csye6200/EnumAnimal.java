package edu.neu.csye6200;

public enum EnumAnimal {
    Elephant("Elephant"), Leopard("Leopard"), Lion("Lion");

    private final String name;

    private EnumAnimal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
