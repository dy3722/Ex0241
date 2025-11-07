package com.example.ex0241.ex2;

public class Drum implements Playable{
    @Override
    public void play() {
        System.out.println("The drum is playing!");
    }

    public void putOnHead()
    {
        System.out.println("The drum on your head!");
    }
}
