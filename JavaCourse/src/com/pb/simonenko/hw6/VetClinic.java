package com.pb.simonenko.hw6;

public class VetClinic {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Animal[] animals = {new Cat(), new Dog(), new Horse(), new Cat(), new Dog(), new Horse()};
        Class veterinarian = Class.forName("com.pb.simonenko.hw6.Veterinarian");
        Object vet = veterinarian.newInstance();
        Veterinarian obj = (Veterinarian) vet;
        for(int i = 0; i<animals.length;i++)
        {
            obj.treatAnimal(animals[i]);
            animals[i].makeNoize();
            animals[i].Run();
            animals[i].eat();

            System.out.println(animals[i].toString());
        }
    }
}

