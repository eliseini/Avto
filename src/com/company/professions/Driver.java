package com.company.professions;

public class Driver extends Person {

    private String drivingExperience;
    public Driver(String name, int age, String drivingExperience){
        super(name, age);
        this.drivingExperience=drivingExperience;

    }
Person person=new Person();

    @Override
    public String toString() {
        return "{ Name ='" + name + '\'' +", Age = " + age + " years"+
                ", drivingExperience = '" + drivingExperience + '\'' +
                 '}';
    }
}



