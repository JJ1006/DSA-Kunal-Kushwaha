package com.jaahanava.lecture;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the word or character:- ");
        char ch = in.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("It is Lowercase");
        }
        else {
            System.out.println("It is Uppercase");
        }
    }
}
