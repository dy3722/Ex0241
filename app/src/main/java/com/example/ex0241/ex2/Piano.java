package com.example.ex0241.ex2;

public class Piano implements Playable{
    @Override
    public void play() {
        System.out.println("The piano is playing!");
    }

    public void playDO()
    {
        System.out.println("The piano is playing DO!");
    }
}
