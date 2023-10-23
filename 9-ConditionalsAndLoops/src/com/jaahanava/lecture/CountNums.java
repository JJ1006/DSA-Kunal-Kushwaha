package com.jaahanava.lecture;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the number:- ");
        int number = in.nextInt();
        int actualNumber = number;
        System.out.println("Please enter the digit you want to find:- ");
        int digit = in.nextInt();

        int count = 0;

        while(number>0){
            int temp = number % 10;
            if (temp==digit){
                count = count + 1;
            }
            number = number/10;
        }

        System.out.println("The repetition of " + digit + " is " + count + " times in the number " + actualNumber);
    }
}
