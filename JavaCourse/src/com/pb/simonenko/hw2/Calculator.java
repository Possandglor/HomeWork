package com.pb.simonenko.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First element: ");
        int firstNum = scan.nextInt();
        System.out.println("Second element: ");
        int secondNum = scan.nextInt();

        System.out.println("Operation (+,-,*,/) : ");
        String operation = scan.next();

        switch (operation)
        {
            case "+":
                System.out.printf("%d + %d = %d",firstNum,secondNum,firstNum+secondNum);
                break;
            case "-":
                System.out.printf("%d - %d = %d",firstNum,secondNum,firstNum-secondNum);
                break;
            case "*":
                System.out.printf("%d * %d = %d",firstNum,secondNum,firstNum*secondNum);
                break;
            case "/":
                if(secondNum!=0)
                System.out.printf("%d / %d = %d",firstNum,secondNum,firstNum/secondNum);
                else {
                    System.out.println("Wrong! Division by zero.");
                }
                break;
        }
    }

}
