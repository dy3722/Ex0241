package com.example.ex0241.ex1;

public class Tablet implements Chargeable{

    @Override
    public void charge() {
        System.out.println("The tablet is charging!");
    }

    public void play()
    {
        System.out.println("Playing in your favorite game!");
    }
}
