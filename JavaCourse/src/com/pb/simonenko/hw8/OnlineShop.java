package com.pb.simonenko.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Auth auth = new Auth();
        Scanner scan = new Scanner(System.in);
        System.out.print("Login: ");
        String login = "Simonenko1";//scan.next();
        System.out.println("Password: ");
        String password = "Vlad123";//scan.next();


        String wrongLogin = "A123";
        String wrongPassword ="1111";


        ///Правильная регистрация
        System.out.println("Регистрация: ");
        auth.signUp(login, password);

        //Правильная авторизация
        System.out.println("Авторизация: ");
        auth.signIn(login, password);

        // Неправильная авторизация
        //Неправильный логин
        System.out.println("Wrong login aвторизация: ");
        auth.signIn(wrongLogin, password);

        //Неправильынй пароль
        System.out.println("Wrong password aвторизация: ");
        auth.signIn(login, wrongPassword);


        //Неправильная регистрация
        //Неправильный логин
        System.out.println("Wrong login регистрация: ");
        auth.signUp(wrongLogin, password);

        //неправильный пароль
        System.out.println("Wrong password pегистрация: ");
        auth.signUp(login, wrongPassword);
    }
}
