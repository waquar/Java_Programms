package com.ListConcepts;

public class Employee {
    public String name;
    public int age;
    public String dept;

    public Employee(String name, int age, String dept){
        this.name = name;
        this.age = age;
        this.dept = dept;
        System.out.println("got data");
    }

    public String toString(){
        return this.name;
    }

}
