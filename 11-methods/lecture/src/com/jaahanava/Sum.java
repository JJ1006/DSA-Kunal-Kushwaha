package com.jaahanava;

public class Sum {
    public static void main(String[] args) {
//        sum();
        int ans = sum2();
        System.out.println(ans);
    }

    static void sum(){
        int num1 = 1;
        int num2=2;
        int sum=num2+ num1;
        System.out.println(sum);
    }

    static int sum2(){
        int num1 = 10;
        int num2=20;
        int answer=num2+ num1;
        return answer;
    }

}
