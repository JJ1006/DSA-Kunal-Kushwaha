package com.jaahanava.assignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number:- ");
        int num = in.nextInt();
        int a = 1;

        for (int i = 1; i <=num; i++) {
            a = a * i;
        }
        System.out.println("The factorial is:- " + a);
    }
}
