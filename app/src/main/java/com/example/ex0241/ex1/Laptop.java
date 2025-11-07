package com.example.ex0241.ex1;

public class Laptop implements Chargeable{
    @Override
    public void charge() {
        System.out.println("The laptop is charging!");
    }

    public void toType()
    {
        System.out.println("Typing!");
    }
}
