package com.pb.simonenko.hw6;

import java.util.Objects;

public class Dog extends Animal{
    int woofPower = 10;
    public int getWoofPower(){
        return woofPower;
    }
    public void setWoofPower(int power)
    {
        woofPower=power;
    }

    @Override
    public void makeNoize() {
        System.out.println("Собака говорит гав с громкостью "+woofPower+" децибел");
    }

    @Override
    public void eat() {
        System.out.println("Собака кушоет");
        food+=20;
        System.out.println("Сытость: "+food);
    }


    @Override
    public String toString() {
        return "Dog{" +
                "woofPower=" + woofPower +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return woofPower == dog.woofPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(woofPower);
    }
}
