package com.pe2.code;

public class MemberVariable {
    public static void main(String[] args) {
        Member member = new Member("Harry Potter", 30, 2500.3f);
        member.displayVariables();
    }
}

class Member {
    private String name;
    private int age;
    private float salary;

    Member(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void displayVariables() {
        System.out.println("Output");
        System.out.println("Member's Name: " + this.name);
        System.out.println("Member's Age: " + this.age);
        System.out.println("Member's Salary: " + this.salary);
    }
}
