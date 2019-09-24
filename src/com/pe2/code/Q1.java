package com.pe2.code;
public class Q1 {
    public String getReverse(String input){
        StringBuilder output = new StringBuilder();
        output.append(input);
        output.reverse();
        return output.toString();
    }

    public boolean isPalindrome(String input){
        return input.equals(getReverse(input));
    }
}
