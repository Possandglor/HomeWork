package com.pb.simonenko.hw7;

public class Atelier {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new Tshirt(Size.XXS,100,"Red"),
                new Pants(Size.XS,200,"Blue"),
                new Skirt(Size.L,300,"Green"),
                new Tie(Size.M,400,"Yellow"),
                new Tshirt(Size.S,500,"Black"),
                new Pants(Size.XXS,600,"White"),
                new Skirt(Size.XS,700,"Purple"),
                new Tie(Size.L,800,"Brown"),
                new Tshirt(Size.M,900,"Pink"),
                new Pants(Size.S,1000,"Colorized"),
        };

        dressMan(clothes);
        dressWomen(clothes);

    }


    public static void dressMan(Clothes[] clothes)
    {
        for (Clothes cl: clothes
             ) {
            if(cl instanceof ManClothes)
            {
                ((ManClothes) cl).dressMan();
                System.out.println("\n");
            }
        }
    }

    public static void dressWomen(Clothes[] clothes)
    {
        for (Clothes cl: clothes
        ) {
            if(cl instanceof WomenClothes) {
                ((WomenClothes) cl).dressWomen();
                System.out.println("\n");
            }
        }
    }

}
