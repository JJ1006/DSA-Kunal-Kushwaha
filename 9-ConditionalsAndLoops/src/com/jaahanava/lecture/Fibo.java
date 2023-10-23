package com.jaahanava.lecture;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the number:- ");
        int n = in.nextInt();

        int previousIndex = 0;
        int currentIndex = 1;
        int count = 2;

        if(n==0){
            currentIndex = 0;
        }

        else {

        while (count <=n ){
            int temp = currentIndex;
            currentIndex = currentIndex + previousIndex;
            previousIndex = temp;
            count = count+1;
        }
        }

        System.out.println("The answer is:- " + currentIndex);
    }
}
