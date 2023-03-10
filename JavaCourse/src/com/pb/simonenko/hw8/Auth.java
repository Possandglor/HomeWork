package com.pb.simonenko.hw8;

public class Auth {
    private String login;
    private String password;

    public void signUp(String login,String password) {
        try {
            if (password.length() < 6 || !password.matches("^[a-zA-Z0-9_]+")) {
                throw new WrongPasswordException("Не верный пароль");
            }
            else this.password = password;
            if(login.length()<6||login.length()>20||!login.matches("^[a-zA-Z0-9]+"))
            {
                throw new WrongLoginException("Не верный логин");
            }
            else {
                this.login=login;
                System.out.println("Успешная регистрация!");
            }
        } catch (Exception ex)
        {
            System.out.println(ex.toString());
        }
    }

    public void signIn(String login,String password)
    {
        try {
            if (login == this.login && password == this.password) {
                System.out.println("Успешная авторизация!");
            }
            else throw new WrongLoginException("Ошибка");
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }
}
