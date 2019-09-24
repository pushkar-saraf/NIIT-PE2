package com.pe2.code;

public class Q6 {
    public static void main(String[] args) {
        System.out.println("Int Factorials!");
        intFactorials(1, 1);
        System.out.println();
        System.out.println("Long Factorials!");
        longFactorials(1,1);
    }

    private static void intFactorials(int number, int factorialLast){
        int factorial = factorialLast * number;
        if (factorialLast == factorial/number){
            System.out.println("Factorial of "+ number + " is " + factorial);
            intFactorials(number+1, factorial);
        } else {
            System.out.println("Factorial of "+ number + " is out of range");
        }
    }

    private static void longFactorials(long number, long factorialLast){
        long factorial = factorialLast * number;
        if (factorialLast == factorial/number){
            System.out.println("Factorial of "+ number + " is " + factorial);
            longFactorials(number+1, factorial);
        } else {
            System.out.println("Factorial of "+ number + " is out of range");
        }
    }
}
