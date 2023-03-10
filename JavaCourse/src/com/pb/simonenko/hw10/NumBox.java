package com.pb.simonenko.hw10;

import java.util.Arrays;

public class NumBox<T extends Number> {
    T[] t ;
    int maxSize=0;
    int nowSize = 0;
    public NumBox(int maxSize) {
        t = (T[]) new Number[maxSize];
        this.maxSize = maxSize;
    }
    public void add(T num) //добавляющий число в массив. В случае если массив полон - выбросить исключение.
    {
        try {
            if (maxSize == nowSize) {
                throw new Exception("Превышен размер массива");
            }
            else {
                t[nowSize] =  num;
                nowSize++;
            }
        }
        catch ( Exception ex){
            System.out.println(ex);
        }
    }
    public T get(int index)// возвращающий число по индексу.
    {
        return t[index];
    }
    public int length() //возвращает текущее количество элементов.
    {
        return nowSize;
    }
    public double average()// - подсчет среднего арифметического среди элементов массива.
    {

        if(t[0] instanceof Integer) {
            double a = 0;
            for(int i = 0; i< nowSize; i++)
                a+=(int) t[i];
            return a*1.0/nowSize;
        }
        else if(t[0] instanceof Double)
        {
            double a = 0;
            for(int i = 0; i< nowSize; i++)
                a+=(double) t[i];
            return a/nowSize;
        }
        else{
            float a = 0;
            for(int i = 0; i< nowSize; i++)
                a+=(float) t[i];
            return a/nowSize;
        }
    }
    public double sum() //- сумма всех элементов массива.
    {

        if(t[0] instanceof Integer) {
            int a = 0;
            for (int i = 0; i < nowSize; i++)
                a += (int) t[i];
            return a;
        }
        else if(t[0] instanceof Double)
        {
            double a = 0;
            for (int i = 0; i < nowSize; i++)
                a += (double) t[i];
            return a;
        }
        else{
            float a = 0;
            for (int i = 0; i < nowSize; i++)
                a += (float) t[i];
            return a;
        }
    }
    public T max() //- максимальный элемент массива.
    {
        T temp = t[0];
        if(temp instanceof Integer)
        for(int i = 1; i< nowSize; i++) {
            if ((int) temp < (int) t[i])
                temp = t[i];
        }
            else if(temp instanceof Double) {
            for (int i = 1; i < nowSize; i++) {
                if ((double) temp < (double) t[i])
                    temp = t[i];
            }
        }
            else {
            for(int i = 1; i< nowSize; i++) {
                if ((float) temp < (float) t[i])
                    temp = t[i];
            }
        }
        return  temp;
    }
}
