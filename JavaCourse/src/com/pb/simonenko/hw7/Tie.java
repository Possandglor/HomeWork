package com.pb.simonenko.hw7;

public class Tie extends Clothes implements ManClothes {
    String name = "Галстук";
    @Override
    public void dressMan() {
        System.out.println("Название: "+name+";\nРазмер: "+Size.getDescription(this.size)+";\nЦвет: "+this.color+";\nСтоимость: "+this.cost+";");
    }
    public Tie(Size size,int cost,String color)
    {
        this.color=color;
        this.cost = cost;
        this.size = size;

    }
}