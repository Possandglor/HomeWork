package com.pb.simonenko.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scan.nextInt();
        if(number>=0&&number<=100) {
            if (number <= 14) {
                System.out.println("[0-14]");
            } else if (number < 36) {
                System.out.println("[15-35]");
            } else if (number < 51) {
                System.out.println("[36-50]");
            } else {
                System.out.println("[51-100]");
            }
        }
        else
        {
            System.out.println("Число не относится к промежутку [0-100]");
        }
    }
}
