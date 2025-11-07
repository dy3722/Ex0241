package com.example.ex0241.ex1;

public class Phone implements Chargeable{
    @Override
    public void charge() {
        System.out.println("The phone is charging!");
    }

    public void call()
    {
        System.out.println("Calling!");
    }
}
