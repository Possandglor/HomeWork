package com.pb.simonenko.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фразу: ");
        String str1 = scanner.nextLine();

        System.out.println(toUpperStr(str1));
    }
    static String toUpperStr(String str)
    {
        String[] strToChange = str.split(" ");
        String reply = "";
        for(int i = 0; i < strToChange.length;i++)
        {
            reply += firstUpperCase(strToChange[i])+" ";
        }
        return reply;
    }

    public static String firstUpperCase(String word)
    {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}
