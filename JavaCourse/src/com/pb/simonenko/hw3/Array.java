package com.pb.simonenko.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int countPlus = 0;
        for(int i =0; i<10;i++)
        {
            System.out.print("Введите "+(i+1)+" элемент массива: ");
            arr[i] = scanner.nextInt();
            sum+=arr[i];
            if(arr[i]>0)
                countPlus++;
        }
        for(int i =0; i<10;i++)
            System.out.print(arr[i]+" ");
        System.out.println("Сумма элементов: "+sum);
        System.out.println("Количество положительных: "+countPlus);
        for (int i = 1; i<10;i++)
        {
            for(int j = 0;j<10;j++)
            {
                if(arr[j]>arr[i])
                {
                    int c = arr[j];
                    arr[j]=arr[i];
                    arr[i]=c;
                }
            }
        }
        System.out.println("Отсортированный массив: ");
        for(int i =0; i<10;i++)
            System.out.print(arr[i]+" ");
    }
}
