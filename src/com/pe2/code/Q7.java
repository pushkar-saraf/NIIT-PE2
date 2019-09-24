package com.pe2.code;

public class Q7 {
    public static void main(String[] args) {
        User user = new User("Pushkar", "Saraf", 12, 15000.2f);
        System.out.println("Is it valid?" +user.isValidAge());
    }
}

class User {
    String firstname;
    String lastname;
    int age;
    float salary;

    public User(String firstname, String lastname, int age, float salary){
        this.firstname = firstname;
        this.lastname = lastname;
        if(age<0||age>100) {
        } else {
            this.age = age;
        }
        this.salary = salary;
    }

    public boolean isValidAge(){
        return age<=60&&age>=18;
    }
    public String getFullName(){
        return this.firstname+" "+this.lastname;
    }
}