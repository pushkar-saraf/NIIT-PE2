package com.pe2.code;

public class Q2 {
    public boolean isPower(int number) {
        if (number > 4) {
            int a;
            a = number;
            while (true) {
                if (a > 4) {
                    if (a % 4 == 0) {
                        a = a / 4;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
            return a % 4 == 0;
        } else {
            return number == 1;
        }
    }
}
