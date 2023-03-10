package com.pb.simonenko.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes {
    String name = "Шорты";
    @Override
    public void dressMan() {
        System.out.println("Название: Мужские "+name+";\nРазмер: "+Size.getDescription(this.size)+";\nЦвет: "+this.color+";\nСтоимость: "+this.cost+";");
    }

    @Override
    public void dressWomen() {
        System.out.println("Название: Женские "+name+";\nРазмер: "+Size.getDescription(this.size)+";\nЦвет: "+this.color+";\nСтоимость: "+this.cost+";");
    }
    public Pants(Size size,int cost,String color)
    {
        this.color=color;
        this.cost = cost;
        this.size = size;

    }
}