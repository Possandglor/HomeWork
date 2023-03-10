package com.pb.simonenko.hw11;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {
    private static List<Contact> contactList = new ArrayList<Contact>(){ };
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        contactList.add(new Contact("1","1",new ArrayList<String>(){},"1"));
        contactList.get(0).addPhone("1");
        contactList.get(0).addPhone("11");
        contactList.add(new Contact("2","2",new ArrayList<String>(){},"2"));
        contactList.get(1).addPhone("2");
        contactList.add(new Contact("3","3",new ArrayList<String>(){},"3"));
        contactList.get(2).addPhone("3");
        int exit = 0;
        while (exit == 0)
        {
            System.out.flush();
            System.out.println("\n\n1. Новый контакт\n2. Удалить контакт\n3. Найти контакт\n4. Список контактов\n5. Изменить контакт\n6. Записать в файл\n7. Вычитать контакты из файла\n0. Выход\n1");
            int i = scanner.nextInt();
            scanner.nextLine();
            switch (i)
            {
                case 1:

                    addContact();
                    break;
                case 2:
                    deleteContact();
                    break;
                case 3:
                    searchContact();
                    break;
                case 4:
                    printContacts();
                    break;
                case 5:
                    editContact();
                    break;
                case 6:
                    toFileContacts();
                    break;
                case 7:
                    fromFileContacts();
                    break;
                case 0:
                    exit=1;
                    break;
                default:break;
            }
        }

    }

    static void addContact()
    {
        System.out.flush();
        System.out.println("Введите ФИО: ");
        String fio1 = scanner.nextLine();
        System.out.println("Введите дату рождения: ");
        String dateBD = scanner.nextLine();
        System.out.println("Введите телефоны через запятую: ");
        List<String> phones = List.of(scanner.nextLine().split(","));
        System.out.println("Введите адрес: ");
        String address = scanner.nextLine();
        contactList.add(new Contact(fio1,dateBD,phones,address));
        System.out.println("Контакт добавлен.");
    }
    static void deleteContact()
    {
        for (int i = 0; i < contactList.stream().count(); i++) {
            System.out.println((i+1)+": "+contactList.get(i).toString());
        }
        System.out.println("Введите номер контакта, который хотите удалить: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        contactList.remove(id-1);
        System.out.println("Контакт удален.");
    }
    static void searchContact()
    {
        System.out.println("По какому полю поиск:\n1. ФИО\n2.Дата рождения\n3. Номер телефона\n4. Адрес");
        int id = scanner.nextInt();
        scanner.nextLine();
        int searchedId = -1;
        switch (id)
        {
            case 1:
                System.out.println("Введите фио для поиска: ");
                String fio = scanner.nextLine();
                for (int i = 0; i < contactList.stream().count(); i++) {
                    if(contactList.get(i).getFio().equals(fio))
                        searchedId = i;
                }
                break;
            case 2:
                System.out.println("Введите дату рождения для поиска: ");
                String dateBD = scanner.nextLine();
                for (int i = 0; i < contactList.stream().count(); i++) {
                    if(contactList.get(i).getDateBD().equals(dateBD))
                        searchedId = i;
                }
                break;
            case 3:
                System.out.println("Введите телефон для поиска: ");
                String phone = scanner.nextLine();
                for (int i = 0; i < contactList.stream().count(); i++) {
                    if(contactList.get(i).getPhones().contains(phone))
                        searchedId = i;
                }
                break;
            case 4:
                System.out.println("Введите Адрес для поиска: ");
                String address = scanner.nextLine();
                for (int i = 0; i < contactList.stream().count(); i++) {
                    if(contactList.get(i).getAddress().equals(address))
                        searchedId = i;
                }
                break;
        }
        if(searchedId!=-1)
            contactList.get(searchedId).toString();
        else System.out.println("Контакт не найден.");
    }

    static void printContacts()
    {
        for (int i = 0; i < contactList.stream().count(); i++) {
            System.out.println((i+1)+": "+contactList.get(i).toString());
        }
    }
    static void editContact()
    {
        for (int i = 0; i < contactList.stream().count(); i++) {
            System.out.println((i)+": "+contactList.get(i).toString());
        }
        System.out.println("Введите номер контакта, который хотите редактировать: ");
        int i = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Выберите поле для редактирования:\n1. ФИО\n2.Дата рождения\n3. Номер телефона\n4. Адрес");
        int id = scanner.nextInt();
        scanner.nextLine();
        switch (id)
        {
            case 1:
                System.out.println("Введите новое фио: ");
                String fio = scanner.nextLine();
                contactList.get(i).setFio(fio);
                break;
            case 2:
                System.out.println("Введите новую дату рождения: ");
                String dateBD = scanner.nextLine();
                contactList.get(i).setDateBD(dateBD);
                break;
            case 3:
                for (int j = 0; j < contactList.get(i).getPhones().stream().count(); j++) {
                    System.out.println((j+1)+": "+contactList.get(i).getPhones().get(j));
                }
                System.out.println("Введите порядковый номер телефона, который хотите отредактировать: ");
                int phoneNum = scanner.nextInt();
                scanner.nextLine();
                System.out.println("1. Удалить\n2. Редактировать");
                int how = scanner.nextInt();
                scanner.nextLine();
                switch (how)
                {
                    case 1:
                        contactList.get(i).deletePhone(contactList.get(i).getPhones().get(phoneNum));
                        break;
                    case 2:
                        System.out.println("Введите новый телефон: ");
                        String newPhone = scanner.nextLine();
                        contactList.get(i).deletePhone(contactList.get(i).getPhones().get(phoneNum));
                        contactList.get(i).addPhone(newPhone);
                        break;
                }
                break;
            case 4:
                System.out.println("Введите новый адрес: ");
                String address = scanner.nextLine();
                contactList.get(i).setAddress(address);
                break;
        }
    }

    static void toFileContacts() throws IOException {
        String textToWrite ="";
        for (int i = 0; i < contactList.stream().count(); i++) {
            textToWrite+=contactList.get(i).getFio()+"|"+
                    contactList.get(i).getDateBD()+"|"+
                    String.join(",",contactList.get(i).getPhones())+"|"+
                    contactList.get(i).getAddress()+"|"+
                    contactList.get(i).getRedactTime();
            if(i!=contactList.stream().count())
            textToWrite+="\n";
        }
        System.out.println(textToWrite);
        if(!Files.exists(Path.of("contactBook.txt")))
            Files.createFile(Path.of("contactBook.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("contactBook.txt"));
        writer.append(textToWrite);
        writer.close();
        System.out.println("Создан файл: "+Path.of("contactBook.txt").toAbsolutePath());

    }
    static void fromFileContacts() throws IOException {
        String textFromFile = Files.readString(Path.of("contactBook.txt")).trim();
        contactList.clear();
            String[] str = textFromFile.split("\n");
            for (int j = 0; j < str.length; j++) {
            contactList.add(new Contact(str[j].split("|")[0],
                    str[j].split("|")[1],
                    Arrays.asList(str[j].split("|")[2].split(",")),
                    str[j].split("|")[3]));
            }
        System.out.println("Книга экспортирована");
    }
}
