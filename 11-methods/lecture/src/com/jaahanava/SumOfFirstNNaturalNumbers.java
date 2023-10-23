package com.jaahanava;

import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number:- ");
        int num = in.nextInt();

        totalSum(num);
    }

    public static void totalSum(int number){
        int answer = 0;
        for (int i = 0; i < number + 1; i++) {
            answer = answer + i;
        }
        System.out.println(answer);
    }
}
