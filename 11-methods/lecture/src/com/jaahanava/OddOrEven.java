package com.jaahanava;

import java.util.*;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number:- ");
        int num = in.nextInt();
        boolean ans = doCheck(num);
        if(ans == false){
            System.out.println("The number is even!");
        }
        else{
            System.out.println("The number is odd!");
        }
    }

    public static boolean doCheck(int number){
        if(number % 2 == 0){
            return false;
        }
        return true;
    }


}
