package com.pb.simonenko.hw6;

public class Animal {
    protected int food=0;
    protected int[] location={0,0};


    public void makeNoize()
    {
        System.out.println("Животное издает звуки");
        System.out.println("Голод растет");
        food-=10;

    }

    public void eat()
    {
        System.out.println("Животное ест");
        food+=10;
    }
    public void sleep()
    {
        System.out.println("Животное спит");
    }

    public void Run()
    {
        location[0]+=10;
        System.out.println("Животное двигается");

    }
}
