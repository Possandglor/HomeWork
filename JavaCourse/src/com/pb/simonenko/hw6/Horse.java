package com.pb.simonenko.hw6;

import java.util.Arrays;
import java.util.Objects;

public class Horse extends Animal{
    String whatATheHorseSay = "Hati Hati Hati Ho";
    int[] location = {0,0};

    public String getWhatATheHorseSay() {
        return whatATheHorseSay;
    }

    public void setWhatATheHorseSay(String whatATheHorseSay) {
        this.whatATheHorseSay = whatATheHorseSay;
    }

    @Override
    public void makeNoize() {
        System.out.println("Лошадка говорит "+whatATheHorseSay);
    }

    @Override
    public void eat() {
        System.out.println("Лошадка кушоет");
        food+=50;
        System.out.println("Сытость: "+food);
    }

    @Override
    public void Run() {
        System.out.println("Лошадка убежала");
        location[0]+=10;
        location[1]+=10;
        System.out.println("Текущее положение лошадки: ["+location[0]+":"+location[1]+"]");
    }

    @Override
    public String toString() {
        return "Horse{" +
                "whatATheHorseSay='" + whatATheHorseSay + '\'' +
                ", location=" + Arrays.toString(location) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return whatATheHorseSay.equals(horse.whatATheHorseSay) && Arrays.equals(location, horse.location);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(whatATheHorseSay);
        result = 31 * result + Arrays.hashCode(location);
        return result;
    }
}
