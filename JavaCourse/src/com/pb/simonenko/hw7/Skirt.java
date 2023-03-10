package com.pb.simonenko.hw7;

public class Skirt extends Clothes implements WomenClothes {
    String name = "Юбка";

    @Override
    public void dressWomen() {
        System.out.println("Название: "+name+";\nРазмер: "+Size.getDescription(this.size)+";\nЦвет: "+this.color+";\nСтоимость: "+this.cost+";");
    }
    public Skirt(Size size,int cost,String color)
    {
        this.color=color;
        this.cost = cost;
        this.size = size;
    }
}
