package com.company.professions;

public class Driver {
    private String name;
    private String drivingExperience;
    public Driver(String name, String drivingExperience){
        this.drivingExperience=drivingExperience;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", drivingExperience=" + drivingExperience +
                '}';
    }
}
