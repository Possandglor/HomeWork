package com.pb.simonenko.hw10;

public class Main {
    public static void main(String[] args) {

        NumBox<Integer> intBox = new NumBox<Integer>(10);
        NumBox<Float> floatBox = new NumBox<Float>(10);
        System.out.println("Integer: ");
        for(int i = 12; i<33;i=i+2)
            intBox.add(i);

        System.out.println("max: "+intBox.max()+"");
        System.out.println("average: "+intBox.average()+"");
        System.out.println("get(4): "+intBox.get(4)+"");

        System.out.println("\nFloat: ");

        for(float i = 20F; i<42F;i=i+2)
            floatBox.add(i);

        System.out.println("max: "+floatBox.max()+"");
        System.out.println("average: "+floatBox.average()+"");
        System.out.println("get(3): "+floatBox.get(3)+"");


    }
}
