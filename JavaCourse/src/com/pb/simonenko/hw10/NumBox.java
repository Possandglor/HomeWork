package com.pb.simonenko.hw10;

public class NumBox<T extends Number> {
    T[] t;
    int maxSize=0;
    public NumBox(int maxSixe) {
        this.maxSize=maxSixe;
    }
    public void add(T num) //добавляющий число в массив. В случае если массив полон - выбросить исключение.
    {

    }
    public T get(int index)// возвращающий число по индексу.
    {
        return t[0];
    }
    public int length() //возвращает текущее количество элементов.
    {

        return 2;
    }
    public double average()// - подсчет среднего арифметического среди элементов массива.
    {

        return 2;
    }
    public double sum() //- сумма всех элементов массива.
    {
        return 2;
    }
    public T max() //- максимальный элемент массива.
    {
        return  t[0];
    }
}
