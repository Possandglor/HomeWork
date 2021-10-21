package com.pb.simonenko.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int randomNum = random.nextInt(0,101);
        int countTry = 0;
        while(true)
        {

            System.out.println("Для окончания игры напишите Exit");
            System.out.print("Введите число: ");
            String reply = scan.next();
            countTry++;
            System.out.flush();
            if(reply.equals("Exit"))
                break;
            else if (Integer.parseInt(reply) < randomNum)
            {
                System.out.println("x > "+Integer.parseInt(reply));

            }
            else if (Integer.parseInt(reply) > randomNum)
            {
                System.out.println("x < "+Integer.parseInt(reply));

            }
            else {

                System.out.println("Угадано с "+countTry+" попытки!");
                break;
            }
        }
    }
}
