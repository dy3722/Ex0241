package com.example.ex0241.ex2;

public class Guitar implements Playable{
    @Override
    public void play() {
        System.out.println("The guitar is playing!");
    }

    public void throwOnBadGuy()
    {
        System.out.println("The guitar is threw, bye bye guy!");
    }
}
