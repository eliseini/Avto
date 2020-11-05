package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
  private String carrying;
    public Lorry(String marka,String classCar,String weight, String carrying){
        super(marka,classCar,weight);
        this.carrying=carrying;
    }

    Driver driver=new Driver("Andy", "9 years");
    Engine engine=new Engine("180 h/p", "Ford");

    @Override
    public void printInfo(){
        System.out.println("\nMarka avto "+this.marka);
        System.out.println("Class car "+ this.classCar);
        System.out.println("weigth car "+this.weight);
        System.out.println("Driver info "+driver);
        System.out.println("Engine info "+engine);
        System.out.println("Carrying " +carrying );
    }
    public String toString() {
        return "Lorry{" +
                "carrying='" + carrying + '\'' +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
