package com.jaahanava;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter first number:- ");
        int a = in.nextInt();
        System.out.println("Please enter second number:- ");
        int b = in.nextInt();

        swapNow(a,b);
    }
    
    public static void swapNow(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a:- " + a + " b:- " + b);
    }
}
