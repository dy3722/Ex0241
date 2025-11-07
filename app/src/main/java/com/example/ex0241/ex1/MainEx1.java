package com.example.ex0241.ex1;

public class MainEx1 {
    public static void main (String[] args)
    {
        Chargeable[] devices = new Chargeable[3];

        devices[0] = new Phone();
        devices[1] = new Tablet();
        devices[2] = new Laptop();

        for (Chargeable d : devices)
        {
            d.charge();
        }
    }
}
