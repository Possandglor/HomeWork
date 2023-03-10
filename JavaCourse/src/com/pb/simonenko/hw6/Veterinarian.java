package com.pb.simonenko.hw6;

public class Veterinarian {
    public void treatAnimal(Animal animal)
    {
        System.out.println("------------");
        System.out.println("Новое животное: "+animal.getClass().getName());
        System.out.println("Сытость животного: "+animal.food);
        System.out.println("Положение животного: ["+animal.location[0]+":"+animal.location[1]+"]");
        System.out.println("Прием окончен");
    }

    public Veterinarian()
    {

    }
}
