package org.example;

public class PetrolEngine implements  Engine{

    PetrolEngine(){
        System.out.println("Petrol Engine Constructor");

    }    @Override
    public int Start() {
        System.out.println("Petrol Engine Start.");
        return 1;
    }
}
