package com.example.ex0241.ex2;

public class MainEx2 {
    public static void main (String[] args)
    {
        Playable[] instruments = new Playable[3];

        instruments[0] = new Guitar();
        instruments[1] = new Piano();
        instruments[2] = new Drum();

        for (Playable p : instruments)
        {
            p.play();
        }
    }
}
