package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.professions.Person;

public class SportCar extends Car{
    String maxSpeed;
    public SportCar(String marka, String classCar, String weight, String maxSpeed){
        super(marka,classCar,weight);
        this.maxSpeed=maxSpeed;
    }
    Driver driver=new Driver("Bill", 19, "12 years");
    Engine engine=new Engine("480 h/p", "Mclaren");

    @Override
    public void printInfo(){
        System.out.println("\nDriver info "+driver);
        System.out.println("Marka avto "+this.marka);
        System.out.println("Class car "+ this.classCar);
        System.out.println("weigth car "+this.weight);
        System.out.println("Engine info "+engine);
        System.out.println("Max speed " +maxSpeed );
    }
    public String toString() {
        return "SportCar{" +
                "maxSpeed='" + maxSpeed + '\'' +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
