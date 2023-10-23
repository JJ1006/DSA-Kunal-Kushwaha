package com.jaahanava;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the starting number: ");
        int start = in.nextInt();
        System.out.print("Please enter the end number:- ");
        int end = in.nextInt();
        primeGenerator(start,end);
    }

    public static void primeGenerator(int start, int end){
        for (int i = start; i < end; i++) {
        if (isPrime(i)){
            System.out.print(i + " ");
        }
        }
    }

    public static boolean isPrime(int number){
        if (number < 1){
//            System.out.println("in 1");
            return false;
        }
        if (number < 3){
//            System.out.println("in 2 or 3");
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0){
//            System.out.println("divide by 2 or 3");
            return false;
        }

        for (int i = 5; i * i < number; i+=6) {
            if (number % i == 0 || number % (i + 2) == 0){
                return false;
            }
        }

        return true;
    }

}
