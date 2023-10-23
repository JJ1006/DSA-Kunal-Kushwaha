package com.jaahanava.lecture;

import java.util.Scanner;

public class Reverse{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number to be reversed:- ");
        int number = in.nextInt();
        int answer = 0;
        while(number>0){
            int rem = number % 10;
            answer = answer * 10 + rem;
            number = number/10;
        }
        System.out.println("The reversed number is:- " + answer);
    }
}
