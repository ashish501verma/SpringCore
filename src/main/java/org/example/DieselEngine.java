package org.example;

public class DieselEngine implements Engine{
    @Override
    public int Start() {
        System.out.println("Diesel Engine");
        return 1;
    }
}
