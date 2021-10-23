package com.pb.simonenko.hw4;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую фразу: ");
        String str1 = scanner.nextLine();
        System.out.println("Введите вторую фразу: ");
        String str2 = scanner.nextLine();
        if (SortStr(str1).equals(SortStr(str2)))
            System.out.println("Это анаграмма");
        else System.out.println("Это не анаграмма");
    }

    static String SortStr(String str) {
        char[] strchar1 = str.toLowerCase().replaceAll("[^\\da-zA-Zа-яёА-ЯЁ]", "").toCharArray();
        for(int i = 1; i<strchar1.length;i++)
        {
            for(int j = 0; j<i;j++)
            {
                if(strchar1[i]<strchar1[j])
                {
                    char a = strchar1[i];
                    strchar1[i]=strchar1[j];
                    strchar1[j]=a;
                }
            }
        }
        return new String(strchar1);
    }
}
