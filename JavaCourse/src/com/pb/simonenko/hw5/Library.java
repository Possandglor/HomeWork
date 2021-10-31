package com.pb.simonenko.hw5;

public class Library {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Приключения","Иванов И.И.",2000),
                new Book("Словарь","Сидоров А.В.",1980),
                new Book("Энциклопедия","Гусев К.В.",2010),
        };
        Reader[] readers = {
                new Reader("Петров В.В",1,"ИТ","20.01.2000","456-23-22"),
                new Reader("Скорняк К.К.",2,"ИТ","02.11.1999","412-23-35"),
                new Reader("Эгегеев Э.Э.",3,"ИТ","15.04.2001","436-51-22"),
                new Reader("Клешня А.Я.",4,"ИТ","17.05.2000","456-23-15"),
                new Reader("Клешня И.Я.",5,"ИТ","17.05.2000","456-23-15"),
                new Reader("CustomLastName C.C.",6,"МММ","31.12.1999","123-45-67")
        };

        System.out.println();
        System.out.println("Книги: ");
        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println();
        System.out.println("Читатели: ");
        for (Reader reader : readers) {
            System.out.println(reader);
        }

        System.out.println();
        System.out.println("takeBook:");
        readers[0].takeBook(5);
        readers[1].takeBook(new String[] {books[0].name, books[1].name});
        readers[2].takeBook(new Book[] {books[0], books[1], books[2]});

        System.out.println();
        System.out.println("returnBook");
        readers[3].returnBook(5);
        readers[4].returnBook(new String[] {books[2].name, books[1].name, books[0].name});
        readers[5].returnBook(new Book[] {books[2], books[1], books[0]});
    }
}
