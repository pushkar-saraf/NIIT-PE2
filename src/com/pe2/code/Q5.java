package com.pe2.code;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students:");
        int N = 0;
        try{
            N = sc.nextInt();
        } catch (InputMismatchException ex){
            System.out.println("Invalid input");
        }
        int[] marks = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Enter the grade for student "+ i+1 + ":");
            try{
                marks[i] = sc.nextInt();
                if(marks[i]>100 || marks[i]<0){
                    System.out.println("Please enter a valid input between 0 to 100 again.");
                    i = i-1;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Invalid input. Retry!");
                i = i-1;
            }
        }
        int avg = 0;
        int max = 0;
        int min = 100;
        for (int mark : marks) {
            if(mark<min){
                min = mark;
            }
            if(mark>max){
                max = mark;
            }
            avg += mark;
        }
        avg = avg/N;
        System.out.println("The average is "+ avg);
        System.out.println("The minimum is "+ min);
        System.out.println("The maximum is "+ max);
    }
}
