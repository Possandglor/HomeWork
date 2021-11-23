package com.pb.simonenko.hw9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;

public class FileNumbers {
//    создает текстовый файл "numbers.txt" заполненный случайными целыми
//    числами от 1 до 99. 10 строк и по 10 чисел в каждой строке. Числа разделять пробелами.
    public static void createNumbersFile(String path) throws IOException {

        if(!Files.exists(Path.of(path)))
            Files.createFile(Path.of(path));
        String numbers = "";
        for(int i = 0; i<10;i++)
            numbers += (1+(int)(Math.random()*99))+" ";
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        writer.append(numbers.trim());
        System.out.println("Создан файл: "+Path.of(path).toAbsolutePath());
        System.out.println("Записана строка: "+numbers.trim());
        writer.close();
    }

    //        читает файл "numbers.txt", и создает на основе него новый файл "odd-numbers.txt" в
//        который входят все числа из "numbers.txt" только все четные заменены на 0.
    public static void createOddNumbersFile(String path,String oddpath) throws IOException {
        String numbers = Files.readString(Path.of(path)).trim();
        System.out.println("Считан файл: "+Path.of(path).toAbsolutePath());
        System.out.println("Считана строка: "+numbers);
        String oddNumbers = "";


        for (String val : numbers.split(" ")) {
            if(Integer.parseInt(val)%2==0)
                oddNumbers+="0 ";
            else oddNumbers+=val+" ";

        }
        oddNumbers = oddNumbers.trim();

        BufferedWriter writer = new BufferedWriter(new FileWriter(oddpath));
        writer.append(oddNumbers.trim());
        System.out.println("Создан файл: "+Path.of(oddpath).toAbsolutePath());
        System.out.println("Записана строка: "+oddNumbers);
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        String path = "numbers.txt";
        String oddPath = "odd-numbers.txt";
        createNumbersFile(path);
        createOddNumbersFile(path,oddPath);
    }


}
