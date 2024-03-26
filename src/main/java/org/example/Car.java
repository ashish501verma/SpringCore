package org.example;

public class Car {


    Engine engine;

    Car(){
        System.out.println("car Constructor");
    }
    public Car(Engine engine) {
        System.out.println("Car Class 1 Arg constructor");
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        System.out.println("Setter Engine");
        this.engine = engine;
    }
    public void drive(){

        int res = engine.Start();
        if(res==1){

            System.out.println("Engine Started");
        }else{
            System.out.println("Engine not Started.");
        }

    }

}
