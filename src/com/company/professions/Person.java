package com.company.professions;

public class Person {
    protected String name;
    protected int age;
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public Person(){}

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

