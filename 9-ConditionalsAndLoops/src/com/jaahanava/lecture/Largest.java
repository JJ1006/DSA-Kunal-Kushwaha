package com.jaahanava.lecture;
// largest of 3 numbers
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the first number:- ");
        int firstNumber = in.nextInt();
        System.out.print("Please enter the second number:- ");
        int secondNumber = in.nextInt();
        System.out.print("Please enter the third number:- ");
        int thirdNumber = in.nextInt();


//        if (firstNumber > secondNumber && firstNumber > thirdNumber){
//            System.out.println("The greatest number is:- " + firstNumber);
//        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
//            System.out.println("The greatest number is:- " + secondNumber);
//        }
//        else {
//            System.out.println("The greatest number is:- " + thirdNumber);
//        }

//        int max=firstNumber;
//        if(secondNumber > max){
//            max=secondNumber;
//        } else if (thirdNumber > max) {
//            max=thirdNumber;
//        }
//
//        System.out.println("The greatest number is:- " + max);


        int max = Math.max(firstNumber, secondNumber);

        int newMax = Math.max(max,thirdNumber);

        System.out.println("The greatest number is:- " + newMax);


    }
}