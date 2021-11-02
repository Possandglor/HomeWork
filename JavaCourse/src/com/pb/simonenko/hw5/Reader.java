package com.pb.simonenko.hw5;

public class Reader {
    String FIO;
    int ticketNumber;
    String facultet;
    String dateBirthday;
    String phoneNumber;

    public void takeBook(int num)
    {
        System.out.println(FIO+" взял "+num+" книг(и)");
    }

    public void takeBook(String[] names)
    {
        System.out.print(FIO+" взял книги: ");
        for(int i = 0; i<names.length;i++)
        {
            System.out.print(names[i]);
            if(i!=names.length-1)
                System.out.print(", ");
            else System.out.println();
        }
    }
    public void takeBook(Book[] books)
    {
        System.out.print(FIO+" взял книги: ");
        for(int i = 0; i<books.length;i++)
        {
            System.out.printf("%s (%s %dг)", books[i].getName(), books[i].getAuthor(),books[i].getYear());
            if(i!=books.length-1)
                System.out.print(", ");
            else System.out.println();
        }
    }

    public void returnBook(int num)
    {
        System.out.println(FIO+" вернул "+num+" книг(и)");
    }

    public void returnBook(String[] names)
    {
        System.out.print(FIO+" вернул книги: ");
        for(int i = 0; i<names.length;i++)
        {
            System.out.print(names[i]);
            if(i!=names.length-1)
                System.out.print(", ");
            else System.out.println();
        }
    }
    public void returnBook(Book[] books)
    {
        System.out.print(FIO+" вернул книги: ");
        for(int i = 0; i<books.length;i++)
        {
            System.out.printf("%s (%s %dг)", books[i].getName(), books[i].getAuthor(),books[i].getYear());
            if(i!=books.length-1)
                System.out.print(", ");
            else System.out.println();
        }
    }


    public Reader(String FIO, int ticketNumber, String facultet, String dateBirthday, String phoneNumber)
    {
        this.FIO = FIO;
        this.ticketNumber = ticketNumber;
        this.facultet = facultet;
        this.dateBirthday = dateBirthday;
        this.phoneNumber = phoneNumber;
    }

    public String toString()
    {
        return FIO+", "+ticketNumber+", "+facultet+", "+dateBirthday+", "+phoneNumber;
    }
}
