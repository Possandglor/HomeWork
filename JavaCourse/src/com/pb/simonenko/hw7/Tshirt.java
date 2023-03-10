package com.pb.simonenko.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {
    String name = "Футболка";
    @Override
    public void dressMan() {
        System.out.println("Название: Мужская "+name+";\nРазмер: "+Size.getDescription(this.size)+";\nЦвет: "+this.color+";\nСтоимость: "+this.cost+";");
    }

    @Override
    public void dressWomen() {
        System.out.println("Название: Женская "+name+";\nРазмер: "+Size.getDescription(this.size)+";\nЦвет: "+this.color+";\nСтоимость: "+this.cost+";");
    }

    public Tshirt(Size size,int cost,String color)
    {
        this.color=color;
        this.cost = cost;
        this.size = size;

    }
}
