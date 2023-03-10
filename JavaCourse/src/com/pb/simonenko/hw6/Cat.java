package com.pb.simonenko.hw6;

import java.util.Arrays;
import java.util.Objects;

public class Cat extends Animal{
    int tygydykCount=0;

    public int getTygydykCount() {
        return tygydykCount;
    }

    public void setTygydykCount(int tygydykCount) {
        this.tygydykCount = tygydykCount;
    }
    @Override
    public void makeNoize() {
        System.out.println("Котик говорит мяф");
    }

    @Override
    public void eat() {
        System.out.println("Котик кушоет");
        food+=10;
        System.out.println("Сытость: "+food);
    }

    @Override
    public void Run() {
        System.out.println("Котик сделал тыгыдык");
        tygydykCount++;
        System.out.println("Количество тыгыдыков: " + tygydykCount);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "food=" + food +
                ", location=" + Arrays.toString(location) +
                ", tygydykCount=" + tygydykCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return tygydykCount == cat.tygydykCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tygydykCount);
    }
}
