package com.pb.simonenko.hw5;

public class Book {
    private String name;
    private String author;
    private int year;

    public String getName(){return name;}
    public String getAuthor(){return author;}
    public int getYear(){return year;}
    public void setName(String name){this.name=name;}
    public void setAuthor(String author){this.author=author;}
    public void setYear(int year){this.year=year;}
    public Book(String name, String author, int year)
    {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String toString()
    {
        return name+", "+author+", "+year;
    }
}
